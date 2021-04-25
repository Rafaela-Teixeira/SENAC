package Aula2;

import java.util.Scanner;

public class CalculaMediaCondicionais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float n1, n2, n3, media;
		int faltas;
		char grade = 'A';

		String nomeAluno;
		System.out.println("*--* Calcula Média *--*");
		System.out.println("Nome: ");
		nomeAluno = entrada.next();
		System.out.println("N1: ");
		n1 = entrada.nextFloat();
		System.out.println("N2: ");
		n2 = entrada.nextFloat();
		System.out.println("N3: ");
		n3 = entrada.nextFloat();
		media = (n1 + n2 + n3) / 3;

		System.out.println("Quantas faltas foram? ");
		faltas = entrada.nextInt();

		if ((media >= 6) && (faltas <= 18)) {
			System.out.println(nomeAluno + " está APROVADO com Média: " + media + "\n e APROVADO com faltas: " + faltas);

		} else if ((media >= 6) && (faltas > 18)) {
			System.out.println(nomeAluno + " está REPROVADO por FALTA: " + faltas);
		} else if ((media < 6) && (faltas > 18)) {
			System.out.println(nomeAluno + " está REPROVADO com Média: " + media + "\n e POR FALTA: " + faltas);
		} else {
			System.out.println(nomeAluno + " está REPROVADO com Média: " + media);
		}

		// Encontrar conceito das notas
		if (media >= 9)
			grade = 'A';
		else if (media >= 8 && media < 9)
			grade = 'B';
		else if (media >= 7 && media < 8)
			grade = 'C';
		else if (media >= 6 && media < 7)
			grade = 'D';
		else if (media < 6)
			grade = 'E';

		switch (grade) {
		case 'A':
			System.out.println("Excelente - Conceito: " + grade);
			break;
		case 'B':
			System.out.println("Bem feito - Conceito: " + grade);
			break;
		case 'C':
			System.out.println("Você passou - Conceito: " + grade);
			break;
		case 'D':
			System.out.println("Melhor tentar novamente - Conceito: " + grade);
			break;
		case 'E':
			System.out.println("Você reprovou - Conceito: " + grade);
			break;
		default:
			System.out.println("Conceito inválido!!!");
		}

	}

	// conceito A (media >= 9)
	// conceito B (8 <= media < 9)
	// onceito C (7 <= media < 8)
	// conceito D (6 <= media <7)
	// conceito E ( media < 6)
}
