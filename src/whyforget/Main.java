/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whyforget;

import Arquivos.Texto;
import Login.Senha;
import Notas.Agendamentos;
import Notas.Aniversario;
import Notas.Despertador;
import Notas.Lembrete;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;




/**
 *
 * @author Adriano
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     */
    
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Date data = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(formatoData.format(data));
        Calendar date = Calendar.getInstance();
        date.set(Calendar.MINUTE, 15);
        
        //Despertador despertador = new Despertador(date, "Acordar");
        
        //Despertador c ;
        //c.criarDespertador();
        //Despertador despertador = new Despertador(c, "Acordar");
        
        //Calendar d = ;
//        Despertador despertador1 = new Despertador();
//        despertador1.criarDespertador();
//        
        //Texto texto = new Texto();
        Aniversario lembrete = new Aniversario("Aniversaio Mamae", Aniversario.criarDataAniversario(), "Parabens Mamae");
        lembrete.despertar();
        System.out.println(lembrete);
    }
}
    

