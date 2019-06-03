/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag2;

/**
 *
 * @author Tom
 */
public class Student extends Persoon{
    private int studentnummer;
    
    public Student(String voorNaam, String achterNaam, int studentnummer) {
        super(voorNaam, achterNaam);
        this.studentnummer = studentnummer;
    }
    
    @Override
    public String getVolledigeNaam() {
        return voorNaam + " " + achterNaam + " " + "(" + studentnummer + ")";
    }
}
