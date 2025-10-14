package tp1.ejercicio7;
import java.util.*;
public class EjercicioSucesion {
	public static void generarSucesion(int n,List<Integer> lista){
		if(n==1){
			lista.add(1);
		}else {
			lista.add(n);
			if(n % 2==0){
				generarSucesion(n/2,lista);
			}else{
				generarSucesion(3*n+1,lista);
			}
		}
	}
	public static List<Integer> calcularSucesion (int n) {
		List<Integer> lista = new ArrayList<>();
		generarSucesion(n,lista);
		return lista;
	}
	public static void invertirArray(ArrayList<Integer> lista,int pos,int fin){
		if(pos<fin){
			int tmp = lista.get(fin);
			lista.set(fin, lista.get(pos));
			lista.set(pos,tmp);
			invertirArray(lista,pos+1,fin-1);
		}
	}
	public static void invertirArrayList(ArrayList<Integer> lista) {
			if(lista.size()>1){
				invertirArray(lista,0,lista.size()-1);
			}
	}
	private static int sumarRecursivoHelper(Iterator<Integer> iterador) {
        if (!iterador.hasNext()) {
            return 0;
        }
        int actual = iterador.next();
        return actual + sumarRecursivoHelper(iterador);
    }
	public static int sumarLinkedList(LinkedList<Integer> lista){
		return sumarRecursivoHelper(lista.iterator());
	}
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int puntero1 = 0; // Puntero para la lista1
        int puntero2 = 0; // Puntero para la lista2
        while (puntero1 < lista1.size() && puntero2 < lista2.size()) {
            if (lista1.get(puntero1) < lista2.get(puntero2)) {
                resultado.add(lista1.get(puntero1));
                puntero1++;
            } else {
                resultado.add(lista2.get(puntero2));
                puntero2++;
            }
        }
        while (puntero1 < lista1.size()) {
            resultado.add(lista1.get(puntero1));
            puntero1++;
        }
        while (puntero2 < lista2.size()) {
            resultado.add(lista2.get(puntero2));
            puntero2++;
        }
        return resultado;
    }
	public static void main(String[] args) {

		List<Integer> listaNum = calcularSucesion(6);
		ArrayList<Integer> listaAInvertir = new ArrayList<>();
		for(int i : listaNum){
			System.out.print(i+" ");
			listaAInvertir.add(i);
		}
		System.out.println(" ");
		invertirArrayList(listaAInvertir);
		LinkedList<Integer> listaEnlazada = new LinkedList<>();
		for(int i : listaAInvertir) {
			System.out.print(i+" ");
			listaEnlazada.add(i);
		}
		int resultado = sumarLinkedList(listaEnlazada);
		System.out.println("La suma de todos los elementos de la lista es: "+resultado);
		ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,4,5,7,12,15,18));
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(2,6,9,12,16,17,18,19));
		ArrayList<Integer> listaN = combinarOrdenado(lista1,lista2);
		System.out.print("Lista Combinada");
		for(int i : listaN) {
			System.out.print(i+" ");
		}
	}

}
