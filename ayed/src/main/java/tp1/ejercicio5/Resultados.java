package tp1.ejercicio5;

public class Resultados {
	private int min;
	private int max;
	private int prom;
	public Resultados(int min,int max,int prom){
		this.min=min;
		this.max = max;
		this.prom = prom;
	}
	public int getMin(){
		return this.min;
	}
	public void setMin(int min){
		this.min = min;
	}
	public void setMax(int max){
		this.max = max;
	}
	public int getMax(){
		return this.max;
	}
	public void setProm(int prom){
		this.prom = prom;
	}
	public int getProm(){
		return this.prom;
	}
}
