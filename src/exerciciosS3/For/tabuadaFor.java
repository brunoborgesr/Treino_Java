package exerciciosS3.For;
import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        int tabuada = 1;
        int contador = 1;

        System.out.print("Digite um número para ser apresentada a sua tabuada de 1 a 10: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        for(; tabuada <= 10;){
            System.out.printf("%d° número da tabuada de %d: %d x %d = %d\n", contador, num, tabuada, num, tabuada * num);
            tabuada++;
            contador++;
        }

    }
}
