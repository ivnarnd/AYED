package tp1.ejercicio5;

public class MaxMinProm {
	private static int minimo = 0;
	private static int maximo = 0;
	private static int promedio = 0;
	//metodo con devolucion en el return
	public static int[] MaxMinPromWithRet(int[]num){
		int[] result = new int[3];//en 0 el max,en 1 el min y en 2 el prom
		int sum = 0;
		int min = 2147483647;
		int max =  -2147483648;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max){
				max = num[i];
			}
			if(num[i]<min){
				min = num[i];
			}
			sum = sum + num[i];
		}
		result[0] = max;
		result[1] = min;
		result[2] = sum/num.length;
		return result;
	}
	//metodo con devolucion con parametro
	public static void MaxMinPromWithArg(int[]num,Resultados res){
		int min = 2147483647;
		int max =  -2147483648;
		int prom=0;
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max){
				max = num[i];
			}
			if(num[i]<min){
				min = num[i];
			}
			sum = sum + num[i];
		}
		prom = sum/num.length;
		res.setMax(max);
		res.setMin(min);
		res.setProm(prom);
	}
	public static void MaxMinPromWithVoid(int[]num){
		int min = 2147483647;
		int max =  -2147483648;
		int prom=0;
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max){
				max = num[i];
			}
			if(num[i]<min){
				min = num[i];
			}
			sum = sum + num[i];
		}
		prom = sum/num.length;
		maximo = max;
		minimo = min;
		promedio = prom;
	}
	public static void main(String[] args) {
		int[] arre = {5,4,10,9,8};
		int[] result = MaxMinProm.MaxMinPromWithRet(arre);
		Resultados res = new Resultados(0,0,0);
		MaxMinProm.MaxMinPromWithArg(arre,res);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		MaxMinProm.MaxMinPromWithVoid(arre);
		System.out.println(res.getMin()+" "+res.getMax()+" "+res.getProm());
		System.out.println(maximo+" "+minimo+" "+promedio);
	}

}
