import java.util.Scanner;

public class ComparaNome {
	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome = entrada.next();
		
		if(nome.equals("John")) {
			System.out.println("Seu nome � John");
		} else {
			System.out.println("Seu nome � "+nome+", n�o John");
		}
		
	 }

}
