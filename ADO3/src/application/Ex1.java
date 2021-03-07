package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		
		double valorDaCompra = entrada.nextInt();		
		double valorDesconto = 0;
		
		if (valorDaCompra >= 300) { 
			valorDesconto = valorDaCompra * 0.2;			
			double valorFinal = valorDaCompra - valorDesconto;			
			
			System.out.println("Valor da Compra: " + valorFinal);
			System.out.println("Valor do Desconto: " + valorDesconto +"(20%)");
			
		}else { 
			valorDesconto = valorDaCompra * 0.15;			
			double valorFinal = valorDaCompra - valorDesconto;			
			
			System.out.println("Valor da Compra: " + valorFinal);
			System.out.println("Valor do Desconto: " + valorDesconto +"(15%)");
		}
			
		
		entrada.close();

	}

}
