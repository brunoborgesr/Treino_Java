package exerciciosS3.Switch_Break_Continue;
import java.util.Scanner;

public class menuOpcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean programaRodando = true;

        do{
            System.out.print("Menu:\n[1]Opção 1\n[2]Opção 2\n[3]Opção 3\n[4]Sair\nFaça a sua escolha: ");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch(escolha){
                case 1: case 2: case 3:
                    System.out.println("Parabéns pela escolha!\nReiniciando o programa...");
                    break;
                case 4:
                    programaRodando = false;
                    System.out.println("Fechando o Programa");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    System.out.println("FECHANDO PROGRAMA");
                    programaRodando = false;
            }
        }while (programaRodando == true);
    }
}
