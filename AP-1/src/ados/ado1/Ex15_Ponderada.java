package ados.ado1;

import java.util.Scanner;

public class Ex15_Ponderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = sc.nextDouble();

		double mediaPonderada = ((nota1 * 6) + (nota2 * 4)) / (6 + 4);
		
		System.out.println("A nota final � " + mediaPonderada);
		
		sc.close();
	}

}
