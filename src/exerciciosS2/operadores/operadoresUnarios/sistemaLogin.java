package exerciciosS2.operadores.operadoresUnarios;
import java.util.Scanner;

public class sistemaLogin {
    public static void main(String[] args){

        int tentativasLogin = 5;

        Scanner entrada = new Scanner(System.in);

        while( tentativasLogin > 0){

            System.out.println("Digite o nome de usuário:");
            String usuario = entrada.nextLine();

            System.out.printf("Digite a senha do usuário %s: ", usuario);
            Double senha = entrada.nextDouble();
            entrada.nextLine();

            boolean login = (usuario.equals("admin") && senha.equals(1234.0));

            if(login == true){
                System.out.println("Parabéns, você teve acesso à conta");
                break;
            }else{
                --tentativasLogin;
                System.out.printf("Usuário ou senha Incorretos, flatam %d tentativas. \n", tentativasLogin);
            }
            System.out.println("você alcançou o limite de tentativas, a conta foi temporariamente bloqueada");
            break;
        }
    }
}
