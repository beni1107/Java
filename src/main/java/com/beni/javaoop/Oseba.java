/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bendz
 */
public abstract class Oseba {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern EMSO_PATTERN = Pattern.compile("^\\d{13}$");
    private String ime;
    private String priimek;
    private String EMSO;
    private String email;
    private int letoRojstva;
    private String telStevilka;
    
    // Constructor
    public Oseba (String ime, String priimek, String emso, String email, int letoRojstva, String telStevilka) {
        validateDate(letoRojstva);
        validateEmail(email);
        validateEmso(emso);
        
        this.ime = ime;
        this.priimek = priimek;
        this.EMSO = emso;
        this.email = email;
        this.letoRojstva = letoRojstva;
        this.telStevilka = telStevilka;
}
    
    // VALIDATION METHODS
    private static void validateEmail(String email) {
        Objects.requireNonNull(email,"Email naslov ne more biti null");
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Email ni pravilen!");
        }
    }
    
    private static void validateEmso(String emso){
        Objects.requireNonNull(emso,"EMSO ne more biti null");
        Matcher matcher = EMSO_PATTERN.matcher(emso);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("EMSO ni pravilen!");
        }   
    }
    
    private static void validateDate( int leto ) {
        if (leto < 1930 || leto > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Leto rojstva ni pravilno");
        }
    }
    // GET & SET
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        Objects.requireNonNull(ime,"Ime ne more biti null");
        
        this.ime = ime;
    }

    public String getPriimek() {
         
        return priimek;
    }

    public void setPriimek(String priimek) {
        Objects.requireNonNull(priimek,"Ime ne more biti null");
        this.priimek = priimek;
    }

    public String getEMSO() {
        return EMSO;
    }

   
    public int getLetoRojstva() {
        return letoRojstva;
    }

    public void setLetoRojstva(int letoRojstva) {
        validateDate(letoRojstva);
        this.letoRojstva = letoRojstva;
    }

    public String getTelStevilka() {
        return telStevilka;
    }

    public void setTelStevilka(String telStevilka) {
        this.telStevilka = telStevilka;
    }
    
    public abstract String getOpis();
}
