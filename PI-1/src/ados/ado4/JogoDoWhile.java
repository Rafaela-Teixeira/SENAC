package ados.ado4;

import java.util.Scanner;

public class JogoDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcoes;

		do {
			System.out.println("Digite uma das opções abaixo: ");
			System.out.println("1 - Instruções \n2 - Jogar \n3 - Créditos \n4 - Sair");
			opcoes = sc.nextInt();

			switch (opcoes) {

			case 1:
				System.out.println("A instruções são simples, não morra!");
				break;
			case 2:
				System.out.println("Vamos começar essa batalha? ");
				break;
			case 3:
				System.out.println("Criado por Rafaela Teixeira");
				break;

			}

		} while (opcoes != 4);
        System.out.println("Saiu do jogo!");
	}

}
