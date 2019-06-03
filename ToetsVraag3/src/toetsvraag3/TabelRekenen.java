/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag3;

/**
 *
 * @author Tom
 */
public class TabelRekenen {
    public TabelRekenen(){
        
    }
    
    public static int getAantalGroteGetallen(double[][] input, double groterDan){
        int aantal = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if(input[i][j] > groterDan){
                    aantal++;
                }
            }
        }
        return aantal;
    }
    
    public static double[] groteGetallen(double[][] input, double groterDan){
        int cijfer = getAantalGroteGetallen(input, groterDan);
        int getal = 0;
        double[] array = new double[cijfer];
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if(input[i][j] > groterDan){
                    array[getal] = input[i][j];
                    getal++;
                }
            }
        }
        return array;
    }
}
