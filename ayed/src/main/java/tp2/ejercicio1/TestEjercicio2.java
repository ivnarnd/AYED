package tp2.ejercicio1;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(21);
		BinaryTree<Integer> hi =  new BinaryTree<Integer>(30);
		BinaryTree<Integer> hd =  new BinaryTree<Integer>(28);
		hi.addLeftChild(new BinaryTree<Integer>(4));
		hi.addRightChild(new BinaryTree<Integer>(9));
		hd.addLeftChild(new BinaryTree<Integer>(3));
		arbol.addLeftChild(hi);
		arbol.addRightChild(hd);
		arbol.entreNiveles(1,2);

	}

}
