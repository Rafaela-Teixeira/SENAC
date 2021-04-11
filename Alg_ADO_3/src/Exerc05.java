package ado03ap;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mes;
        
        System.out.println("Digite um mês do ano: ");
        mes = entrada.next();
        mes = mes.toUpperCase();
        
        switch (mes){
            case "JANEIRO":
            case "DEZEMBRO":
            case "FEVEREIRO":
            case "JUNHO":
            case "JULHO":
                System.out.println("Mês de alta temporada!");
                break;
            case "MARÇO":
            case "ABRIL":
            case "MAIO":
            case "AGOSTO":
            case "SETEMBRO":
            case "OUTUBRO":
            case "NOVEMBRO":
                System.out.println("Mês de baixa temporada!");
                break;
            default:
                System.out.println("Mês inválido!");
                       
        }
    }
}
