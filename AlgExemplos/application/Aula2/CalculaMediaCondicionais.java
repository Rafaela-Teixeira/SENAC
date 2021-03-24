package Aula2;

import java.util.Scanner;

public class CalculaMediaCondicionais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float n1, n2, n3, media;
		int faltas;

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
			System.out.println(nomeAluno + " está APROVADO com média: " + media + " e APROVADO com faltas: " + faltas);

		} else if ((media >= 6) && (faltas > 18)) {
			System.out.println(nomeAluno + " está REPROVADO POR FALTA: " + faltas);
		} else if ((media < 6) && (faltas > 18)) {
			System.out.println(nomeAluno + " está REPROVADO POR Média: " + media + " e POR FALTA: " + faltas);
		} else {
			System.out.println(nomeAluno + " está REPROVADO com Média: " + media);
		}

	}

}
