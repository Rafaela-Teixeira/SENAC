package aulas.aula5;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		double a, b;
		String operacaoStr;
		char operacao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("<A>di��o");
		System.out.println("<S>ubtra��o");
		System.out.println("<M>ultiplica��o");
		System.out.println("<D>ivis�o");
		System.out.println("<A>di��o");

		operacaoStr = entrada.next();
		operacao = operacaoStr.charAt(0);

		System.out.println("1o operando: ");
		a = entrada.nextDouble();
		System.out.println("2o operando ");
		b = entrada.nextDouble();

		switch (operacao) {
		case 'a':
		case 'A':
			System.out.println("Soma: " + (a + b));
			break;
		case 's':
		case 'S':
			System.out.println("Diferen�a: " + (a - b));
			break;
		case 'm':
		case 'M':
			System.out.println("Produto: " + (a * b));
			break;
		case 'd':
		case 'D':
			System.out.println("Quociente: " + (a / b));
			break;
		default:
			System.out.println("A opera��o " + operacaoStr + " n�o � v�lida!");
		}
		entrada.close();
	}

}
