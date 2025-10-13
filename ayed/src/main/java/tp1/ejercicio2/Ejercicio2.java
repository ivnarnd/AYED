package tp1.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio2 {
	public static List<Integer> multiplosN(int n){
		List<Integer> multiplos = new ArrayList<>();
		for(int i=1;i<=n;i++){
			multiplos.add(i*n);
		}
		return multiplos;
	}
	public static void main(String[] args) {
		List<Integer> multiplos;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(n != 0 ) {
			multiplos = Ejercicio2.multiplosN(n);
			System.out.println(multiplos);
			n = s.nextInt();
		}
		s.close();

	}

}
