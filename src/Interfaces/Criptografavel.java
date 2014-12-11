/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Login.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Adriano
 */
public interface Criptografavel {
    public abstract byte[] Criptografar(String texto)throws NoSuchAlgorithmException, UnsupportedEncodingException;
}
