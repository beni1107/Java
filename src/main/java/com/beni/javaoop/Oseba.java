/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

/**
 *
 * @author bendz
 */
public abstract class Oseba {
    
    private String ime;
    private String priimek;
    private String EMSO;
    private String email;
    
    
    // GET & SET
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private int letoRojstva;
    private String telStevilka;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getEMSO() {
        return EMSO;
    }

   
    public int getLetoRojstva() {
        return letoRojstva;
    }

    public void setLetoRojstva(int letoRojstva) {
        this.letoRojstva = letoRojstva;
    }

    public String getTelStevilka() {
        return telStevilka;
    }

    public void setTelStevilka(String telStevilka) {
        this.telStevilka = telStevilka;
    }
    
    
}
