/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

/**
 *
 * @author bendz
 */
public class Izpit {
    private int ocena;

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if( ocena < 5 || ocena > 10) {
            throw new IllegalArgumentException("Nepravilna ocena");
        }
        
        this.ocena = ocena;
    }
    
    
    
}
