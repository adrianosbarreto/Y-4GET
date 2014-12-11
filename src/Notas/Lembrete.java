/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import Arquivos.Texto;
import Interfaces.Despertar;
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
public class Lembrete implements Despertar{

    protected static int numAtualLembrete = 0;
    protected String texto;
    protected Date dataCriacao;
    protected Calendar despertar;
    

    public Lembrete(Calendar despertar, String texto) {
        this.despertar = despertar;
        this.texto = texto;
        this.dataCriacao = new Date();
        numAtualLembrete++;
    }
    
    public Lembrete() {
        this.despertar = Calendar.getInstance();
        this.texto = "SEM TEXTO";
        this.dataCriacao = new Date();
        numAtualLembrete++;
    }

    public void setTexto(String texto) {
        if(texto.length() <= 256){
            this.texto = texto;
        }
        else{
            this.texto = "Texto Incompleto";
        }
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
    
    public static Calendar criarData(){
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, hora, minuto;
        
        System.out.println("Digite Dia): ");
        dia = sc.nextInt();
        //dia = JOptionPane.Sho
        System.out.println("Digite Mes: ");
        mes = sc.nextInt();
        System.out.println("Digite Ano: ");
        ano = sc.nextInt();
        System.out.println("Digite Hora: ");
        hora = sc.nextInt();
        System.out.println("Digite Minuto: ");
        minuto = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, ano);
        c.set(Calendar.MONTH, mes-1);
        c.set(Calendar.DATE, dia);
        c.set(Calendar.HOUR_OF_DAY, hora);
        c.set(Calendar.MINUTE, minuto);
        c.set(Calendar.SECOND, 0);
        System.out.println("Criado com Sucesso");
        //("Adicionado com Sucesso!");
        //return c;
        return c;
    }

    @Override
    public String toString() {
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return  "Data de Criação: "+forma.format(dataCriacao)+
                "\nNota: " +this.texto;
                
                
    }
    
    
    
    
    
    
    
}
