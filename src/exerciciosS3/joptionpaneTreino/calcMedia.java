package exerciciosS3.joptionpaneTreino;

import javax.swing.*;

public class calcMedia {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Informe 3 números para calcular a média deles");

        String valor1 = JOptionPane.showInputDialog("Número 1");
        Double num1 = Double.parseDouble(valor1);

        String valor2 = JOptionPane.showInputDialog("Número 2");
        Double num2 = Double.parseDouble(valor2);

        String valor3 = JOptionPane.showInputDialog("Número 3");
        Double num3 = Double.parseDouble(valor3);

        double media = (num1 + num2 + num3) / 3;

        JOptionPane.showMessageDialog(
                null,
                "A média entre " + num1 + ", " + num2 + " e " + num3 + " é " + media);
    }
}
