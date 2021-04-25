package application;

import java.util.Scanner;

public class Ex14_Dobro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor posítivo");
		int valor = sc.nextInt();
		
		System.out.println("O dobro de " + valor + " é:" + (valor * 2));
		
		sc.close();
	}

}
