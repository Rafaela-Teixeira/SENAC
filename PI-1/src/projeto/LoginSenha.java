package projeto;

import java.util.Scanner;

public class LoginSenha {

	public static void main(String[] args) {
		String user = "John";
		String password = "123456";
		String login, senha;
		Scanner entrada = new Scanner(System.in);
		
		boolean tacerto = false;
		
		do {
			System.out.print("Digite o login: ");
			login = entrada.next();
			System.out.println("Digite a senha: ");   //laço
			senha = entrada.next();
			
			if (login.equalsIgnoreCase(user) && senha.equals(password))
				tacerto = true;
			//(!(negação
			
		} while (!tacerto);
		
		System.out.println("Login e senha corretos!");
		
		
				

	}

}
