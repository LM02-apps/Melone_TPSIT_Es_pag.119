/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_priorita;

/**
 *
 * @author Melone
 */
public class main {
    public static void main (String []args) throws InterruptedException
    {
        Thread T1=new Priorita ("Contatore 1",3);
        Thread T2=new Priorita ("COntatore 2",5);
        Thread T3=new Priorita ("Contatore 3",7);
        T1.start();
        T2.start();
        T3.start();
        
        T1.stop();
        T2.stop();
        T3.stop();
    }
}
