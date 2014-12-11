/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class Senha {
    
    private byte[] senhaCriptografada;

    public Senha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        setSenha(senha);
    }
    public Senha() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        setSenha("password");
    }
    

    public byte[] getSenha() {
        return senhaCriptografada;
    }

    public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        this.senhaCriptografada = Criptografar(senha);
    }
    
    public static byte[] Criptografar(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest algoritmo = MessageDigest.getInstance("MD5");
        byte senhaCripto[] = algoritmo.digest(senha.getBytes("UTF-8"));
        
        //System.out.println(Arrays.toString(senhaCripto));
        return senhaCripto;
    }
    
//    Scanner sc = new Scanner(System.in);
//        Senha senha1 = new Senha("admin");
//    
//        String nova;
//        
//        System.out.println("Digite senha");
//        nova = sc.next();
//        
//        byte[] novo  = Senha.Criptografar(nova);
//        
//        if(Arrays.equals(novo, senha1.getSenha())){
//            System.out.println("Usuario Autenticado");
//        }
//        else{
//            System.out.println("Nao autenticado");
//        };
}
