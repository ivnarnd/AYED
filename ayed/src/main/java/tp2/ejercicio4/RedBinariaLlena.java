package tp2.ejercicio4;
import tp2.ejercicio1.*;

public class RedBinariaLlena {
	private BinaryTree<Integer> ab;
	
	
	public RedBinariaLlena(BinaryTree<Integer> ab) {
		this.ab = ab;
	}
	
	public int retardoReenvio() {
		int retardo = 0;
		if(!ab.isEmpty()) {
			retardo = recorridoPostOrden(ab);
		}
		return retardo;
	}
	
	private int recorridoPostOrden(BinaryTree<Integer> ab) {
		int retD = 0;
		int retI = 0;
		int ret = 0;
		if(ab.hasLeftChild()) {
			retI = recorridoPostOrden(ab.getLeftChild());
		}
		if(ab.hasRightChild()) {
			retD = recorridoPostOrden(ab.getRightChild());
		}
		if(retI>retD) {
			ret = ret + retI;
		}else {
			ret = ret + retD;
		}
		return ab.getData()+ret;
	}
}
