package exerciciosS2.operadores.operadoresDeAtribuicao;

public class multiplicacao {
    public static void main(String[] args){
        double preco = 150.0;
        preco *= 0.9;
        System.out.printf("O preço do produto originalmente é: R$150.0 e agora com 10 porcento de desconto, fica: R$%.2f", preco);
    }
}
