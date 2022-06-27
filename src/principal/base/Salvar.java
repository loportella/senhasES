package principal.base;

import principal.base.Ler;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Scanner;

public class Salvar extends Ler{
        private OutputStreamWriter bw;
        private Scanner x=new Scanner(System.in);
        private List<String> todas;
        private String nome,valor;

    public Salvar() {
        setTodas();
    }

    public boolean novaSenha(){
        setTodas();
        try{
        bw=new OutputStreamWriter(new FileOutputStream("set/S.txt",true),"UTF-8");
       if(getTodas().stream().anyMatch(a->a.split("=")[0].equals(nome))) throw new IOException();
            
        bw.write(cd.esconder(nome, valor)+"\n");
        bw.close();
        return true;
        }catch(IOException e){ 
            return false;}        
    }
    
    public void removerSenha(String valor){
        getDoArq().remove(valor);
        renovaArq();
    }
    
    public void alterar(String valor){
        removerSenha(valor);
        novaSenha();
    }
    
    public void renovaArq(){        
         try{
        bw=new OutputStreamWriter(new FileOutputStream("set/S.txt"),"UTF-8");
        for(int i=0;i<getDoArq().size();i++){
            bw.write(getDoArq().get(i)+"\n");
        }
        
        bw.close();
        }catch(IOException e){}
    }    
    
    public List<String> getTodas() {
        return todas;
    }

    public void setTodas() {
        this.todas=preSalvamento();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
