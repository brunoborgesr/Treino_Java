package exerciciosS2.operadores.operadorTernario;
import java.sql.SQLOutput;
import java.util.Scanner;

public class verificacaoIdade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        String verificacao = (idade >= 18)? "maior de idade" : "menor de idade";
        System.out.printf("Você é %s", verificacao);
    }
}
