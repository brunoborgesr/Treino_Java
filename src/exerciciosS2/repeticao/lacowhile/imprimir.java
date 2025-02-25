package exerciciosS2.repeticao.lacowhile;
import java.util.Scanner;

public class imprimir {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite um número para ser impresso no terminal: ");
        int num = entrada.nextInt();
        System.out.print("\n");
        entrada.nextLine();

        int numImpresso = 1;

        while(numImpresso <= num){
            System.out.println(numImpresso);
            numImpresso++;


        }
    }
}
