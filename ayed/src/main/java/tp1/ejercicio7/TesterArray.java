package tp1.ejercicio7;
import java.util.*;
public class TesterArray {
	public static boolean esCapicua(ArrayList<Integer> lista) {
		int pos = 0;
		int longitud = lista.size();
		int med = longitud/2;
		int fin = longitud-1;
		boolean seguir = true;
		while((pos<med)&&(seguir)){
			if(!lista.get(pos).equals(lista.get(fin-pos))){
				seguir = false;
			}else{
				pos = pos+1;
			}
		}
		return seguir;
	}
	public static void main(String[] args){
		ArrayList<Integer> arreglo = new ArrayList<>();
		arreglo.add(1);
		arreglo.add(0);
		arreglo.add(0);
		arreglo.add(1);
		System.out.println(esCapicua(arreglo));
	}
}
