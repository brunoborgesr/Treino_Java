package exerciciosS3.Switch_Break_Continue;
import java.util.Scanner;

public class numImparEPar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Selecione um número para os números ímpares até o valor informado serem apresentados: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        int contador = 1;

        for(int valores = 0; valores <= num; valores++){
            if(valores % 2 == 0) continue;

            System.out.printf("%d° número ímpar: %d\n", contador, valores);
            contador++;
        }

    }
}
