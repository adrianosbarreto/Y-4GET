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
public class Audio extends Arquivo implements Serializable{
    private int taxaBit;

    public Audio(int taxaBit, double tamanho, String extensao, String nome) {
        super(tamanho, extensao, nome);
        setTaxaBit(taxaBit);
    }

    public Audio() {
        super(0, "mp3", "Sem Nome");
        this.taxaBit = 64;
    }

    public Audio(Audio copiado) {
        super(copiado);
        this.taxaBit = copiado.taxaBit;
    }
    
    

    public int getTaxaBit() {
        return taxaBit;
    }

    public void setTaxaBit(int taxaBit) {
        if(taxaBit >= 64){
            this.taxaBit = taxaBit;
        }
        else{
            System.out.println("Valor Invalido");
            this.taxaBit = 64;
        }
    }

    @Override
    public boolean abrirArquivo(Arquivo arquivo) {
        System.out.println("reproduzindo Audio " + ((Audio) arquivo).nome + "..." );
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
        
        String s =  "Arquivo de Audio: " + super.toString() +
                    "Taxa de bit: " + this.taxaBit +
                    "\n";
        return s;
    }
}
