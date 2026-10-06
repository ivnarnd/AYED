package tp2.ejercicio3;
import tp2.ejercicio1.*;
import java.util.*;
public class TestEjercicio3 {
		
		public static void main(String[] args) {
			
			BinaryTree<Integer> arbol =  new BinaryTree<Integer>(1);
			BinaryTree<Integer> nodo;
			nodo = new BinaryTree<Integer>(17);
			arbol.addLeftChild(nodo);
			nodo =  new BinaryTree<Integer>(18);
			arbol.addRightChild(nodo);
			
			arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(2));
			arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(7));
			
			arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(9));
			arbol.getRightChild().addRightChild(new BinaryTree<Integer>(4));
			
			
			ContadorArbol test = new ContadorArbol(arbol);
			List<Integer> listaPares = test.pares();
			for(int elemento : listaPares) {
				System.out.print(elemento+" ");
			}
			
			
		}
}
