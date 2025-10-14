package tp1.ejercicio3;
import java.util.List;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args){
		List<Estudiante> estudiantes = new ArrayList<>();
		List<Profesor> profesores = new ArrayList<>();
		
		Estudiante alumno1 = new Estudiante("Homero","Simpsons","hs@email.com","17839","calle 1");
		Estudiante alumno2 = new Estudiante("Bart","Simpsons","bs@email.com","17839","calle 1");
		Estudiante alumno3 = new Estudiante("Lisa","Simpsons","ls@email.com","17839","calle 1");
		
		Profesor profesor1 = new Profesor("Simur","Skinner","ss@email.com","algoritmos","informatica");
		Profesor profesor2 = new Profesor("Edna","Krabappel","ek@email.com","matematicas","informatica");
		
		estudiantes.add(alumno1);
		estudiantes.add(alumno2);
		estudiantes.add(alumno3);
		
		profesores.add(profesor1);
		profesores.add(profesor2);
		for(int i=0; i<estudiantes.size();i++){
			System.out.println(estudiantes.get(i).tusDatos());
		}
		for(int i=0; i<profesores.size();i++){
			System.out.println(profesores.get(i).tusDatos());
		}
		
		
	} 
}
