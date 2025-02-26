package exerciciosS3.For;
import java.sql.SQLOutput;
import java.util.Scanner;

public class somaNum {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Informe um valor para a soma de todos os números inteiros até o valor informado: ");

        int num = entrada.nextInt();
        entrada.nextLine();

        int soma = 0;

        for(int contador = 1; contador <= num; contador++){
            soma+=num;
            System.out.printf("%d° soma = %d\n", contador, soma);
        }
    }
}
