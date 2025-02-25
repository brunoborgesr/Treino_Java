package exerciciosS2.repeticao.lacoDo;
import java.util.Scanner;

public class verificacaoSenha {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a sua senha: ");

        String senha = "";
        int tentativa = 1;

        do{
            System.out.printf("tentiva %d: ", tentativa);
            tentativa++;
            senha = entrada.nextLine();
        }while (!senha.equalsIgnoreCase("1234"));
        System.out.println("Parabéns! você acessou a conta!");


        entrada.close();
    }
}
