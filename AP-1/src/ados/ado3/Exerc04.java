package ados.ado3;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte mes;
        
        System.out.println("Escolha o mês desejado, sabendo que: "
                + "\n1-Janeiro"
                + "\n2-Fevereiro"
                + "\nassim por diante até 12-Dezembro. ");
        mes = entrada.nextByte();
        
        switch (mes) {
            case 1: 
                System.out.println("Janeiro de 2021 possui 31 dias.");
                break;
            case 2:
                System.out.println("Fevereiro de 2021 possui 28 dias.");
                break;
            case 3:
                System.out.println("Março de 2021 possui 31 dias.");
                break;
            case 4: 
                System.out.println("Abril de 2021 possui 30 dias.");
                break;
            case 5:
                System.out.println("Maio de 2021 possui 31 dias.");
                break;
            case 6:
                System.out.println("Junho de 2021 possui 30 dias.");
                break;
            case 7:
                System.out.println("Julho de 2021 possui 31 dias.");
                break;
            case 8:
                System.out.println("Agosto de 2021 possui 31 dias.");
                break;
            case 9:
                System.out.println("Setembro de 2021 possui 30 dias.");
                break;
            case 10:
                System.out.println("Outubro de 2021 possui 31 dias.");
                break;
            case 11:
                System.out.println("Novembro de 2021 possui 30 dias.");
                break;
            case 12:
                System.out.println("Dezembro de 2021 possui 31 dias.");
                break;
            default:
                System.out.println("Mês inválido!");
                
        }
        
    }
}
