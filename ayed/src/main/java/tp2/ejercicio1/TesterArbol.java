package tp2.ejercicio1;

public class TesterArbol {
	public static void main(String[]args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(1);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(2);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(4));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(5));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(3);
		hijoDerecho.addLeftChild(new BinaryTree<Integer>(6));
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		ab.preOrden();
		BinaryTree<Integer>espejo = ab.espejo();
		espejo.preOrden();
		ab.entreNiveles(1, 2);
	}

}
