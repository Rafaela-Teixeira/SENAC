package ados.ado3;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String operacao;
        double a, b;
        char oper;
        
        System.out.println("..::Calculadora::..");
        System.out.println("\n<A>dição");
        System.out.println("<S>ubtração");
        System.out.println("<M>ultiplicação");
        System.out.println("<D>ivisão");
        System.out.println("\nEscolha a operação desejada: ");
        
        operacao = entrada.next();
        oper = operacao.charAt(0);
        
        System.out.println("Primeiro operando: ");
        a = entrada.nextDouble();
        System.out.println("Segundo operando: ");
        b = entrada.nextDouble();
        
        switch (oper){
            case 'a':
            case 'A':
                System.out.println("Soma: " + (a + b));
                break;
            case 's':
            case 'S':
                System.out.println("Diferença: " + (a - b));
                break;
            case 'm':
            case 'M':
                System.out.println("Produto: " + (a * b));
                break;
            case 'd':
            case 'D':
                System.out.println("Quociente: " + (a / b));
                break;
                default: 
                System.out.println("A operação " + oper + " não é válida!");
        }
    }
}
