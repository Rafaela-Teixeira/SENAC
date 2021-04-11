package ado03ap;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;
       
        System.out.println("Digite o valor do saque: ");
        valor = entrada.nextInt();
        
        if (valor >= 100){
            n100 = valor/100;
            valor = valor - n100 * 100;
            
        }
        if (valor >= 50){
            n50 = valor/50;
            valor = valor - n50 * 50;
        }
        if (valor >= 10){
            n10 = valor/10;
            valor = valor - n10 * 10;
        }
        if (valor >= 5){
            n5 = valor/5;
            valor = valor - n5 * 5;
        }
        if (valor >= 1){
            n1 = valor/1;
            valor = valor - n1 * 1;
        }
        
        switch (valor){
            case 0:
                if (n100 != 0){
                    System.out.println(n100 + " nota(s) de R$100.");
                }
                if (n50 != 0){
                    System.out.println(n50 + " nota(s) de R$50.");
                }
                if (n10 != 0){
                    System.out.println(n10 + " nota(s) de R$10.");
                }
                if (n5 != 0){
                    System.out.println(n5 + " nota(s) de R$5.");
                }
                if (n1 != 0){
                    System.out.println(n1 + " nota(s) de R$1.");
                }
        }
    }
}
