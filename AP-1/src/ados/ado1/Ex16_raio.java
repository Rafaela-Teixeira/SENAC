package ados.ado1;

import java.util.Scanner;

public class Ex16_raio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio de uma circunfer�ncia.");
		double R = sc.nextDouble();
		
		double area = 3.14 * (R * R);
		
		System.out.println("A circunfer�ncia � :" + area);
		sc.close();
	}

}
