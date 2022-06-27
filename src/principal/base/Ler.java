package principal.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ler {
  private BufferedReader br;
  public Codificador cd=new Codificador();
  private Scanner x=new Scanner(System.in);
  private String valor,pesquisar;
  private List<String> tudo=preSalvamento();
  private List<String> doArq=new ArrayList<>();
  
  
    public Ler() {
    }
    
    public List<String> buscar(){        
        return getTudo().stream().filter(s->  s.split("=")[0].length()>=pesquisar.length() 
                && s.split("=")[0].substring(0,pesquisar.length()).contains(pesquisar)).
                collect(Collectors.toList());
    }
    
    public void salvas(){
        List<String> todas=preSalvamento();
        todas.forEach(s-> System.out.println(s.split(" - |- |=")[0]));
    }
    
    public List<String> preSalvamento(){
        List <String> aux=new ArrayList<>();
        setTudo(new ArrayList<>());
        try{
            br=new BufferedReader(new InputStreamReader(new FileInputStream("set/S.txt"),"UTF-8"));
            
            valor=br.readLine();
            while(valor!=null){
                this.tudo.add(valor);
                valor=br.readLine();
            }
            aux=cd.clarear(getTudo());
            doArq=getTudo();
            aux.sort((a,b)->a.compareTo(b));
            setTudo(aux);
            br.close();
        }catch(IOException e){
            File f=new File("set");f.mkdir();
        }
        
       return getTudo();
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

    public String getPesquisar() {
        return pesquisar;
    }
    
    public List<String> getTudo() {
        return tudo;
    }

    public void setTudo(List<String> tudo) {
        this.tudo = tudo;
    }

    public List<String> getDoArq() {
        return doArq;
    }
    
}
