import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite a opção entre A, B, C, D, E");

		char grade = sc.next(".").charAt(0);

		grade = Character.toUpperCase(grade);
		

		switch (grade) {

		case 'A':
			System.out.println("Excelente!");
			break;
                                                                                                                                                                                                                                                            
		case 'B', 'C':
			System.out.println("Bem feito!");
			break;
		case 'D':
			System.out.println("Você passou!");
			break;
		case 'E':
			System.out.println("Melhor tentar novamente!");
			break;
		default:
			System.out.println("Conceito inválido");

		}
	}

}