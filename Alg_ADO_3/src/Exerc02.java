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
			System.out.println("O dia " + dia + " da semana � �til ");
			break;
			
		case 1:
		case 7:
			System.out.println("O dia " + dia + " N�O � dia �til, � final de semana");
			break;
			
			default:
				System.out.println("Esse n�mero n�o corresponde ao dia da semana");
		}

	}

}
