package ados.ado1;

import java.util.Scanner;

public class Ex13_Troca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor de N1: ");
		int N1 = sc.nextInt();
		System.out.println("Digite o segundo valor de N2: ");
		int N2 = sc.nextInt();
		
		int temp = N1;
		N1 = N2;
		N2 = temp;
		
		System.out.println("Valor de N1 agora " + N1);
		System.out.println("Valor de N2 agora " + N2);
		
		sc.close();
	}

}
