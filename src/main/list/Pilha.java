package list;

import java.util.ArrayList;

public interface Pilha{
    ArrayList Pilha = new ArrayList();

    public boolean isEmpty(){
        if(Pilha.lenght == null){
            return false;
        }
        else{
            return true;
        }

    }
     
    public void push(int item){
        Pilha.add(item);
    }
  
    public int pop(){
        int indice = Pilha.size() - 1;
        int valor = indice;
        Pilha.remove(indice);
        return valor;
     }
}
