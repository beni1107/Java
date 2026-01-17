/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author bendz
 */
public class Profesor extends Oseba {
    private String katedra;
    private List<Predmet> predmeti;
    private List<Student> studenti;

    public Profesor(String katedra, String ime, String priimek, String emso, String email, int letoRojstva, String telStevilka) {
        super(ime, priimek, emso, email, letoRojstva, telStevilka);
        this.katedra = katedra;
        this.predmeti = new ArrayList<>();
        this.studenti = new ArrayList<>();
    }
    
    
    
    
    public void dodajPredmet(Predmet predmet) {
        Objects.requireNonNull(predmet," Predmet ne more biti null");
        if (!this.predmeti.contains(predmet)) {
            this.predmeti.add(predmet);
        }else {
            System.out.println("Ta predmet ze obstaja");
        }
    }
    
    @Override
    public String getOpis() {
       return "Profesor : "+this.getIme()+" "+
                this.getPriimek()+" \nEMSO : "+
                this.getEMSO()+" Katedra : "+this.katedra;
    }
       
    }
    
    public void getIzpisPodatkov() {
        System.out.println("\t--- PREDMETI PROFESORJA---");
        if(!predmeti.isEmpty()) {
            for(Predmet p : predmeti) {
                System.out.println(p.getImePredmeta()+" "+p.getKodaPredmeta());
                System.out.println("--VPISANI STUDENTI--");
                for (Student s : studenti) {
                    if(s.getPredmeti().contains(p)) {
                        System.out.println(s.getOpis());
                    }
                }
            }
        }
    } 

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        Objects.requireNonNull(katedra,"Katedra ne more biti null");
        this.katedra = katedra;
    }

    public List<Predmet> getPredmeti() {
        return Collections.unmodifiableList(predmeti);
    }

    public List<Student> getStudenti() {
        return Collections.unmodifiableList(studenti);
    }
    
}
