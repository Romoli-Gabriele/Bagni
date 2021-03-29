/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagni;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabbo
 */
public class Persona implements Runnable{
    public Bagno Tipo;

    public Persona(Bagno Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public void run() {
        
        try {
            Tipo.Occupato();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
