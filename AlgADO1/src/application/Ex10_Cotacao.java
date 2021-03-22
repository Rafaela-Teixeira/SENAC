package application;

import java.util.Scanner;

public class Ex10_Cotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dólar: ");
		double cotacao = sc.nextDouble();
		
		System.out.print("Digite a quantidade em dólar: ");
		double quantidade = sc.nextDouble();
		
		System.out.println("O valor em real é: " + cotacao * quantidade);
		
		sc.close();
	
	}

}
