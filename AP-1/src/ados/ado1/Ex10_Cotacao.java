package ados.ado1;

import java.util.Scanner;

public class Ex10_Cotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cota��o do d�lar: ");
		double cotacao = sc.nextDouble();
		
		System.out.print("Digite a quantidade em d�lar: ");
		double quantidade = sc.nextDouble();
		
		System.out.println("O valor em real �: " + cotacao * quantidade);
		
		sc.close();
	
	}

}
