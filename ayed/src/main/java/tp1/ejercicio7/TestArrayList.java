package tp1.ejercicio7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import tp1.ejercicio3.Estudiante;

import java.util.Iterator;

public class TestArrayList {
	public static void recorrerArray(List<Estudiante>lista){
		Iterator<Estudiante> iterador = lista.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next().tusDatos());
		}
	}
	public static void crearListaE(){
		
		List <Estudiante> estudiantes = new ArrayList<Estudiante>();	
		List<Estudiante> copia2 = new ArrayList<Estudiante>();
		
		copia2.addAll(estudiantes);
		
		estudiantes.add(new Estudiante("Homero","Simpsons","hs@email.com","17839","calle 1"));
		estudiantes.add(new Estudiante("Bart","Simpsons","bs@email.com","17839","calle 1"));
		estudiantes.add(new Estudiante("Lisa","Simpsons","ls@email.com","17839","calle 1"));
		
		List<Estudiante> copia = new ArrayList<>(estudiantes); 
		
		System.out.println("Original");
		recorrerArray(estudiantes);
		System.out.println("Copia");
		recorrerArray(copia);
		
		System.out.println("Modificacion");
		Estudiante estudiante1 = estudiantes.getFirst();		
		estudiante1.setApellido("Aranda");
		
		System.out.println("Original");
		recorrerArray(estudiantes);
		System.out.println("Copia");
		recorrerArray(copia);
		copia2.addAll(estudiantes);
		System.out.println("Copia con addAll");
		recorrerArray(copia2);
		System.out.println("Copia con Clone");
		Estudiante estudiante4 =  new Estudiante("Jimbo","Jones","jj@email","1732","calle 2");
		if(estudiantes.contains(estudiante4)){
			System.out.println("Se encuentra en la lista ");
		}else {
			estudiantes.add(estudiante4);
			System.out.println("No se encuentra en la lista. se agrego");
		}
		if(estudiantes.contains(estudiante4)){
			System.out.println("Se encuentra en la lista ");
		}else {
			estudiantes.add(estudiante4);
			System.out.println("No se encuentra en la lista. se agrego");
		}
		//se copian las referencias de los estudiantes
		//existen tambien formas de copiar Listas como .clone() y addAll() clone lo que hace es copiar solo los valores y addAll como pasarlo al inicio lo que hacen es copiar tal cual las referencias
   }
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		List<Integer> listaNum = new ArrayList<>();//LinkedList<>(); solo deberia cambiar esta linea ya que List<> me permite abstraerme de la implementacion de los metodos para interactuar con la misma
		
		crearListaE();
		
		int entrada = s.nextInt();
		while(entrada!=0) {
			listaNum.add(entrada);
			entrada = s.nextInt();
		}
		s.close();
		for(Integer i:listaNum) {
			System.out.println(i);
		}
		//otro tipo de muestra de elementos
		Iterator<Integer> itLis = listaNum.iterator();
		while(itLis.hasNext()) {
			System.out.println(itLis.next().intValue());
		}
	}
}
