package exerciciosS1.operadores_aritmeticos;

public class media {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30 };
        int m = (numeros[0] + numeros[1] + numeros[2]) / numeros.length;
        System.out.println("media aritmetica dos números: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + " " +  "é igual a: " + m);
    }
}
