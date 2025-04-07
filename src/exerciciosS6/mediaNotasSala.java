package exerciciosS6;

import javax.swing.*;
import java.text.DecimalFormat;

public class mediaNotasSala {
    public static void main(String[] args) {
        double total = 0;
        int contA = 0;
        DecimalFormat decimal = new DecimalFormat(".##");

        String StrNumA = JOptionPane.showInputDialog("Quantos alunos(as) tem na sala?");
        Integer numA = 0;
        if (StrNumA == null || StrNumA.trim().isEmpty() || StrNumA.isBlank()) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        } else {
            numA = Integer.parseInt(StrNumA);
            if (numA <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
        String StrNumP = JOptionPane.showInputDialog("Quantas provas cada aluno(a) tem?");
        Integer numP = 0;
        if (StrNumP == null || StrNumP.trim().isEmpty() || StrNumP.isBlank()) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        } else {
            numP = Integer.parseInt(StrNumP);
            if (numP <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }

        double[] notasAlunos = new double[numA];

        for (double notas : notasAlunos) {
            ++contA;
            for (int i = 1; i <= numP; i++) {
                String notaStr = JOptionPane.showInputDialog("Qual é a " + i + "° nota do aluno(a) " + contA +"?");
                if (notaStr == null || notaStr.trim().isEmpty() || notaStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Você não digitou a nota");
                    break;
                } else {
                    Double notaInt = Double.parseDouble(notaStr);
                    total += notaInt;
                }
            }
        }
        double media = total / (numA * numP);
        if (media > 0) {
            JOptionPane.showMessageDialog(null, "A média total da turma é " + decimal.format(media));
        }
    }
}
