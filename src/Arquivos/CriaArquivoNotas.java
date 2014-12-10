/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Adriano
 */
public class CriaArquivoNotas {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        File a = new File("Arquivo.bat");
        
        
        //try ( FileWriter arquivo = new FileWriter("Arquivo.txt");
        //PrintWriter gravar = new PrintWriter(arquivo);
        ///*
        
        ArrayList<Arquivo> arquivos  = new ArrayList<>();
        Audio m = new Audio(128, 0.2, "mp3", "Audio1");
        Imagem g = new Imagem(10, 3, 2, "Imagem", "jpeg");
        Videos k = new Videos("Video", "mp4", 2.1, Videos.Classificacao.LIVRE, 20);
        Texto b = new Texto("Adriano", 14, 2.0, "txt");
        Texto c = new Texto("Nome", 16, 4, "docx");
        //System.out.println(b);
        
        arquivos.add(m);
        arquivos.add(c);
        arquivos.add(g);
        arquivos.add(k);
        arquivos.add(b);
        
        FileInputStream saida;
        ObjectInputStream lerOb;
        
        FileOutputStream ob = new FileOutputStream(a);
        saida = new FileInputStream(a);
        ObjectOutputStream gravaOb = new ObjectOutputStream(ob);
        //lerOb = new ObjectInputStream(saida);
        gravaOb.writeObject(arquivos);
        gravaOb.flush();
        ob.flush();
        //*/
                //FileInputStream saida = new FileInputStream(a)) {
        lerOb = new ObjectInputStream(saida);
        ArrayList<Texto> texto2 = (ArrayList)lerOb.readObject();


        System.out.println( texto2.get(0) );
        System.out.println( texto2.get(1) );
        System.out.println( texto2.get(2) );
        System.out.println( texto2.get(3) );
        System.out.println( texto2.get(4) );

        saida.close();
            
            
            //gravar.print(b);
            //gravar.printf("novo texto 2%n");
            //arquivo.close();
            //BufferedWriter texto = new BufferedWriter(arquivo);
            
            //texto.write("Aprendendo novas coisas%n");
            //texto.write("Novas e novas");
            //texto.close();
            
            
            /*
            Texto texto = new Texto();
            
            System.out.println(texto);
            
            
            Date data = new Date();
            SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            
            
            DateFormat novo = DateFormat.getDateInstance(DateFormat.FULL);
            Calendar cal = Calendar.getInstance();
            
            Date data1 = data;
            
            System.out.println(forma.format(data));
            
            System.out.println("Date Format: " + novo.format(data));
            System.out.println("Calendario: " + cal.getTime());
            System.out.println("Data: " + data);
            System.out.println("Y-4GET?");
            
            System.out.println(forma.format(data1));
            */
            //}
        }
    
    
}
