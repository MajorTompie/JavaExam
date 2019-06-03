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
public class Bedrijf implements NaamInterface{
    private String bedrijfsNaam;
    private String soortBedrijf;
    
    public Bedrijf(String bedrijfsNaam, String soortBedrijf){
        this.bedrijfsNaam = bedrijfsNaam;
        this.soortBedrijf = soortBedrijf;
    }
    
    @Override
    public String getVolledigeNaam() {
        return bedrijfsNaam + " " + soortBedrijf;
    }
}
