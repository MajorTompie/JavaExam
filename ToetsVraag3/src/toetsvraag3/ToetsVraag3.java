/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag3;

import static toetsvraag3.TabelRekenen.getAantalGroteGetallen;
import static toetsvraag3.TabelRekenen.groteGetallen;

/**
 *
 * @author Tom
 */
public class ToetsVraag3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] array = { { 1.10 , 1.40 , 2.40 } ,
                             { 1.25 , 1.55 , 2.50 } ,
                             { 1.55 , 1.45 , 2.50 } ,
                             { 1.00 , 1.60 , 1.45 } ,
                             {0.90 , 1.00 , 1.00 } };
    System.out.println(getAantalGroteGetallen(array, 1.50));
    double[] getallen = groteGetallen(array, 1.50);
    
    for(int i=0; i<getallen.length; i++){
        System.out.println(getallen[i]);
    }
    }
    
    
}
