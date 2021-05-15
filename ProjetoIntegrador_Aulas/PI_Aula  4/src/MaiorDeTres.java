import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = entrada.nextInt();
	
		if ((a > b) && (a > c)) 
			System.out.println("O maior dos três é A = " + a);
		 else if ((b > a) && (b > c)) 
			System.out.println("O maior dos três é B = " + b);
		else
			System.out.println("O maior dos três é C = " + c);
	}

}
