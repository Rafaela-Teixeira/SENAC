package ados.ado1;

import java.util.Scanner;

public class Ex12_Comissao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int codigoProduto, quantidadeProduto;
		double precoUnidade;

		System.out.println("Digite seu nome: ");
		nome = sc.next();

		System.out.println("Digite o c�digo do produto: ");
		codigoProduto = sc.nextInt();

		System.out.println("Digite a quantidade do produto: ");
		quantidadeProduto = sc.nextInt();

		System.out.println("Digite o pre�o da unidade: ");
		precoUnidade = sc.nextDouble();

		double Total = quantidadeProduto * precoUnidade;
		System.out.println("O total de vendas do produdo "+ codigoProduto + "�: " + Total);

		System.out.println("O valor da comiss�o do "+ nome +"�: " + Total * 0.05);

		sc.close();
	}

}
