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
public class ZunanjiProfesor extends Profesor{
    private String organizacija;
    private List<Predmet> predmeti;

    public ZunanjiProfesor(String organizacija, String ime, String priimek, String emso, String email, int letoRojstva, String telStevilka) {
        super(ime, priimek, emso, email, letoRojstva, telStevilka);
        test
        this.organizacija = organizacija;
        this.predmeti = new ArrayList<>();
    }
    
    public String getOrganizacija() {
        return organizacija;
    }

    public void setOrganizacija(String organizacija) {
        Objects.requireNonNull(organizacija,"Organizacija ne more biti null");
        this.organizacija = organizacija;
    }

    public List<Predmet> getPredmeti() {
        return Collections.unmodifiableList(predmeti);
    }

    @Override
   public String getOpis() {
       return "Zunanji profesor : "+this.getEmail() + " "+this.getPriimek()+" \n"+
               " Organizacija :"+this.organizacija+" EMSO :"+this.getEMSO();           
   }
   public void izpisPodatkov() {
       System.out.println("\t---PREDMETI PROFESORJA---");
       if(!this.predmeti.isEmpty()) {
           for(Predmet x:predmeti) {
               System.out.println(x.getImePredmeta()+" "+x.getKodaPredmeta());
           }
       }
       
    
    
}
    
    
    
    public void dodajPredmet(Predmet p) {
        Objects.requireNonNull(p,"Predmet ne more biti null");
        if(!predmeti.contains(p)) {
            predmeti.add(p);
        }
        else {
            System.out.println("Ta predmet ze obstaja");
        }
    }
    
}
