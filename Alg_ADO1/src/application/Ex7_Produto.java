package application;

import java.util.Scanner;

public class Ex7_Produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double Num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double Num2 = sc.nextDouble();
		
		System.out.println("O produto desses números é: " + Num1 * Num2);
		
		
		sc.close();
		
		

	}

}
