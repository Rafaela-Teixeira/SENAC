package ados.ado1;

import java.util.Scanner;

public class Ex7_Produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double Num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double Num2 = sc.nextDouble();
		
		System.out.println("O produto desses n�meros �: " + Num1 * Num2);
		
		
		sc.close();
		
		

	}

}
