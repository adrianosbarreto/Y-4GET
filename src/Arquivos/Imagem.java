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
public class Imagem extends Arquivo implements Serializable{
    public int largura;
    public int altura;

    public Imagem(int largura, int altura, double tamanho, String nome, String extensao) {
        super(tamanho, extensao, nome);
        setAltura(altura);
        setLargura(largura);
    }

    public Imagem() {
        super(0, "jpeg", "Sem Nome");
        this.largura = 0;
        this.altura = 0;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura >= 0){
            this.largura = largura;
        }
        else{
            System.out.println("Largura Invalida");
            this.largura = 0;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura >= 0){
            this.altura = altura;
        }
        else{
            System.out.println("Altura Invalida");
            this.altura = 0;
        }
    }

    
    @Override
    public boolean abrirArquivo(Arquivo arquivo) {
        System.out.println( "Visualizando imagem " + ((Imagem) arquivo).nome + "..." );
        return true;
    }
    
 /*
    @Override
    public void editar() {
    Scanner sc = new Scanner(System.in);
    
    String nome1;

    System.out.println("Digite o Novo nome da imagem: ");
    nome1 = sc.next();
    setNome(nome1);
    }
 */   
    @Override
    public String toString() {
        
        String s =  "Arquivo de Imagem: " + super.toString() +
                    "Dimenções da imagem: " + this.largura + " x " + this.altura +
                    "\n";
        return s;
    }
}
