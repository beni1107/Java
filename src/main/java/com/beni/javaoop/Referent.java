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
public class Referent extends Oseba{
    private String podrocjeOdgovornosti; // prijave,ocene
    private List<Predmet> predmeti;
    private List<Student> studenti;
    private List<Profesor> profesor;

    
    
    public Referent(String podrocjeOdgovornosti, String ime, String priimek, String emso, String email, int letoRojstva, String telStevilka) {
        super(ime, priimek, emso, email, letoRojstva, telStevilka);
        this.podrocjeOdgovornosti = podrocjeOdgovornosti;
        
        this.predmeti=new ArrayList<>();
        this.studenti=new ArrayList<>();
        this.profesor=new ArrayList<>();
    }

    public void dodajPredmet(Predmet p) {
        Objects.requireNonNull(p, "Predmet ne more biti null");
        if(!this.predmeti.contains(p)) {
            this.predmeti.add(p);
        }else {
            System.out.println("Predmet ze obstaja");
        }
    }
    
    public void dodajStudenta(Student s) {
        Objects.requireNonNull(s," Student ne more biti null");
        if(!this.studenti.contains(s)) {
            this.studenti.add(s);
        }else {
            System.out.println(" Ta student ze obstaja");
        }
    }
    
    public void dodajProfesorja(Profesor p) {
        Objects.requireNonNull(p, "Profesor ne more biti null");
        if(!this.profesor.contains(p)) {
            this.profesor.add(p);
        }else {
            System.out.println("Profesor ze obstaja");
        }
    }

    @Override
    public String getOpis() {
       return "REFERENT : "+this.getIme()+" "+this.getPriimek()+" PODROCJE: "+this.getPodrocjeOdgovornosti();
    }
    
    public void izpisPodatkov() {
        System.out.println("\t--- IZPIS VSEH PODATKOV ---");
        for(Predmet p : predmeti) {
            p.izpisPodatkov();
        }
    }
    
    public void izpisiOdlicnjake(){
        System.out.println("---ODLICNJAKI---");
        for(Student s : studenti) {
            
            if(s.getPovprecje()>9.01) {
               s.getIzpisPodatkov();
            }
        }
    }
    public String getPodrocjeOdgovornosti() {
        return podrocjeOdgovornosti;
    }

    public void setPodrocjeOdgovornosti(String podrocjeOdgovornosti) {
        Objects.requireNonNull(podrocjeOdgovornosti,"Podrocje ne more biti null");
        this.podrocjeOdgovornosti = podrocjeOdgovornosti;
    }

    public List<Predmet> getPredmeti() {
        return Collections.unmodifiableList(predmeti);
    }

   

    public List<Student> getStudenti() {
        return Collections.unmodifiableList(studenti);
    }

    public List<Profesor> getProfesor() {
        return Collections.unmodifiableList(profesor);
    }
}
