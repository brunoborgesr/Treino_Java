package exerciciosS3.For;
import java.util.Scanner;

public class contagemProgressiva {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite um número e todos os números de 1 até o número informado vão ser apresentados: ");

        int num = entrada.nextInt();
        entrada.nextLine();

        for(int i = 1; i<=num; i++ ){
            System.out.println("Contagem progressiva: " + i);
        }

    }
}
