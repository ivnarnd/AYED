package tp1.ejercicio1;

public class Ejercicio1 {
	public static void withWhile(int a,int b){
		while(a<=b){
			System.out.println(a);
			a = a+1;
		}
	}
	public static void withFor(int a, int b){
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
	public static void withRecursion(int a,int b){
		if(a > b) {
			return;
		}
		if(a<=b){
			System.out.println(a);
			withRecursion(a+1,b);
		}
	}
	public static void main(String[] args) {
		int a =10;
		int b = 20;
		withWhile(a,b);
		System.out.println();
		withFor(a,b);
		System.out.println();
		withRecursion(a,b);
	}

}
