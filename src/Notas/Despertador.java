/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class Despertador {
    
    private int dia, mes, ano, hora, minuto;
    //public Calendar data;
    
    public Despertador(int dia,int mes, int ano,int hora,int minuto) {
        dia
    }

    public Despertador() {
        this.data = Calendar.getInstance();
    }
    
    
    public void criarDespertador(){
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, hora, minuto;
        
        System.out.println("Digite Dia): ");
        dia = sc.nextInt();
        System.out.println("Digite Mes: ");
        mes = sc.nextInt();
        System.out.println("Digite Ano: ");
        ano = sc.nextInt();
        System.out.println("Digite Hora: ");
        hora = sc.nextInt();
        System.out.println("Digite Minuto: ");
        minuto = sc.nextInt();
        //Calendar c = Calendar.getInstance();
        this.data.set(Calendar.YEAR, ano);
        this.data.set(Calendar.MONTH, mes-1);
        this.data.set(Calendar.DATE, dia);
        this.data.set(Calendar.HOUR_OF_DAY, hora);
        this.data.set(Calendar.MINUTE, minuto);
        this.data.set(Calendar.SECOND, 0);
        System.out.println("Criado com Sucesso");
        //("Adicionado com Sucesso!");
        //return c;
        return new Despertador(this.data);
    }
            
    
//    private void despertar(Calendar calendar, String mensagem//String mensagem, int dia,int mes,int ano,int hora,int minuto
//    ) {
//        final String f1 = mensagem;
//        final Timer tempo = new Timer();
//        final SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm");
//        
////        Calendar c = Calendar.getInstance();
////        c.set(Calendar.YEAR, ano);
////        c.set(Calendar.MONTH, mes-1);
////        c.set(Calendar.HOUR_OF_DAY, hora);
////        c.set(Calendar.MINUTE, minuto);
////        c.set(Calendar.SECOND, 0);;
// 
//        Date time = calendar.getTime();
//        
//        
//        TimerTask k;
//        k = new TimerTask(){
//            @Override
//            public void run() {
//                JOptionPane.showMessageDialog(null, dataFormatada.format(new Date())
//                        + " "+ f1, "Despertador", 1);
//                tempo.cancel();
//            }
//        };
//        tempo.schedule(k, time );   
//    }
//    
    private void despertar(Calendar data) {
       
        final Timer tempo = new Timer();
        final SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm");
        
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, ano);
//        c.set(Calendar.MONTH, mes-1);
//        c.set(Calendar.HOUR_OF_DAY, hora);
//        c.set(Calendar.MINUTE, minuto);
//        c.set(Calendar.SECOND, 0);;
 
        Date time = data.getTime();
        
        
        TimerTask k;
        k = new TimerTask(){
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, dataFormatada.format(new Date()), "Despertador", 1);
                tempo.cancel();
            }
        };
        tempo.schedule(k, time );   
    }
    
}
