package treinoPOOGuanabara.tiposDeCanetas;

public class indexCaneta {
    public static void main(String[] args){
        Caneta c1 = new Caneta("BIC Cristal", 0.5f, "Azul");
        c1.status();

        Caneta c2 = new Caneta("Faber Castell", 0.7f, "Vermelha");
        c2.status();

        Caneta c3 = new Caneta("BIC", 1.0f, "Preta");
        c3.status();
    }
}
