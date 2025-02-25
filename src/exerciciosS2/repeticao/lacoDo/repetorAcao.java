package exerciciosS2.repeticao.lacoDo;
import java.util.Scanner;

public class repetorAcao {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int resposta = 0;

        do{
            System.out.print("Quantas vezes você deseja repetir a ação?  resposta:");
            resposta = entrada.nextInt();
            entrada.nextLine();
        }while(resposta <= 0);

    }
}
