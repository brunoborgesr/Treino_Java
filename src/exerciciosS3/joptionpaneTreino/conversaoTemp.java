package exerciciosS3.joptionpaneTreino;

import javax.swing.*;

public class conversaoTemp {
    public static void main(String[] args) {
        String valorC = JOptionPane.showInputDialog("Me informe um número referente a uma temperatura em \nCelcius para ser transformada para Fahrenheit");
        Integer c = Integer.parseInt(valorC);

        double f = (c * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, "O valor de " + c +"°C para Fahrenheit é: " + f + "°F");

    }
}