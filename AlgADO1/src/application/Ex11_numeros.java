package application;

import java.util.Scanner;

public class Ex11_numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1° valor: ");
		double A = sc.nextDouble();

		System.out.print("Digite o 2° valor: ");
		double B = sc.nextDouble();
		
		System.out.print("Digite o 3° valor: ");
		double C = sc.nextDouble();
		
		System.out.print("Digite o 4° valor: ");
		double D = sc.nextDouble();
		
		System.out.println("Quadrado do 1° valor: " + A * 2);
		
		System.out.println("Quadrado do 2° valor: " + B * 2);
		
		System.out.println("Quadrado do 3° valor: " + C * 2);
		
		System.out.println("Quadrado do 4° valor: " + D * 2);
		
		System.out.println("A soma dos 4 números é: " + (A + B + C + D));
		
		sc.close();
	}

}
