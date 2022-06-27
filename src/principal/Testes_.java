package principal;

import java.io.BufferedReader;
import principal.base.Codificador;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes_{
    
 //   public static Salvar salvar=new Salvar();
// public static Ler ler=new Ler();
    
    public static void main(String[] args) {
        Codificador c=new Codificador();
        
        try{
        Scanner pass=new Scanner(System.in);
        String n,v,y="",w;
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/principal/S.txt"));
        BufferedReader bf=new BufferedReader(new FileReader("src/principal/T.txt"));
        y=bf.readLine();
        while(y!=null){
            
            n=y.split("- | - |=")[0];
            v=y.split("- | - |=")[1];
           w=c.esconder(n, v);
            
            bw.write(w+"\n");
            y=bf.readLine();
        }
        
        bw.close();
        bf.close();
        }catch(IOException e){}
        
        /*
        int op=1;
        Scanner x=new Scanner(System.in);
               
        do{
            System.out.print("1 - Senhas salvas 2 - Salvar: ");
            op=x.nextInt();
            switch(op){
                case 1://LER SENHA
                    do{
                        //salvar.ordenar();
                    System.out.print("1 - Pesuisar 2 - Todas: ");
                    op=x.nextInt();
                    switch(op){
                        case 1: //ler.buscar(); 
                        break;
                        case 2: ler.salvas();  break;
                        case 0: op=-1; break;
                    }
                }while(op!=-1);
                break;
                    
                case 2: //SALVAR SENHA
                    
                   // salvar.novaSenha();
                    
                    break;
                default:  break;
            }
        }while(op!=0);
        */
    }

}
