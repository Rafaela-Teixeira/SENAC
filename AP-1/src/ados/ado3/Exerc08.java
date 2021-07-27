package ados.ado3;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double i = 100;
        double juros = 0.05;
        int mes;
        String descriMes;
        
        System.out.println("Digite o valor da sua associação: ");
        valor = entrada.nextInt();
        System.out.println("Digite o número do mês de pagamento da sua associação: "
                + "\n0-Janeiro"
                + "\n1-Fevereiro"
                + "\n2-Março"
                + "\n...assim sucessivamente até 11-Dezembro");
       mes = entrada.nextInt();
      
       switch (mes){ 
           case 0:
               descriMes = "Janeiro";
               break;
           case 1:
               descriMes = "Fevereiro";
               break;
           case 2:
               descriMes = "Março";
               break;
           case 3:
               descriMes = "Abril";
               break;
           case 4:
               descriMes = "Maio";
               break;
           case 5:
               descriMes = "Junho";
               break;
           case 6:
               descriMes = "Julho";
               break;
           case 7:
               descriMes = "Agosto";
               break;
           case 8:
               descriMes = "Setembro";
               break;
           case 9:
               descriMes = "Outubro";
               break;
           case 10:
               descriMes = "Novembro";
               break;
           case 11:
               descriMes = "Dezembro";
               break;
           default:
               System.out.println("Mês inválido!");
               break;
               
       }
        System.out.println("Mês selecionado: " + mes);
        
        valor = i * Math.pow((1+juros), mes);
        
        System.out.printf("Valor a ser pago: R$%.2f", valor);
    }
}
