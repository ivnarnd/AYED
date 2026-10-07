package tp2.ejercicio5;
import tp2.ejercicio1.*;
public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> ab;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> ab) {
		this.ab = ab;
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		int nivel = 0;
		BinaryTree<Integer> ab = null;
		Queue<BinaryTree<Integer>> cola = new Queue<>();
		cola.enqueue(this.ab);
		cola.enqueue(null);
		while(!cola.isEmpty() && nivel <= p) {
			ab = cola.dequeue();
			if(ab != null) {
				if(nivel == p) {
					suma = suma + ab.getData();
				}
				if(ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if(ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			}else if(!cola.isEmpty()) {
				nivel = nivel + 1;
				cola.enqueue(null);
			}
		}
		return suma;
	}
	

}
