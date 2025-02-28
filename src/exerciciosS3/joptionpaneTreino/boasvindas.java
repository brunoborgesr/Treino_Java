package exerciciosS3.joptionpaneTreino;

import javax.swing.JOptionPane;

public class boasvindas {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null,"Qual é o seu nome?", "Digite aqui...");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }
}
