package exerciciosS8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ticketSystem {

    Map<String, Double> MapaTicket = new HashMap<>();
    Scanner entrada = new Scanner (System.in);
    Double valor;
    String numero;

    //Atributo
    private String numTicket;
    private boolean pago;
    private double saldo;
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
        System.out.print("---------------PAGAMENTO---------------" +
                "\n - Para pagar, Informe o tempo que você ficou no estacionamento (em MINUTOS): ");
        String valorTempo = entrada.nextLine();
        Double tempo = Double.parseDouble(valorTempo);
        if (tempo >= 0 ){
            if (tempo >= 0 && tempo <= 10){
                this.preco = 0;
            }else if (tempo > 10 && tempo <= 30){
                this.preco = 12;
            }else if (tempo > 30 && tempo <= 60){
                this.preco = 15;
            }else if (tempo > 60){
                this.preco = 17;
            }
        }else {
            System.out.println("O tempo informado é inválido!");
        }
        System.out.println("O valor que você deve pagar é :" + preco);
    }

    public String getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(String numTicket) {
        for (Map.Entry<String, Double> tickets : MapaTicket.entrySet()){
            numero = "Ticket " + tickets.getKey() + 1;
            valor = preco;
        }
        this.numTicket = numTicket;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    //Métodos
    public void pagarTicket(){

    }

    //Construtor
    public ticketSystem() {
        this.setNumTicket(numero);
        this.setPago(false);
        this.setSaldo(valor);
        this.setTicketGerado(true);
    }
}
