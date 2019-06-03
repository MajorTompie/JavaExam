/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag2;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class NamenLijst {
    private ArrayList<NaamInterface> lijst;
    
    public NamenLijst(){
       lijst = new ArrayList<NaamInterface>();
    }
    
    public void toevoegen(NaamInterface i){
        lijst.add(i);
    }
    
    public void weergeven(){
        for(int i = 0; i < lijst.size(); i++){
            System.out.println(lijst.get(i).getVolledigeNaam());
        }
    }
}
