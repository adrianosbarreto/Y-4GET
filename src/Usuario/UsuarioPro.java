/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Arquivos.Arquivo;
import Login.Senha;
import Notas.Nota;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;



/**
 *
 * @author Adriano
 */
public class UsuarioPro extends Usuario implements Autenticavel{
    
    
    private String nomeUsuario;
    private Senha senha;
    private ArrayList<Arquivo> notas = new ArrayList<>();

    public UsuarioPro(String nomeUsuario, Senha senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public UsuarioPro(String nomeUsuario, String senha, String nome, String endereco, int idade) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        super(nome, endereco, idade);
        setNomeUsuario(nomeUsuario);
        this.senha = new Senha(senha);
    }
 
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if(nomeUsuario.length() <= 15){
            this.nomeUsuario = nomeUsuario;
        }
    }
}
