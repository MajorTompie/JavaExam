/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag1;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class Cursus {
    private String titel;
    private ArrayList<Student> studenten;
    
    public Cursus(String titel){
        this.titel = titel;
        studenten = new ArrayList<Student>();
    }
    
    public int aantalKorteNamen(int korterDan){
        int aantal = 0;
        Student student;
        String naam;
        for(int i = 0; i < studenten.size(); i++){
           student = studenten.get(i);
           naam = student.getNaam();
           if(naam.length() < korterDan){
               aantal++;
           }
            
        } 
        return aantal;
    }
    
    public void addStudent(Student s){
        if (!studenten.contains(s))
            studenten.add(s);
    }
    
    public String getTitel() {
        return titel;
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }
    
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }
}
