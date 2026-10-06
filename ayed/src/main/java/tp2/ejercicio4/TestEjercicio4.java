package tp2.ejercicio4;
import tp2.ejercicio1.*;
public class TestEjercicio4 {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(10);
		
		BinaryTree<Integer> ab = new BinaryTree<Integer>(10);
		
		ab.addLeftChild(new BinaryTree<Integer>(2));
		ab.addRightChild(new BinaryTree<Integer>(3));
		
		ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
		ab.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		
		ab.getRightChild().addLeftChild(new BinaryTree<Integer>(9));
		ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
		
		ab.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
		ab.getLeftChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		
		ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(5));
		ab.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(6));
		
		
		ab.getRightChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(12));
		ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		
		ab.getRightChild().getRightChild().addLeftChild(new BinaryTree<Integer>(2));
		ab.getRightChild().getRightChild().addRightChild(new BinaryTree<Integer>(1));
		
		
		RedBinariaLlena test = new RedBinariaLlena(ab);
		
		System.out.println(test.retardoReenvio());
		
		
	}

}
