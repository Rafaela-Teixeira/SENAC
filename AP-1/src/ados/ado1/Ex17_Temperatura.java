package ados.ado1;

import java.util.Scanner;

public class Ex17_Temperatura {

	public static void main(String[] args) {

		// (C = (5/9) * (F-32)).
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor o grau em Fahrenheit");
		double F = sc.nextDouble();

		double C = (F - 32.0) * (5.0 / 9.0);

		System.out.println("A temperatura em Celcius � de " + C + "�");
		
		sc.close();
	}

}
