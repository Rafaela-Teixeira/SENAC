package ados.ado4;

import java.util.Scanner;

public class JogoDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcoes;

		do {
			System.out.println("Digite uma das op��es abaixo: ");
			System.out.println("1 - Instru��es \n2 - Jogar \n3 - Cr�ditos \n4 - Sair");
			opcoes = sc.nextInt();

			switch (opcoes) {

			case 1:
				System.out.println("A instru��es s�o simples, n�o morra!");
				break;
			case 2:
				System.out.println("Vamos come�ar essa batalha? ");
				break;
			case 3:
				System.out.println("Criado por Rafaela Teixeira");
				break;

			}

		} while (opcoes != 4);
        System.out.println("Saiu do jogo!");
	}

}
