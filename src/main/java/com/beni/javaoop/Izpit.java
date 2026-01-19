/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author bendz
 */
public class Izpit {
    private int ocena;
    private final Predmet predmet;
    private final Student s;
    private final LocalDate datum;

    public Izpit(int ocena, Predmet predmet, Student s, LocalDate datum) {
        Objects.requireNonNull(predmet, "Predmet ne more biti null");
        Objects.requireNonNull(s,"Student ne more biti null");
        this.setOcena(ocena);
        
        this.predmet = predmet;
        this.s = s;
        this.datum = datum;
    }

    
    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if( ocena < 5 || ocena > 10) {
            throw new IllegalArgumentException("Nepravilna ocena");
        }
        
        this.ocena = ocena;
    }

    public Predmet getPredmet() {
        return predmet;
    }

   

    public Student getS() {
        return s;
    }

    

    public LocalDate getDatum() {
        return datum;
    }

  
    
    public String getOpis() {
        return" Student: "+s.getOpis()+" je pri predmetu : "+predmet.getImePredmeta()+" Dne :"+this.datum+" dosegel oceno"+this.ocena;
    }
}
