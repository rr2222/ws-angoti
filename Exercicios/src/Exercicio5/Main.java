package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma Palavra");
		String palavra1 = sc.nextLine();
		System.out.println("Insira outra Palavra");
		String palavra2 = sc.nextLine();
		
		if(palavra1.equals(palavra2)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		sc.close();
	}

}
