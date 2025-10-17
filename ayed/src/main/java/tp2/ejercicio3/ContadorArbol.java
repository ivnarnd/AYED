package tp2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp2.ejercicio1.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> arbol){
		this.arbol = arbol;
	}
	private void postOrden(BinaryTree<Integer>nodo,List<Integer> pares){
		if(nodo.hasLeftChild()){
			postOrden(nodo.getLeftChild(),pares);
		}
		if(nodo.hasRightChild()) {
			postOrden(nodo.getRightChild(),pares);
		}
		if(nodo.getData() % 2 == 0) {
			pares.add(nodo.getData());
		}
	}
	private void inOrden(BinaryTree<Integer>nodo,List<Integer> pares){
		if(nodo.hasLeftChild()){
			inOrden(nodo.getLeftChild(),pares);
		}
		if(nodo.getData() % 2 == 0) {
			pares.add(nodo.getData());
		}
		if(nodo.hasRightChild()) {
			inOrden(nodo.getRightChild(),pares);
		}
	}
	public List<Integer> numerosPares(){
		List<Integer> lp = new ArrayList<>();
		inOrden(this.arbol,lp);
		return lp;
	}
	
	public static void main(String []args){
		BinaryTree<Integer> ab = new BinaryTree<>(8);
		
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(2);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(4));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(5));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(3);
		hijoDerecho.addLeftChild(new BinaryTree<Integer>(6));
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		ContadorArbol ca = new ContadorArbol(ab);
		List<Integer> listaPares = ca.numerosPares();
		for(int p:listaPares){
			System.out.println(p);
		}
	}

}
