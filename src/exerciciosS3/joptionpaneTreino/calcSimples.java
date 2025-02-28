package exerciciosS3.joptionpaneTreino;

import javax.swing.JOptionPane;

public class calcSimples {
    public static void main(String[] args){

        boolean programaAberto = true;

        do{
            String input1 = JOptionPane.showInputDialog(null, "Digite um número:");
            Double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog(null, "Digite um segundo número:");
            Double num2 = Double.parseDouble(input2);

            String input3 = JOptionPane.showInputDialog(null, "Digite uma operação (soma, subtracao, multiplicacao ou divisao) \npara calcular os números informados:");

            switch(input3.toLowerCase()) {
                case "soma":
                    double soma = num1 + num2;
                    JOptionPane.showMessageDialog(null, "A soma dos números " + num1 + " e " + num2 + " é " + soma);
                    programaAberto = false;
                    break;
                case "subtracao":
                    double subtracao = num1 - num2;
                    JOptionPane.showMessageDialog(null, "A subtração dos números " + num1 + " e " + num2 + " é " + subtracao);
                    programaAberto = false;
                    break;
                case "multiplicacao":
                    double mutiplicacao = num1 * num2;
                    JOptionPane.showMessageDialog(null, "A multiplicação dos números " + num1 + " e " + num2 + " é " + mutiplicacao);
                    programaAberto = false;
                    break;
                case "divisao":
                    double divisao = num1 / num2;
                    JOptionPane.showMessageDialog(null, "A divisão dos números " + num1 + " e " + num2 + " é " + divisao);
                    programaAberto = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação nao identificada, digite novamente");
            }
        }while(programaAberto == true);
    }
}
