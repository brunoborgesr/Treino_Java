package exerciciosS2.condicionais;
import java.util.Scanner;

public class descontoEstudante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Você tem 18 anos ou mais? Sim ou Não ");
        String idade = entrada.nextLine();

        System.out.println("Você é estudante? Sim ou Não");
        String estudante = entrada.nextLine();

        if(idade.equalsIgnoreCase("Sim") && estudante.equalsIgnoreCase("Sim")){
            System.out.println("Parabéns, você tem direito a desconto!");
        }else{
            System.out.println("Você não tem direito a desconto.");
        }
    }
}
