package ados.ado1;

import java.util.Scanner;

public class Ex4_CodigoPeca {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o c�digo da pe�a: ");
	   int CodigoPeca = sc.nextInt();
	   
	   System.out.println("Valor da pe�a: ");
	   double ValorPeca = sc.nextDouble();
	   
	   System.out.println("Quantidade da pe�a: ");
	   int QuantidadePeca = sc.nextInt();
	   
	   double ValorTotal = ValorPeca * QuantidadePeca;
	   
	   System.out.println("O c�digo da pe�a " + CodigoPeca + " tem o valor final de: " + ValorTotal);
	   
	   sc.close();
	}

}
