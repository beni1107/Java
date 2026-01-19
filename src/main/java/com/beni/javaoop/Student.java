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
public class Student extends Oseba {
    private static final Pattern VP_PATTERN = Pattern.compile("^\\d{4}$");
    
    private String vpisnaStevilka;
    private int letnik;
    private List<Predmet> predmeti;
    private List<Izpit> ocene;
    
    public Student (String ime, String priimek,String emso, String email, int letoRojstva, String telStevilka, String vp, int letnik) {
       super(ime, priimek, emso, email, letoRojstva, telStevilka);
        validateVP(vp);
        validateLetnik(letnik);
        this.vpisnaStevilka=vp;
        this.letnik=letnik;
        predmeti = new ArrayList<>();
        ocene = new ArrayList<>();
    }
    
    // VALIDATION METHODS
    private static void validateVP(String vp) {
        Objects.requireNonNull(vp,"Vpisna stevilka ne more biti null!");
        Matcher matcher = VP_PATTERN.matcher(vp);
        if(! matcher.matches()) {
            throw new IllegalArgumentException("Vpisna stevilka ni pravilna");
        }
    }
    
    private static void validateLetnik(int letnik) {
        if( letnik < 1  || letnik >4 ) {
                throw new IllegalArgumentException("Letnik ni pravilen!");
        }
    }
    
    
    @Override
    public String getOpis() {
        return "Student : "+this.getIme()+" "+
                this.getPriimek()+" \nEMSO : "+
                this.getEMSO()+" VPisna : "+this.getVpisnaStevilka()+" \nLetnik :"+
                this.getLetnik();
    }
    
    public double getPovprecje() {
        double sum=0;
        int count = 0;
        for( Izpit i : this.ocene) {
            if(i.getOcena() > 6) {
                sum+=i.getOcena();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum/count;
    }
    public void getIzpisPodatkov() {
        System.out.println(this.getOpis());
        System.out.println("\t ---PRIJAVLJENI PREDMETI---");
        if( !predmeti.isEmpty()) {
            for( Predmet p : predmeti) {
                System.out.println(p.getImePredmeta()+" "+p.getKodaPredmeta());
            }
        }else {
                System.out.println("Student ni prijavljen na noben predmet");
        } 
        System.out.println("\t ---OPRAVLJENI IZPITI---");
        if(!ocene.isEmpty()) {
            for( Izpit i : ocene) {
                System.out.println("Predmet :"+i.getPredmet().getImePredmeta()+" Koda "+i.getPredmet().getKodaPredmeta());
                System.out.println("Ocena :"+i.getOcena());
            }
        }else { System.out.println("Ni opravljenih izpitov.");
               
        }
        System.out.println("\nPOVPREČNA OCENA: " + this.getPovprecje());
            
        
    }
    public String getVpisnaStevilka() {
        return vpisnaStevilka;
    }

    public void setVpisnaStevilka(String vpisnaStevilka){
        validateVP(vpisnaStevilka);
        this.vpisnaStevilka = vpisnaStevilka;
    }

    public int getLetnik() {
        return letnik;
    }

    public void setLetnik(int letnik) {
        validateLetnik(letnik);
        this.letnik = letnik;
    }

    public List<Predmet> getPredmeti() {
        return Collections.unmodifiableList(this.predmeti);
    }

    public void dodajPredmet(Predmet p) {
        Objects.requireNonNull(p, "Predmet ne more biti null");
        
            if (predmeti.contains(p)) {
                throw new IllegalArgumentException("Ta predmet ze obstaja");
            }
           this.predmeti.add(p);
    }

    public List<Izpit> getOcene() {
        return Collections.unmodifiableList(this.ocene);
    }

    public void dodajOceno(Izpit ocena) {
       Objects.requireNonNull(ocena,"Ocene ne more biti null");
       if(this.ocene.contains(ocena)) {
           throw new IllegalArgumentException("Ocena ze obstaja");
       }
       
       this.ocene.add(ocena);
    }

    @Override
    public int hashCode() {
        
        int hash = super.hashCode();
        hash = 67 * hash + Objects.hashCode(this.vpisnaStevilka);
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
          if(!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.vpisnaStevilka, other.vpisnaStevilka);
    }
    
   
}
