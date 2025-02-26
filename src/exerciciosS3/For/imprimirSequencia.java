package exerciciosS3.For;
import java.sql.SQLOutput;
import java.util.Scanner;

public class imprimirSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite um número para ser apresentada a sequência de números ímpares até o número escrito: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        int contador = 1;

        for (int sequencia = 1; sequencia <= num; sequencia+=2) {
            System.out.printf("%d° Número: %d\n", contador, sequencia);
            contador++;
        }
    }
}