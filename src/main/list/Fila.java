package list;

import java.util.ArrayList;

public interface Fila{
    ArrayList Fila = new ArrayList();

    public void	enqueue(int item){
        Fila.add(item);
    }

    public int	dequeue(){
        Fila.remove(0);
    }

    public boolean isEmpty() {
        if(Fila.lenght() == null){
            return false;
        }
        else{
            return true;
        }
    }

    public int	size() {
        int tamanho = Fila.size();
        return tamanho;
    }

}
