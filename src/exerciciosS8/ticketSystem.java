package exerciciosS8;

import java.util.Scanner;

public class ticketSystem {

    Scanner entrada = new Scanner(System.in);
    double valor = 0;
    boolean painelTempo;

    //Atributo
    private boolean pago;
    private double preco;
    private boolean ticketGerado;

    //Métodos especiais

    public boolean isTicketGerado() {
        return ticketGerado;
    }

    public void setTicketGerado(boolean ticketGerado) {
        this.ticketGerado = ticketGerado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    //Métodos
    public void definirTempo() {
        painelTempo = true;
        do{
            System.out.print("- Informe o tempo que você ficou no estacionamento (em MINUTOS): ");
            String valorTempo = entrada.nextLine();
            if (valorTempo.matches("^\\d+$")){
                Double tempo = Double.parseDouble(valorTempo);
                if (tempo >= 0) {
                    if (tempo >= 0 && tempo <= 10) {
                        this.preco = 0;
                    } else if (tempo > 10 && tempo <= 30) {
                        this.preco = 12;
                    } else if (tempo > 30 && tempo <= 60) {
                        this.preco = 15;
                    } else if (tempo > 60) {
                        this.preco = 17;
                    }
                    this.valor = preco;
                    System.out.println("- O valor que você deve pagar é: " + preco);
                    painelTempo = false;
                } else {
                    System.out.println("O tempo informado é inválido! Digite novamente...\\n\"");
                }
            }else{
                System.out.println("O tempo informado é inválido! Digite novamente...\n");
            }
        }while(painelTempo);
    }

    public void pagarTicket() {
        if (isPago() == false) {
            this.setPago(true);
            System.out.println("- O seu ticket foi pago com sucesso!" +
                    "\n- Valor de pagamento adicionado ao saldo das operações");
        } else {
            System.out.println("Você já pagou o seu ticket!");
        }
    }

    //Construtor
    public ticketSystem() {
        this.setPago(false);
        this.setTicketGerado(true);
    }
}
