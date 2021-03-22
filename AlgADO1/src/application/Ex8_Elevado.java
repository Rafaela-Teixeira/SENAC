package application;

import java.util.Scanner;

public class Ex8_Elevado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		
		double Resultado = Math.pow(A, B);

		
		System.out.println("O valor de A elevado a B é: " + Resultado);
		
		sc.close();
	}

}
