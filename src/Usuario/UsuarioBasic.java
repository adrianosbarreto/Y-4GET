/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Arquivos.Arquivo;
import Interfaces.Autenticavel;
import Login.Senha;
import Notas.Nota;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author Adriano
 */
public class UsuarioBasic extends Usuario implements Autenticavel{
    
    private final static int NUM_MAX_NOTAS = 4;
    private String nomeUsuario;
    private Senha senha;
    private ArrayList<Nota> notas = new ArrayList<>();

    public UsuarioBasic(String nomeUsuario, Senha senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public UsuarioBasic(String nomeUsuario, String senha, String nome, String endereco, int idade) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        super(nome, endereco, idade);
        setNomeUsuario(nomeUsuario);
        this.senha = new Senha(senha);
    }

    @Override
    public boolean autenticar(ArrayList<Autenticavel> vetor) {
        return super.autenticar(vetor); //To change body of generated methods, choose Tools | Templates.
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
