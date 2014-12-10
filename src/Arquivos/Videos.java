/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import java.io.Serializable;

/**
 *
 * @author Adriano
 */
public class Videos extends Arquivo implements Comparable<Videos>, Serializable{
    public enum Classificacao{
        LIVRE(0),
        MENOR10(10),
        MENOR12(12),
        MENOR16(16),
        MENOR18(18);
        
        public int idadeMinima;
        
        Classificacao(int idade){
            this.idadeMinima = idade;
        }
        
    }
    
    private double duracao;
    private Classificacao classificacao;

    public Videos(String nome, String extensao, double duracao, Classificacao classificacao, double tamanho) {
        super(tamanho, extensao, nome );
        this.nome = nome;
        setDuracao(duracao);
        this.classificacao = classificacao;
    }

    public Videos() {
        super(0, "mp4", "Sem Nome");
        this.duracao = 0.0;
        this.classificacao = Classificacao.LIVRE;
    }

    public Videos(Videos atual) {
        super(atual);
        this.nome = atual.nome;
        this.duracao = atual.duracao;
        this.classificacao = atual.classificacao;
    }
    
    public void setDuracao(double duracao) {
        if( duracao >= 0 ){
            this.duracao = duracao;
        }
        else{
            System.out.println("Duração nao pode ser negativa!");
        }
    }

    
    public double getDuracao() {
        return duracao;
    }

    public final int getClassificacao() {
        return this.classificacao.idadeMinima;
    }
    
    @Override
    public boolean abrirArquivo(Arquivo arquivo) {
        System.out.println( "Reproduzindo Video " + ((Videos) arquivo).nome + "..." );
        return true;
        
    }
    /*
    @Override
    public  void editar() {
    
    Scanner sc = new Scanner(System.in);
    String nome1;
    //double duracao1;
    //double tamanho1;
    String idadeMinima;

    System.out.println("Digite o Novo nome do Video: ");
    nome1 = sc.next();
    this.nome = nome1;
    System.out.println("Digite Idade minima para assistir(Livre, Menor10, Menor12, Menor16, Menor18): ");
    idadeMinima = sc.next();
    this.classificacao = Classificacao.valueOf(idadeMinima);
    sc.nextLine(); //Limpa o Buffer.
    //System.out.println("Digite a duraçao do video(em Horas): ");
    //duracao1 = sc.nextDouble();
    //setDuracao(duracao1);
    //System.out.println("Tamanho do video(em MegaBytes): ");
    //tamanho1 = sc.nextDouble();
    //setTamanho(tamanho);
    
    }
    */
    @Override
    public String toString() {
        
        String s =  "Arquivo de Video: " + super.toString() +
                    "Classificação: " + this.classificacao +
                    "\nDuração: " + this.duracao +
                    "\n";
        return s;
    }
    @Override
    public int compareTo(Videos video) {
        if( this.nome.compareTo(video.nome) == 1  ){
           return 1;
        }
        else if(this.nome.compareTo(video.nome) == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
