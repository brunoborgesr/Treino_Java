package exerciciosS1.operadores_logicos;

public class idade {
    public static void main(String[] args) {
        int i = 20;
        boolean maiorDeIdade = (i >= 18);

        if ( maiorDeIdade == true){
            System.out.println("A pessoa é maior de idade");
        }
        else{
            System.out.println("A pessoa não é maior de idade");
        }
    }
}
