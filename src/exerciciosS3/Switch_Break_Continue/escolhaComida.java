package exerciciosS3.Switch_Break_Continue;
import java.util.Scanner;

public class escolhaComida {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        boolean programaAberto = true;

        do{
            System.out.print("-Menu de Opções de comida:\n[1]Pizza\n[2]Hamburguer\n[3]Sushi\nFaça a sua Escolha: ");
            int num = entrada.nextInt();
            entrada.nextLine();

            switch(num){
                case 1:
                    System.out.println("Você selecionou a Pizza!");
                    System.out.print("Pedido feito! Finalizando sistema...");
                    programaAberto = false;
                    break;
                case 2:
                    System.out.println("Você selecionou o Hamburguer!");
                    System.out.print("Pedido feito! Finalizando sistema...");
                    programaAberto = false;
                    break;
                case 3:
                    System.out.println("Você selecionou o Sushi!");
                    System.out.print("Pedido feito! Finalizando sistema...");
                    programaAberto = false;
                    break;
                default:
                    System.out.println("ERRO 404: Opção Inválida, valor não identificado!");
                    break;
            }
        }while (programaAberto == true);

    }
}
