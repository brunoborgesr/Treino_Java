package exerciciosS2.repeticao.lacowhile;
import java.util.Scanner;

public class imprimirSoma {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um número para receber a soma de todos os números inteiros até o valor informado: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        int numImprimir = 0;
        int soma = 0;

        System.out.println("A soma dos números: \n");

        while (numImprimir<=num){

            System.out.println(numImprimir);
            soma += numImprimir;
            numImprimir++;

        }
        System.out.println("\nÉ igual a: " + soma);
    }
}
