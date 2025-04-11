package exerciciosS8;

import java.util.Scanner;

public class mainEstacionamento {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        boolean sistemaAberto =true;
        do{
            System.out.println("-----------------ESTACONAMENTO------------------" +
                    "\n[1]Gerar Ticket" +
                    "\n[4]Sair");
            System.out.println("- Selecione o número da opção desejada: ");
            int escolhaPainel1 = entrada.nextInt();
            entrada.nextLine();
            if(escolhaPainel1 == 1){
                ticketSystem Ticket1 = new ticketSystem();
                System.out.println("Ticket Criado!" +
                        "\nNúmero do seu Ticket: " + Ticket1.numero);
                System.out.println("-----------GERENCIAMENTO-------------" +
                        "\n[1]Pagar Ticket" +
                        "\n[2]Visualizar Saldo");
                System.out.println("Selecione o número da opção desejada: ");
                int escolhaPainel2 = entrada.nextInt();
                entrada.nextLine();

            }else if (escolhaPainel1 == 2){
                System.out.println("Sistema sendo finalizado!");
                sistemaAberto = false;
                break;
            }
        }while(sistemaAberto);
    }
}
