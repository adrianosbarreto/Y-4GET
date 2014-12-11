/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import Arquivos.Arquivo;
import Arquivos.Texto;
import Interfaces.Despertar;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class Nota extends Lembrete implements Despertar, Serializable{
    

    private ArrayList<Arquivo> anexos = new ArrayList<>();

    public Nota(Calendar despertar, String texto, Arquivo arquivo) {
        super(despertar, texto);
        anexos.add(arquivo);
    }
    public Nota() {
        super(); 
        anexos.add( new Texto() );
    }
    
    @Override
    public void despertar() {
       
        final Timer tempo = new Timer();
        final SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm");
        final String texto1 = this.texto;
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, ano);
//        c.set(Calendar.MONTH, mes-1);
//        c.set(Calendar.HOUR_OF_DAY, hora);
//        c.set(Calendar.MINUTE, minuto);
//        c.set(Calendar.SECOND, 0);;
 
        Date time = this.despertar.getTime();
        
        
        TimerTask k;
        k = new TimerTask(){
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, dataFormatada.format(new Date()) +" "+ texto1 , "Despertador", 1);
                tempo.cancel();
            }
        };
        tempo.schedule(k, time );
        
       
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
