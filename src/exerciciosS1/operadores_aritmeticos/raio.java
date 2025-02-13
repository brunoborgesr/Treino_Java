package exerciciosS1.operadores_aritmeticos;

public class raio {
    public static void main(String[] args){
        int r = 7;
        var a = Math.PI * (r * r);

        System.out.println(" A área do circulo com raio " + r + " é: " + String.format("%.2f", a));
    }
}
