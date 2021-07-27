package ado03ap;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte dia;
        
        System.out.println("Escolha o dia da semana respectivo ao número: "
                + "\n1-Domingo"
                + "\n2-Segunda"
                + "\nseguindo assim até 7-Sábado");
        dia = entrada.nextByte();
        
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana!");
                break;
            default:
                System.out.println("Dia inválido!");
        }
    }
}
