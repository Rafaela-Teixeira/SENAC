package application;

import java.util.Scanner;

public class Ex4_CodigoPeca {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o código da peça: ");
	   int CodigoPeca = sc.nextInt();
	   
	   System.out.println("Valor da peça: ");
	   double ValorPeca = sc.nextDouble();
	   
	   System.out.println("Quantidade da peça: ");
	   int QuantidadePeca = sc.nextInt();
	   
	   double ValorTotal = ValorPeca * QuantidadePeca;
	   
	   System.out.println("O código da peça " + CodigoPeca + " tem o valor final de: " + ValorTotal);
	   
	   sc.close();
	}

}
