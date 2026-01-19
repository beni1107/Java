/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beni.javaoop;

import java.time.LocalDate;

/**
 *
 * @author beni
 */
public class Predmetnik {
     public static void main(String[] args){
        
        Referent referent = new Referent("Master", "Matej","Dubravcic" , "1107986500071", "referent@fakulteta.com",
                1960, "040-333-333");
        Profesor prof1 = new Profesor("RAC. Programiranje","Josko", "Mosko","1107486512071" ,"josko.mosko@fakulteta.com",
                1979, "040-555-555");
        Predmet p1 = new Predmet("Racunalnisko programiranje", "PRG001", prof1);
        Student s = new Student("Student1","Student1","1107486512171", "student@fakulteta.com", 1990, "040444333", "1111", 1);
        Student s2 = new Student("Student2","Student2","1107586512171", "student2@fakulteta.com", 1980, "040444222", "2222", 2);
        
        Izpit programiranje = new Izpit(10, p1, s, LocalDate.now());
        Izpit programiranje2 = new Izpit(5,p1,s2,LocalDate.now());
        s2.dodajOceno(programiranje2);
        
        s.dodajOceno(programiranje);
        referent.dodajPredmet(p1);
        referent.dodajProfesorja(prof1);
        p1.dodajStudenta(s);
        p1.dodajStudenta(s2);
        
        referent.izpisPodatkov();
        referent.izpisiOdlicnjake();
        
    }
    
}
