import java.util.Scanner;

public class DiasMeses {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		byte mes;
		//String nomeMes;
		
	
		System.out.println("*--* Meses do ano *--*");
		System.out.println("Mês: 2-Janeiro, 2-Fev...");
		mes = sc.nextByte();
		//nomeMes = sc.nextString();
		
		switch(mes) {
		case 1:
			System.out.println("Janeiro - 31 dias");
			break;
		case 2:
			System.out.println("Fevereiro - 28 dias");
			break;
		case 3:
			System.out.println("Março - 31 dias");
			break;
		case 4:
			System.out.println("Abril - 28 dias");
			break;
			
			default:
				System.out.println("Mês invalidado!");
		}
	}

}
