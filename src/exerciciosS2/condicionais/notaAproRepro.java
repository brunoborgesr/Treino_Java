package exerciciosS2.condicionais;
import java.util.Scanner;

public class notaAproRepro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo, estudante. \nDigite sua primeira nota:");
        double nota1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Muito bem, agora digite sua segunda nota:");
        double nota2 = entrada.nextDouble();
        entrada.nextLine();

        double media = (nota1 + nota2) /2;

        if(media >= 7){
            System.out.println("Parabéns, você está aprovado!");
        }else if( 5 <= media ){
            System.out.println("Você está de recuperação.");
        }else{
            System.out.println("Você está reprovado.");
        }
    }
}
