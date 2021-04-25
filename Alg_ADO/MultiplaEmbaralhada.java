import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultiplaEmbaralhada {

	public static void main(String[] args) {
		
		ArrayList<String> respostas = new ArrayList<>();
		
		String a = "a) Deve ser dividido e multiplicado pela potencia para chegar ao resultado";
		respostas.add(a);		
		String b = "b) A base deve ser multiplicada pela potencia correspondente e a soma deve ser feita com o resultado da multiplica��o";
		respostas.add(b);
		String c = "c) A base deve ser dividida pela potencia e o quivalente multiplicado para chegar ao resultado";
		respostas.add(c);
		String d = "d) A base deve ser multiplicada pela potencia correspondente, multiplicar o resultado das potencias e soma deve ser feita com o equivalente";
		respostas.add(d);
		String e = "e) Deve ser somado pela potencia e o resultado multiplicado";
		respostas.add(e);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("C.C - Referente a convers�o de bin�rio para decimal, assinale a alternativa correta:");
		
		System.out.println(
				"a) Deve ser dividido e multiplicado pela potencia para chegar ao resultado");	
		System.out.println(
				"b) A base deve ser multiplicada pela potencia correspondente e a soma deve ser feita com o resultado da multiplica��o");
		System.out.println(
				"c) A base deve ser dividida pela potencia e o quivalente multiplicado para chegar ao resultado");
		System.out.println(
				"d) A base deve ser multiplicada pela potencia correspondente, multiplicar o resultado das potencias e soma deve ser feita com o equivalente");
		System.out.println(
				"e) Deve ser somado pela potencia e o resultado multiplicado");

		char alternativa;


		do {
		
			alternativa = sc.next().charAt(0);

			switch (alternativa) {
			case 'b':
			case 'B':
				System.out.println("Resposta correta!");
				break;
			case 'a':
			case 'A':
			case 'c':
			case 'C':
			case 'd':
			case 'D':
			case 'e':
			case 'E':
				System.out.println("Resposta incorreta! Tente novamente:");
				//Collections.shuffle(respostas);
				
				
				for(String resposta : respostas) {
					System.out.println(resposta);
				}
				
				break;

			default:
				System.out.println("Escolha inv�lida!");
			}


		} while (alternativa != 'b');

	
	}

	}


