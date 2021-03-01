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
public class Priorita extends Thread{
    private String chisono;
    private int valore;
    public Priorita (String nome, int valore)
    {
        setChisei(nome);
        this.valore=valore;
    }
    public String getChisei()
    {
        return chisono;
    }
    
    public void setChisei(String nome)
    {
        chisono=nome;
    }
    public void run()
    {
        int conta=0;
            System.out.println("Thread #"+chisono+", valore="+conta);

    }
}
