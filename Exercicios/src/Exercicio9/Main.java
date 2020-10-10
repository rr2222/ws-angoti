package Exercicio9;

import Exercicio7.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Joao", 20, 3.50);
		Funcionario funcionario2 = new Funcionario("Mateus", 40, 5.50);
		Funcionario funcionario3 = new Funcionario("Lucas", 40, 13.50);
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(funcionario3);
	}

}
