package exerciciosS3.For;
import java.util.Scanner;

public class ExibirNumPares {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.printf("Digite um número para ser apresentada a sequência de números pares até o número escrito: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        int contador = 1;

        for(int sequencia = 0;sequencia <= num; sequencia += 2){
            System.out.printf("%d° Número: %d\n", contador, sequencia);
            contador++;
        }

    }
}
