package exerciciosS1.conversao_tipos;

public class Exemplo_parseInt {
    public static void main(String[]args){
        String s = "1500";
        Integer i = Integer.parseInt(s);
        System.out.println("Conversão de tipos String (1500) em int e utilizando soma no número após a alteração para Int: 1500 + 500 = " + (i + 500 ));
    }
}
