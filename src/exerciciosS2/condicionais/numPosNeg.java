package exerciciosS2.condicionais;
import java.util.Scanner;

public class numPosNeg {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();
        entrada.nextLine();
        if (num > 0 ){
            System.out.println("O número selecionado é positivo");
        }else if (num == 0){
            System.out.println("O número selecionado é zero");
        }else{
            System.out.println("O número selecionado é negativo");
        }
    }
}
