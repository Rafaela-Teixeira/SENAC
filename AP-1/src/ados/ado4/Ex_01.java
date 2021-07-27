package ados.ado4;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	  System.out.println("Digite um número: ");
	
	  int numero = sc.nextInt();
        int resultado = numero % 3;
        
      
		switch (resultado) {
		case 0:
		System.out.println("O número " + numero + " é divisível");
		break;
		
		default:
			System.out.println("Não é divisível! ");
		
		}

	}

}
