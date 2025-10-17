package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;

/*
 * 			10
 * 		   /  \
 * 		 2		14
 * 	    / \	   /  \
 * 	   5   4  6    6
 * 	  / \ / \ / \/  \
 * */
public class RedBinariaLlena {
	BinaryTree <Integer> ab;
	public RedBinariaLlena(BinaryTree<Integer> ab){
		this.ab = ab;
	}
	public int calculoRetardo(BinaryTree<Integer> ab){
		int retardoIzquierdo = 0;
		int retardoDerecho = 0;
		int retardo = 0;
		if(ab.isLeaf()){
			return ab.getData();
		}
		if(ab.hasLeftChild()){
			retardoIzquierdo = calculoRetardo(ab.getLeftChild());
		}
		if(ab.hasRightChild()){
			retardoDerecho = calculoRetardo(ab.getRightChild());
		}
		if(retardoIzquierdo>=retardoDerecho){
			retardo = retardoIzquierdo;
		}else {
			retardo = retardoDerecho;
		}
		return this.ab.getData()+retardo;
	}
	public int retardoReenvio(){
		if(this.ab.isEmpty()){
			return 0;
		}
		return calculoRetardo(this.ab);
	}
	public static void main(String []args){
		BinaryTree<Integer> a = new BinaryTree<>(10);
		BinaryTree<Integer> hi = new BinaryTree<>(2);
		BinaryTree<Integer> hd = new BinaryTree<>(3);
		a.addLeftChild(hi);
		a.addRightChild(hd);
		RedBinariaLlena rb = new RedBinariaLlena(a);
		int retardo = rb.retardoReenvio();
		System.out.println("El retardo mas grande es : "+retardo);
 	}
}
