package ados.ado2;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int i = 0, n, r;
	        
	        System.out.println("Digite um valor e veja sua tabuada: ");
	        n = entrada.nextInt();
	        
	        do {
	           if (n >= 2 && n <= 1000){
	               i++;
	               r = n * i;
	               System.out.println(i + " x " + n + " = " + r);
	           } else {
	               System.out.println("N�mero inv�lido!");
	               break;
	           }
	        } while (i < 10);
	        
	    
	}

}
