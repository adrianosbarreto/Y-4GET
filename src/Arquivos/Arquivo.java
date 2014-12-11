/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Adriano
 */
public abstract class Arquivo implements Serializable{
    protected volatile double tamanho;
    protected Date dataCriacao;
    protected String extensao;
    protected String nome;
    //protected Date dataModficacao;

    public Arquivo(double tamanho, String extensao, String nome) {
        setNome(nome);
        setTamanho(tamanho);
        setExtensao(extensao);
        this.dataCriacao = new Date();
    }
    
    public Arquivo(){
        this.nome = "Sem Nome";
        this.tamanho = 0;
        this.dataCriacao = new Date();
    }
    public Arquivo(Arquivo copiado){
        this.nome = copiado.nome;
        this.extensao = copiado.extensao;
        this.tamanho = copiado.tamanho;
        this.dataCriacao = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 40){
            this.nome = nome;
        }
        else{
            System.out.println("Nome invalido!");
            this.nome = "Sem nome";
        }
    }
    
    
    public double getTamanho() {
        return tamanho;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        if(extensao.length() >= 3){
            this.extensao = extensao;
        }
        else{
            this.extensao = "bat";
        }
    }
    
    public void setTamanho(double tamanho) {
        if(tamanho >= 0){
            this.tamanho = tamanho;
        }
        else{
            System.out.println("Tamanho Invalido");
            this.tamanho = 0;
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String s =  this.nome + "." + this.extensao +
                    "\nData Criacao: " + forma.format(dataCriacao) +
                    "\nTamanho: " + this.tamanho + "\n";
        return s;
    }
    
    
    public abstract boolean abrirArquivo(Arquivo arquivo);
}
