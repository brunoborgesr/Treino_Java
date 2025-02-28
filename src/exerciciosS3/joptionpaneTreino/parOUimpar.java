package exerciciosS3.joptionpaneTreino;

import javax.swing.*;

public class parOUimpar {
    public static void main(String[] args){
        String valor = JOptionPane.showInputDialog("Digite um número para saber se ele é impar ou par:");
        Integer num = Integer.parseInt(valor);

        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é par");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar");
        }
    }
}
