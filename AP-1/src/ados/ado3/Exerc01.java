package ados.ado3;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	  System.out.println("Digite um n�mero: ");
	
	  int numero = sc.nextInt();
        int resultado = numero % 3;
        
      
		switch (resultado) {
		case 0:
		System.out.println("O n�mero " + numero + " � divis�vel");
		break;
		
		default:
			System.out.println("N�o � divis�vel! ");
		
		}

	}

}

