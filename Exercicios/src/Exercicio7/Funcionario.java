package Exercicio7;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorHoraTrabalhada;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorHoraTrabalhada) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	public double calculaSalario() {
		return this.valorHoraTrabalhada * this.horasTrabalhadas;
	}
	
	public String toString() {
		return this.nome + ", " + calculaSalario();
	}	
}
