package exerciciosS2.operadores.operadoresRelacionais;
import java.util.Scanner;

public class numComparacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite um segundo número para ser comparado com o primeiro:");
        double num2 = entrada.nextDouble();
        entrada.nextLine();

        if(num1 == num2){
            System.out.println("Os númeor são iguais");
        }else if (num1 > num2){
            System.out.printf("O número %d é maior que o número %d", num1, num2);
        }else{
            System.out.printf("O numero %d é maior que o número %d", num2, num1);
        }
    }
}
