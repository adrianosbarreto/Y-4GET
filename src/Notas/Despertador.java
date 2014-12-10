/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class Despertador {
    
    
    
    public Despertador(Calendar data, String mensagem) {
        despertar(data, mensagem);
    }

    public Despertador() {
        despertar(Calendar.getInstance(), "Sem Mensagem");
    }
    
    private void despertar(Calendar calendar, String mensagem//String mensagem, int dia,int mes,int ano,int hora,int minuto
    ) {
        final String f1 = mensagem;
        final Timer tempo = new Timer();
        final SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm");
        
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, ano);
//        c.set(Calendar.MONTH, mes-1);
//        c.set(Calendar.HOUR_OF_DAY, hora);
//        c.set(Calendar.MINUTE, minuto);
//        c.set(Calendar.SECOND, 0);;
 
        Date time = calendar.getTime();
        
        
        TimerTask k;
        k = new TimerTask(){
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, dataFormatada.format(new Date())
                        + " "+ f1, "Despertador", 1);
                tempo.cancel();
            }
        };
        tempo.schedule(k, time );
        
    }
}
