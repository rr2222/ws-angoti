package Exercicio2e3;


public class Circulo {
	
	private static final double PI = 3.14;
	public double raio;
	
	public double calculaArea() {
		return PI*raio * raio;
	}
	
	public double calculaCircunferencia() {
		return 2*PI*raio;
	}
}

