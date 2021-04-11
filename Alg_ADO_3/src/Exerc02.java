import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia = sc.nextInt();
		
		switch (dia) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("O dia " + dia + " da semana é útil ");
			break;
			
		case 1:
		case 7:
			System.out.println("O dia " + dia + " NÃO é dia útil, é final de semana");
			break;
			
			default:
				System.out.println("Esse número não corresponde ao dia da semana");
		}

	}

}
