/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class Texto extends Arquivo implements Serializable{
    //String nome;
    String texto;
    int numeroLinhas;

    public Texto(String texto,String nome, int numeroLinhas, double tamanho, String extensao) {
        super(tamanho, extensao, nome);
        setNumeroLinhas(numeroLinhas);
        setTexto(texto);
        this.dataCriacao = new Date();
        //setTamanho(tamanho);
    }

    public Texto() {
        super(0, "txt", "Sem Titulo");
        this.numeroLinhas = 0;
        this.texto = "Texto Incompleto";
        this.dataCriacao = new Date();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if(texto.length() <= 5000){
            this.texto = texto;
        }
        else{
            this.texto = "Texto Incompleto";
        }
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    

    public void setTitulo(String titulo) {
        if(titulo.length() <= 30){
            this.nome = titulo;
        }
        else{
            System.out.println("Titulo Invalido!");
            this.nome = "Sem Titulo";
        }
    }

    public void setNumeroLinhas(int numeroLinhas) {
        if(numeroLinhas >= 0){
            this.numeroLinhas = numeroLinhas;
        }
        else{
            System.out.println("Numero Invalido(nao pode ser negativo)");
            this.numeroLinhas = 0;
        }
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }
    
    public boolean ler(){
        System.out.println("Lendo " + this.nome);
        return true;
    }
    
    @Override
    public boolean abrirArquivo(Arquivo arquivo) {
        System.out.println("Visualizando Texto " + ((Texto) arquivo).nome + "..." );
        return true;
    }
/*
    @Override
    public void editar() {
    Scanner sc = new Scanner(System.in);
    
    String nome1;
    int linhas;

    System.out.println("Digite o Novo nome da imagem: ");
    nome1 = sc.next();
    setTitulo(nome1);
    System.out.println("Digite o numero de linhas do documento: ");
    linhas = sc.nextInt();
    setNumeroLinhas(linhas);
    }
*/
    @Override
    public String toString() {
        
        String s =  "Arquivo de Texto: " + super.toString() +
                    "Numero de Linhas: " + this.numeroLinhas +
                    "\n";
        return s;
    }
}
