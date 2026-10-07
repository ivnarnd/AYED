package tp2.ejercicio1;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}
	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	//Ejercicio2
	public  int contarHojas() {
	   int cont = 0;
	   if(this.isLeaf()) {
		   cont = 1;
	   }else {
		   if(this.hasLeftChild()) {
			   cont = cont + this.getLeftChild().contarHojas();
		   }
		   if(this.hasRightChild()) {
			   cont =  cont + this.getRightChild().contarHojas();
		   }
	   }
	   return cont;
	}
		
		
    	 
    public BinaryTree<T> espejo(){
       BinaryTree<T> espejo = new BinaryTree<T>();
	   espejo.setData(this.getData());
	   if(this.hasLeftChild()) {
		   espejo.addRightChild(this.getLeftChild().espejo());
	   }
	   if(this.hasRightChild()) {
		   espejo.addLeftChild(this.getLeftChild().espejo());
	   }
	   return espejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>>cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		while(!cola.isEmpty() && nivel <= m){
			ab = cola.dequeue();
			if(ab!= null) {
				if(nivel >= n && nivel <= m) {
					System.out.print(ab+" ");
				}
				if(ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if(ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			}else if(!cola.isEmpty()) {
				nivel = nivel + 1;//incremento de nivel
				System.out.println();//marca grafica de incremento de nivel
				cola.enqueue(null);//marca de fin de nivel
			}	
		}
   }
		
}

