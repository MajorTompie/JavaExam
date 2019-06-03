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
public class Persoon implements NaamInterface{
    String voorNaam;
    String achterNaam;
    
    public Persoon(String voorNaam, String achterNaam){
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
    }
    
    @Override
    public String getVolledigeNaam() {
        return voorNaam + " " + achterNaam;
    }
    
}
