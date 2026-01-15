/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bendz
 */
public class Predmet {
    private static final Pattern PATTERN= Pattern.compile("^([A-Z][a-z]*(\\s?))+$");

    private String imePredmeta;
    private final String kodaPredmeta;
    private Profesor nosilecPredmeta;
    private List<Student> prijavljeniStudenti;
    
    
    //Validation methods 
    private static void validateImePredmeta(String ime) {
        Objects.requireNonNull(ime, "Ime ne more biti null");
        Matcher mathcer = PATTERN.matcher(ime);
        if (!mathcer.matches()) {
            throw new IllegalArgumentException("Ime in Priimek nista pravilna ");
        }
    }
    
    public Predmet(String imePredmeta, String koda, Profesor p) {
        validateImePredmeta(imePredmeta);
        
        this.imePredmeta=imePredmeta;
        this.kodaPredmeta=koda;
        this.nosilecPredmeta=p;
        this.prijavljeniStudenti = new ArrayList<>();
    } 
    
    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        validateImePredmeta(imePredmeta);
        this.imePredmeta = imePredmeta;
    }

    public String getKodaPredmeta() { 
        return kodaPredmeta;
    }
    
    public void dodajStudenta(Student s) {
        Objects.requireNonNull(s,"Student ne more biti null");
        if( !this.prijavljeniStudenti.contains(s)) {
            this.prijavljeniStudenti.add(s);
        }else {
            System.out.println("Student je ze prijavljen v predmetu");
        }
    }
    
    public void odstraniStudenta(Student s) {
        Objects.requireNonNull(s,"Student ne more biti null");
        boolean removed = prijavljeniStudenti.remove(s);
        if (!removed) {
           System.out.println("Student ne obstaja v seznamu");
        }
    }
    public void izpisPodatkov() {
        System.out.println("Predmet:"+this.imePredmeta+" "
                + "koda predmeta : "+this.kodaPredmeta+" "
                        + "nosilec predmeta "+this.nosilecPredmeta.getIme()+" "+this.nosilecPredmeta.getPriimek());
        if(prijavljeniStudenti.isEmpty()) {
            System.out.println("Ni prijavljenih studentov");
        }else {
            for (Student s : prijavljeniStudenti) {
                System.out.println("Student : "+s.getIme()+" "+s.getPriimek()+" "+s.getVpisnaStevilka());
            }
        }
    }

    public Profesor getNosilecPredmeta() {
        return nosilecPredmeta;
    }

    public void setNosilecPredmeta(Profesor nosilecPredmeta) {
        Objects.requireNonNull(nosilecPredmeta,"Nosilec predmeta ne more biti null");
        this.nosilecPredmeta = nosilecPredmeta;
    }

    public List<Student> getPrijavljeniStudenti() {
        return Collections.unmodifiableList(prijavljeniStudenti);
        
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.kodaPredmeta);
        return hash;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Predmet other = (Predmet) obj;
        return Objects.equals(this.kodaPredmeta, other.kodaPredmeta);
    }
    
}
