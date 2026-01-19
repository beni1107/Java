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

    public ZunanjiProfesor(String organizacija, String katedra, String ime, String priimek, String emso, String email, int letoRojstva, String telStevilka) {
        super(katedra, ime, priimek, emso, email, letoRojstva, telStevilka);
        this.organizacija = organizacija;
    }

    
    
    public String getOrganizacija() {
        return organizacija;
    }

    public void setOrganizacija(String organizacija) {
        Objects.requireNonNull(organizacija,"Organizacija ne more biti null");
        this.organizacija = organizacija;
    }
    
    @Override
    public String getOpis() {
        return super.getOpis()+" | Organizacija: "+this.organizacija;
    }
  
}
