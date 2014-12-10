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
}
