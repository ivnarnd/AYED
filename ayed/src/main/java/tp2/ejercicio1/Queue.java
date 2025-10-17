package tp2.ejercicio1;
import java.util.*;
public class Queue<T> extends Sequence<T> {
    protected List<T> data;
    public Queue(){
        this.data = new LinkedList<T>();
    }
    public void enqueue(T dato){
        //agrega al final
        this.data.add(dato);
    }
    public T dequeue(){
        return this.data.remove(0);
    }
    public T head(){
        return this.data.get(0);
    }
    @Override
    public int size(){
        return this.data.size();
    }
    @Override
    public boolean isEmpty(){
        return this.data.size()==0;
    }
    @Override
    public String toString(){
        String str = "[";
        for(T d:data){
            str = str + d.toString() + ",";
        }
        str = str.substring(0, str.length()-2) + "]";
        return str;
    }
}
