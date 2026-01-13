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
    private static final Pattern VP_PATTERN = Pattern.compile("^\\d{6}$");
    
    private String vpisnaStevilka;
    private int letnik;
    private List<Predmet> predmeti;
    private List<Izpit> ocene;
    
    // VALIDATION METHODS
    private static void validateVP(String vp) {
        Objects.requireNonNull(vp,"Vpisna stevilka ne more biti null!");
        Matcher matcher = VP_PATTERN.matcher(vp);
        if(! matcher.matches()) {
            throw new IllegalArgumentException("Vpisna stevilka ni pravilna");
        }
    }
    
    private static void validateLetnik(int letnik) {
        if( letnik < 1  && letnik >4 ) {
                throw new IllegalArgumentException("Letnik ni pravilen!");
        }
    }
    
    
    @Override
    public String getOpis() {
        return "";
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

    public void addPredmet(Predmet p) {
        Objects.requireNonNull(p, "Predmet ne more biti null");
        
            if (predmeti.contains(p)) {
                throw new IllegalArgumentException("Ta predmet ze obstaja");
            }
           this.predmeti.add(p);
    }

    public List<Izpit> getOcene() {
        return Collections.unmodifiableList(this.ocene);
    }

    public void addOcena(Izpit ocena) {
       Objects.requireNonNull(ocena,"Ocene ne more biti null");
       if(this.ocene.contains(ocena)) {
           throw new IllegalArgumentException("Ocena ze obstaja");
       }
       
       this.ocene.add(ocena);
    }
   
}
