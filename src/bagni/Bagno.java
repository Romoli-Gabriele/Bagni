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
public class Bagno {

    public Bagno() {
    }
    
    public synchronized void Occupato() throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" è nel bagno");
        Thread.sleep((long)(Math.random()*10000));
        System.out.println(Thread.currentThread().getName()+" è uscito");
    }
}
