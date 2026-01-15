/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.time.LocalDate;

/**
 *
 * @author bendz
 */
public class Izpit {
    private int ocena;
    private Predmet predmet;
    private Student s;
    private LocalDate datum;

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

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
    
    
    public String getOpis() {
        return"";
    }
}
