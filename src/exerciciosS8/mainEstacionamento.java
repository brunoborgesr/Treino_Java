package exerciciosS8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mainEstacionamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistemaAberto = true;
        boolean sistemaPainelGerenciamento;
        double saldo = 0;
        int numTicket = 0;
        Map<String, Double> MapaTicket = new TreeMap<>();

        do {
            System.out.println("-----------------ESTACONAMENTO------------------" +
                    "\n[1]Gerar Ticket" +
                    "\n[2]Sair");
            System.out.print("- Selecione o número da opção desejada: ");
            String escolhaPainel1 = entrada.nextLine();
            if (escolhaPainel1.matches("^\\d+$")) {
                Integer Painel1 = Integer.parseInt(escolhaPainel1);
                if (Painel1 == 1) {
                    ticketSystem Ticket = new ticketSystem();
                    ++numTicket;
                    System.out.println("-----------------TICKET CRIADO!------------------" +
                            "\nNúmero do seu Ticket: " + numTicket);
                    Ticket.definirTempo();
                    sistemaPainelGerenciamento = true;
                    do {
                        System.out.println("-----------------GERENCIAMENTO------------------" +
                                "\n[1]Pagar Ticket" +
                                "\n[2]Visualizar Saldo" +
                                "\n[3]Voltar");
                        System.out.print("Selecione o número da opção desejada: ");
                        String escolhaPainel2 = entrada.nextLine();
                        if (escolhaPainel2.matches("^\\d+$")) {
                            Integer Painel2 = Integer.parseInt(escolhaPainel2);
                            if (Painel2 == 1) {
                                if (!Ticket.isPago()) {
                                    Ticket.pagarTicket();
                                    saldo += Ticket.valor;
                                } else {
                                    System.out.println("Você ja pagou o seu ticket!");
                                }
                                MapaTicket.put("Ticket " + numTicket, Ticket.valor);
                            } else if (Painel2 == 2) {
                                System.out.println("-----------------SALDO------------------");
                                for (String i : MapaTicket.keySet()) {
                                    System.out.println("Número Ticket: " + i + " Valor Pago: " + MapaTicket.get(i));
                                }
                                System.out.println("- Saldo atual: " + saldo);
                            } else if (Painel2 == 3) {
                                if (Ticket.isPago()) {
                                    sistemaPainelGerenciamento = false;
                                } else {
                                    System.out.println("Você precisa pagar o seu ticket antes de voltar!");
                                }
                            } else {
                                System.out.println("Valor inválido, digite novamente...\n");
                            }
                        } else {
                            System.out.println("Valor inválido, digite novamente...\n");
                        }
                    } while (sistemaPainelGerenciamento);
                } else if (Painel1 == 2) {
                    System.out.println("Sistema sendo finalizado!");
                    sistemaAberto = false;
                } else {
                    System.out.println("Valor inválido, digite novamente...\n");
                }
            } else {
                System.out.println("Valor inválido, digite novamente...\n");
            }
        } while (sistemaAberto);
        entrada.close();
    }
}
