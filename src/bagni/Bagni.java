/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagni;

/**
 *
 * @author gabbo
 */
public class Bagni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Bagno Uomini = new Bagno();
       Bagno Donne = new Bagno();
       Bagno Disabili = new Bagno();
       
       Persona U1 = new Persona(Uomini);
       Persona U2 = new Persona(Uomini);
       Persona U3 = new Persona(Uomini);
       Persona D1 = new Persona(Donne);
       Persona D2 = new Persona(Donne);
       Persona H1 = new Persona(Disabili);
       Persona H2 = new Persona(Disabili);
       
       Thread t1 = new Thread(U1);
       Thread t2 = new Thread(U2);
       Thread t3 = new Thread(U3);
       Thread t4 = new Thread(D1);
       Thread t5 = new Thread(D2);
       Thread t6 = new Thread(H1);
       Thread t7 = new Thread(H2);
       
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
       t6.start();
       t7.start();
       
       
    }
    
}
