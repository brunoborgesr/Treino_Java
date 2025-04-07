package exerciciosS6;

import javax.swing.*;

public class mediaNotasAlunos {
    public static void main(String[] args){
        double[] notas = new double[4];
        int t = 0;
        int i = 0;

        for(double nota: notas) {
            ++t;
            String s = JOptionPane.showInputDialog("informe o valor da " + t + "° nota");
            if(s == null || s.trim().isEmpty() || s.isBlank()){
                JOptionPane.showMessageDialog(null, "Você não digitou a sua nota");
                break;
            }
            else{
                Double n = Double.parseDouble(s);
                notas[i] += n;
                ++i;
            }
        }
        if(t == notas.length){
            double total = 0;
            for( int c = 0; c < notas.length; c++ ){
                total += notas[c];
            }

            total = total/notas.length;

            if(total >= 7){
                JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado! O valor da sua media escolar é: " + total);
            }else if (total <7 && total >5){
                JOptionPane.showMessageDialog(null, "Você está de recuperação, o valor da sua media escolar é: " + total);
            }else{
                JOptionPane.showMessageDialog(null, "Você foi reprovado o valor da sua media escolar é: " + total);
            }
        }
    }
}
