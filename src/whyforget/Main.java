/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whyforget;

import Login.Senha;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
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
        Scanner sc = new Scanner(System.in);
        Senha senha1 = new Senha("admin");
    
        String nova;
        
        System.out.println("Digite senha");
        nova = sc.next();
        
        byte[] novo  = Senha.Criptografar(nova);
        
        if(Arrays.equals(novo, senha1.getSenha())){
            System.out.println("Usuario Autenticado");
        }
        else{
            System.out.println("Nao autenticado");
        }
    }
}
    

