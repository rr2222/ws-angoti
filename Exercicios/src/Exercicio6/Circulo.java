package Exercicio6;

public class Circulo {
	private static final double PI = 3.14;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return PI*raio * raio;
	}
	
	public double calculaCircunferencia() {
		return 2*PI*raio;
	}
	
	public void imprimeArea_Circunferencia(){
		System.out.println(this.calculaArea());
		System.out.println(this.calculaCircunferencia());
		System.out.println("-----------------------");
		
	}
}
