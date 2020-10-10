package Exercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine();
		
		System.out.print(palavra.toUpperCase());
		sc.close();

	}

}
