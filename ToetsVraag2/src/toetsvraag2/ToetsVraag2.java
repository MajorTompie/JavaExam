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
public class ToetsVraag2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bedrijf bedrijf = new Bedrijf("Logica Software", "B.V.");
        Persoon persoon = new Persoon("Peter", "Jansen");
        Student student = new Student("Sven", "Kramer", 15004321);
        NamenLijst lijst = new NamenLijst();
        
        lijst.toevoegen(bedrijf);
        lijst.toevoegen(persoon);
        lijst.toevoegen(student);
        
        lijst.weergeven();
        /*
        System.out.println(bedrijf.getVolledigeNaam());
        System.out.println(persoon.getVolledigeNaam());
        */
    }
    
}
