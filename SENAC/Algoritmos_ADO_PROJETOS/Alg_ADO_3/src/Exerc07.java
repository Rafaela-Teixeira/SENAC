package ado03ap;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte idade;
        
        System.out.println("Digite a idade do conveniado: ");
        idade = entrada.nextByte();
        
        if (idade < 10) {
            System.out.println("Você irá pagar R$180,00.");
        }else if (idade >= 10 && idade <= 30){
            System.out.println("Você irá pagar R$150,00.");
        }else if (idade > 30 && idade < 60){
            System.out.println("Você irá pagar R$195,00.");
        }else if (idade >= 60){
            System.out.println("Você irá pagar R$230,00.");
        }
        
    }
}
