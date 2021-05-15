package application;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
	        int x;
	          System.out.println("Digite um valor: ");
	        x = entrada.nextInt();
	        for (int i = 1; i <= x; i++){
	            if (i%2 == 1)
	                System.out.println(i + " é número ímpar!");
	            
	        }

	}

}
