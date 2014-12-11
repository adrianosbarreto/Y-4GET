/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import Interfaces.Despertar;
import java.io.Serializable;
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
public class Aniversario extends Lembrete implements Despertar, Serializable{
    
    private String descricao;
    
    

    public Aniversario(String descricao, Calendar despertar, String texto) {
        super(despertar, texto);
        setDescricao(descricao);
    }

    public Aniversario(String descricao) {
        super();
        setDescricao(descricao);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length() <= 45){
            this.descricao = descricao;
        }
        else{
            System.out.println("Descrição invalida");
            this.descricao = "sem descricao";
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
        tempo.schedule(k, time);
   
        
    }
    public static Calendar criarDataAniversario(){
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, hora, minuto;
        
        System.out.println("Digite Dia): ");
        dia = sc.nextInt();
        //dia = JOptionPane.Sho
        System.out.println("Digite Mes: ");
        mes = sc.nextInt();

        System.out.println("Digite Hora: ");
        hora = sc.nextInt();
        System.out.println("Digite Minuto: ");
        minuto = sc.nextInt();
        Calendar c = Calendar.getInstance();
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
 
}
