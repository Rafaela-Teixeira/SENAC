package ados.ado1;

import java.util.Scanner;

public class Ex18_AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo");
		double base = sc.nextDouble();
		System.out.println("Digite a altura do tri�ngulo");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A �rea do tri�ngulo �: " + area);
		
		sc.close();
		
	}
	
}
