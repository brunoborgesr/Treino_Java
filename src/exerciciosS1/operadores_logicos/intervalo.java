package exerciciosS1.operadores_logicos;

public class intervalo {
    public static void main(String[] args){
        var n = 100;
        boolean dentroDoIntervalo = (n >= 10 && n <=50);

        if ( dentroDoIntervalo == true){
            System.out.println("O número está dentro do Intervalo");
        }
        else{
            System.out.println("O número não está dentro do Intervalo");
        }
    }
}
