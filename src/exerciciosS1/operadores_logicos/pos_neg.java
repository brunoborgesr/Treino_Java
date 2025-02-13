package exerciciosS1.operadores_logicos;

public class pos_neg {
    public static void main(String[] args){
        int n = 0;
        boolean positivo = (n > 0);
        boolean negativo = (n < 0);
        boolean zero = (n == 0);
        if(positivo == true){
            System.out.println("O número é positivo");
        }else if (negativo == true){
            System.out.println("O número é negativo");
        }else if (zero == true){
            System.out.println("O número é zero");
        }
    }
}
