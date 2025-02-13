package exerciciosS1.operadores_logicos;

public class notas {
    public static void main(String[] args){
        double n1 = 7.9;
        double n2 = 5.5;
        double notaMedia = (n1 + n2) / 2;
        boolean aprovado = (notaMedia >= 7);

        if (aprovado == true){
            System.out.println("O(A) aluno(a) está aprovado(a)");
        }
        else{
            System.out.println("O(A) aluno(a) está reprovado(a)");
        }
    }
}
