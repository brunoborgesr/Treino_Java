package exerciciosS1.operadores_aritmeticos;

public class expressao {
    public static void main(String[] args){
        int n = 5; //recebe um número aleatório, nesse caso, o 5
        var r = (n % 2 == 0) && true;
        /*
        Esse cálculo divide o número fornceido por 2, e calcula o seu módulo (resto da divisão).
        Caso o resto da divisão seja 0, o programa retorna "true" afirmando que o número que foi fornecido é par,
        e caso o resto da divisão seja 1, o programa retorna "falso" afirmando que o número não é  par, ou seja, ímpar.
         */
        if (r == true){
            System.out.println("O número " + n + " é par");
        }
        else{
            System.out.println("O número " + n + " é ímpar");
        }
    }
}
