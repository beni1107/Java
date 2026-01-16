/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

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
    
    public void getIzpisPodatkov() {
        System.out.println("\t--- PREDMETI PROFESORJA---");
        if (!this.predmeti.isEmpty()) {
            for (Predmet p : predmeti) {
                System.out.println(p.getImePredmeta() +" Koda predmeta +"+p.getKodaPredmeta());
                for(Student s : studenti) {
                    for( Predmet x : s.getPredmeti()) {
                        if(p.equals(s.getPredmeti())) {
                            System.out.println(s.getOpis());
                            
                        }
                    }
                }
            }
        }
    }
    
}
