package aulas.aula3;

import java.util.Scanner;

public class SomaInteiros {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o valor de N1: ");
	int n1 = entrada.nextInt();
	
	System.out.print("Digite o valor de N2");
	int n2 = entrada.nextInt();
	
	int soma = n1 + n2;
	
	System.out.println("O valor de soma é " +soma);
	
	entrada.close();
}

}
