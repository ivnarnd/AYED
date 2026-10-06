package tp2.ejercicio3;
import tp2.ejercicio1.*;
import java.util.*;
public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> ab) {
		this.arbol = ab;
	}
	
	public List<Integer> pares(){
		List<Integer> pares = new LinkedList<Integer>();
		if(!this.arbol.isEmpty()) {
			recorridoInOrden(arbol,pares);
		}
		return pares;
	}
	private void recorridoInOrden(BinaryTree<Integer> arb,List<Integer> list){
		if(arb.hasLeftChild()) {
			recorridoInOrden(arb.getLeftChild(), list);
		}
		if(arb.getData() % 2 == 0) {
			list.add(arb.getData());
		}
		if(arb.hasRightChild()) {
			recorridoInOrden(arb.getRightChild(),list);
		}
	}
	
	private void recorridoPostOrden(BinaryTree<Integer> arb,List<Integer> list) {
		if(arb.hasLeftChild()) {
			recorridoPostOrden(arb.getLeftChild(),list);
		}
		if(arb.hasRightChild()) {
			recorridoPostOrden(arb.getRightChild(),list);
		}
		if(arb.getData() % 2 == 0) {
			list.add(arb.getData());
		}
	}
}
