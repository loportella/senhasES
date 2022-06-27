package principal.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Codificador {
    private Random ky=new Random();
    private StringBuilder galinha;
    private StringBuilder valor1,valor2;
    
    public Codificador() {
        setValor1(new StringBuilder());
        setValor2(new StringBuilder());
        setGalinha(new StringBuilder());
    }
    
    public String esconder(String nome,String valor){
        setGalinha(new StringBuilder());
        int ovo1=ky.nextInt(100)+11;
        int ovo2=ky.nextInt(200)+33;
        int aux=nome.length();
        if(aux!=10&&aux!=13){//pra evitar a uma exception: StringIndexOutOfBoundsException
        String gema=nome+valor;
        
        for(int i=0;i<gema.length();i++){
              if(nome.length()>i) galinha.insert(galinha.length(), (char)((int)gema.charAt(i)+ovo1));
              else galinha.insert(galinha.length(), (char)((int)gema.charAt(i)+ovo2));
        }
        
        galinha.insert(0, (char)nome.length());
       galinha.insert(galinha.length(), (char)ovo1);
       galinha.insert(galinha.length(), (char)ovo2);
       return galinha.toString();
        }
        return esconder(nome+" ",valor);
    }

    public String esconder(String valor){
        setGalinha(new StringBuilder());
        galinha.insert(0,valor.charAt(valor.length()-1));
        int o=(int)valor.charAt(valor.length()-3);
        int fim=(int)valor.charAt(valor.length()-1);
        for(int i=0;i<fim;i++){
            galinha.insert(i+1, (char)((int)valor.charAt(i)+o));
        }galinha.append(valor.split("=")[1]);
        galinha.deleteCharAt(galinha.length()-1);
        return galinha.toString();
    }
    
public void clarear(String cifra){
    setValor2(new StringBuilder());
    
    for(int i=0;i<cifra.length()-3;i++){
           valor2.insert(valor2.length(), (char)((int)cifra.charAt(i)-(int)cifra.charAt(cifra.length()-2)));
   }
}


public List<String> clarear(List<String> cifras){
    List <String> partida=new ArrayList<>();
    
        cifras.forEach(c->{
        setValor1(new StringBuilder());
        setValor2(new StringBuilder());
        for(int i=1;i<c.length();i++){
            if((int)c.charAt(0)>=i) valor1.insert(valor1.length(), (char)((int)c.charAt(i)-(int)c.charAt(c.length()-2)));
            else valor2.insert(valor2.length(), c.charAt(i));
        }
        
        
        valor1.append('=');
        valor2.append(c.charAt(0));
        valor1.append(valor2);
        partida.add(valor1.toString());
    });
    return partida;
}

    public String getValor1() {
        return valor1.toString();
    }

    public String getValor2() {
        return valor2.toString();
    }

    public void setValor1(StringBuilder valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(StringBuilder valor2) {
        this.valor2 = valor2;
    }

    public void setGalinha(StringBuilder galinha) {
        this.galinha = galinha;
    }

    
}
