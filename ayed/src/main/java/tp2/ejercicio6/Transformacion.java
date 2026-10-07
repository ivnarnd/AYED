package tp2.ejercicio6;
import tp2.ejercicio1.*;
public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> ab) {
		this.arbol = ab;
	}
	
	public BinaryTree<Integer> suma(){
		if(arbol!=null && !arbol.isEmpty()) {
			recorridoPostOrden(arbol);
		}
		return arbol;
	}
	private int recorridoPostOrden(BinaryTree<Integer> ab) {
		int sumD = 0;
		int sumI = 0;
		int sum = 0;
		if(ab.hasLeftChild()) {
			sumI = recorridoPostOrden(ab.getLeftChild());
		}
		if(ab.hasRightChild()) {
			sumD = recorridoPostOrden(ab.getRightChild());
		}
		sum = sumI+sumD+ab.getData();
		ab.setData(sumI+sumD);
		return sum;
	}
	
}


