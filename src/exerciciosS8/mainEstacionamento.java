package exerciciosS8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainEstacionamento {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        boolean sistemaAberto = true;
        boolean sistemaPainelGerenciamento;
        double saldo = 0;
        int numTicket = 0;
        Map<String, Double> MapaTicket = new HashMap<>();

        do{
            System.out.println("-----------------ESTACONAMENTO------------------" +
                    "\n[1]Gerar Ticket" +
                    "\n[2]Sair");
            System.out.print("- Selecione o número da opção desejada: ");
            int escolhaPainel1 = entrada.nextInt();
            entrada.nextLine();
            if(escolhaPainel1 == 1){
                ticketSystem Ticket = new ticketSystem();
                ++numTicket;
                System.out.println("-----------------TICKET CRIADO!------------------" +
                        "\nNúmero do seu Ticket: " + numTicket );
                Ticket.definirTempo();
                sistemaPainelGerenciamento = true;
                do{
                    System.out.println("-----------------GERENCIAMENTO------------------" +
                            "\n[1]Pagar Ticket" +
                            "\n[2]Visualizar Saldo" +
                            "\n[3]Voltar");
                    System.out.print("Selecione o número da opção desejada: ");
                    int escolhaPainel2 = entrada.nextInt();
                    entrada.nextLine();
                    if (escolhaPainel2 == 1){
                        Ticket.pagarTicket();
                        saldo += Ticket.valor;
                        MapaTicket.put("Ticket " + numTicket, Ticket.valor);
                    }else if (escolhaPainel2 == 2){
                        System.out.println("-----------------SALDO------------------");
                        for(String i : MapaTicket.keySet()){
                            System.out.println("Número Ticket: " + i + " Valor Pago: " + MapaTicket.get(i));
                        }
                        System.out.println("- Saldo atual: " + saldo);
                    }else if (escolhaPainel2 == 3){
                        if(Ticket.isPago()){
                            sistemaPainelGerenciamento = false;
                            break;
                        }else{
                            System.out.println("Você precisa pagar o seu ticket antes de voltar!");
                        }
                    }else{
                        System.out.println("Valor inválido, digite novamente...\n");
                    }
                }while (sistemaPainelGerenciamento);
            }else if (escolhaPainel1 == 2){
                System.out.println("Sistema sendo finalizado!");
                sistemaAberto = false;
                break;
            }else{
                System.out.println("Valor inválido, digite novamente...\n");
            }
        }while(sistemaAberto);
    }
}
