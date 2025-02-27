package exerciciosS3.Switch_Break_Continue;
import java.util.Scanner;

public class corSemaforo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Selecione o sinal de um semáforo: \n[1]Vermelho\n[2]Amarelo\n[3]Verde\nFaça a sua escolha: ");
        int sinal = entrada.nextInt();
        entrada.nextLine();

        switch(sinal){
            case 1:
                System.out.print("Você escolheu o semáforo Vermelho!");
                break;
            case 2:
                System.out.print("Você escolheu o semáforo Amarelo!");
                break;
            case 3:
                System.out.print("Você escolheu o semáforo Verde!");
                break;
            default:
                System.out.print("Opção inválida");
        }

    }
}
