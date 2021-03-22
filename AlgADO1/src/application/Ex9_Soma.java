package application;

import java.util.Scanner;

public class Ex9_Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de N1: ");
		float N1 = sc.nextFloat();

		System.out.print("Digite o valor de N2: ");
		float N2 = sc.nextFloat();

		double resultado = N1 + N2;
		System.out.println("O valor de N1 é: " + N1 + " e o valor de N2 é " + N2);

		System.out.println("O soma dos dois números é: " + resultado);

		sc.close();
	}

}
