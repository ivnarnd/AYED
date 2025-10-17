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

	public  int contarHojas() {
		int hojas = 0;
		if(this.isLeaf()) {
			hojas = 1;
		}else {
			if(this.hasLeftChild()) {
				hojas = hojas + this.getLeftChild().contarHojas();
			}
			if(this.hasRightChild()) {
				hojas = hojas + this.getRightChild().contarHojas();
			}
		}	
		return hojas;
	}
		
		
    	 
    public BinaryTree<T> espejo(){
	   BinaryTree<T> espe = new BinaryTree<T>();
	   espe.setData(this.getData());
	   if(this.hasRightChild()) {
		   espe.addLeftChild(this.getRightChild().espejo());
	   }
	   if(this.hasLeftChild()){
		   espe.addRightChild(this.getLeftChild().espejo());
	   }
 	   return espe;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
			BinaryTree<T> ab = new BinaryTree<>();
			Queue<BinaryTree<T>> cola = new Queue<>();
			int nivel = 0;
			cola.enqueue(this);
			cola.enqueue(null);
			while(!cola.isEmpty()) {
				ab = cola.dequeue();
				if(ab != null){
					if(((n<=nivel)&&(nivel <= m))){
						System.out.print(ab.getData());
					}
					if(ab.hasLeftChild()){
						cola.enqueue(ab.getLeftChild());
					}
					if(ab.hasRightChild()) {
						cola.enqueue(ab.getRightChild());
					}
				}else if(!cola.isEmpty()) {
					System.out.println();
					nivel = nivel + 1;
					cola.enqueue(null);
				}
			}
	}
	public void preOrden(){
		System.out.println(this.getData());
		if(this.hasLeftChild()){
			this.getLeftChild().preOrden();
		}
		if(this.hasRightChild()) {
			this.getRightChild().preOrden();
		}
	}
}

