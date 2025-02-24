package exerciciosS2.operadores.operadoresUnarios;

public class incremento {
    public static void main(String[] args){
        int x = 10;
        System.out.printf("incremento pos: %d %n", x++); // incremento com pos, a incrementação será feita após o print, a saída será 10.
        System.out.printf("decremento pos: %d %n", x--); // decremento com pos, o decremento será feito após o print, a saída será 11.
        System.out.printf("incremento pre: %d %n",++x); // incremento  com pre, a incrementação será feita antes do print, a saída será 11.
        System.out.printf("decremento pre: %d %n", --x); // decremento com pre, o deremento será feiro antes do print, a saída será 10.

    }
}
