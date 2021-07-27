package ados.ado1;

import java.util.Scanner;

public class Ex6_Quadrado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		double Numero = sc.nextDouble();

		System.out.println("O valor ao quadrado � " + Numero * 2);

		sc.close();
	}
}
