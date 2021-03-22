package application;

import java.util.Scanner;

public class Ex18_AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo");
		double base = sc.nextDouble();
		System.out.println("Digite a altura do triângulo");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A área do triângulo é: " + area);
		
		sc.close();
		
	}
	
}
