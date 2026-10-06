package tp2.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> extends Sequence{
	private List<T> data;
	
	public Queue() {
		//se usa LinkedList que tiene una referencia al inicio y otra al final
		this.data = new LinkedList<T>();
	}
	public void enqueue(T data) {
		//agrega al final
		this.data.add(data);
	}
	public T dequeue() {
		//remueve y devuelve el tope
		return this.data.remove(0);
	}
	public T head() {
		return data.get(0);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.data.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.data.isEmpty();
	}
	
	@Override
	public String toString(){
		String str = "[";
		for(T d:data) {
			str = str+d+",";
		}
		str = str.substring(0,str.length()-2)+"]";
		return str;
	}
	

}
