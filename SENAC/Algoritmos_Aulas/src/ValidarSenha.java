import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int senha, senhaSistema;
		String login, loginSistema = null;

		
		System.out.println("Digite seu login: ");
		loginSistema = input.next();
		System.out.println("Defina sua senha: ");
		senhaSistema = input.nextInt();
		System.out.println("Login e senha definidos com sucesso!!!");
		
		System.out.println("\n");


			for (int i = 1; i <= 3; i++) {
				
				System.out.println("Login: ");
				login = input.next();
				System.out.println("Senha: ");
				senha = input.nextInt();
				if (login.equals(loginSistema) && senha == senhaSistema) {
					System.out.println("Senha váida!");
					System.out.println("Acesso permitido!");
					break;
				} else {
					System.out.println("Login ou Senha inválidos!");
					if (i == 3) {
						System.out.println("Login e senha bloqueados!");
					}
				}

			}
		}
	}
