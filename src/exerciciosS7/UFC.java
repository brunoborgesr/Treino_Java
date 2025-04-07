package exerciciosS7;

public class UFC {
    public static void main(String[] args){

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31,
                           1.75, 68.9, 11, 1, 2);
        l[1] = new Lutador("Putscript", "Brasil", 29,
                           1.68, 57.8 , 14, 1, 2);
        l[2] = new Lutador("Snaphadow", "EUA", 35,
                           1.65, 80.9, 12,1, 2);
        l[3] = new Lutador("Dead Code", "Austrália", 28,
                           1.93, 81.6, 13, 2, 0);
        l[4] = new Lutador("Ufocobol", "Brasil", 37,
                           1.70, 119.3, 5, 3, 4);
        l[5] = new Lutador("Nerdaard", "EUA", 30,
                           1.81, 105.7, 12, 4, 2);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0],l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();

        Luta UFC02 = new Luta();
        UFC02.marcarLuta(l[2], l[4]);
        UFC02.lutar();

    }
}
