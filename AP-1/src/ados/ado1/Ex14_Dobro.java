package ados.ado1;

import java.util.Scanner;

public class Ex14_Dobro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor pos�tivo");
		int valor = sc.nextInt();
		
		System.out.println("O dobro de " + valor + " �:" + (valor * 2));
		
		sc.close();
	}

}
