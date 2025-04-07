package exerciciosS5.Banco;

//As linhas de código que estão em comentário são os métodos que não estou utilizando no momento

import javax.swing.*;

public class contaBanco {

    boolean painelDeposito = true;
    boolean painelSaque = true;
    boolean painelNome = true;
    boolean contaAberta = true;
    boolean painelTipos = true;
    String[] tiposConta = {"Conta Corrente", "Conta Poupança"};
    String[] genrenciamentoConta = {"Depositar", "Sacar", "Fechar a conta"};

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta() {
        do {
            int escolhaTipos = JOptionPane.showInternalOptionDialog(
                    null,
                    "Escolha o seu tipo de conta",
                    "Tipo de conta",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tiposConta,
                    0
            );
            switch (escolhaTipos) {
                case 0:
                    tipo = "CC";
                    painelTipos = false;
                    break;
                case 1:
                    tipo = "CP";
                    painelTipos = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhum tipo de conta selecionado! Por favor, selecione o tipo da sua conta.");
            }
        } while (painelTipos);

        JOptionPane.showMessageDialog(null, "Número da sua conta: " + numConta);
        do {
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum nome selecionado! Por favor, digite o seu nome.");
            } else {
                dono = nome;
                painelNome = false;
            }
        } while (painelNome);

        status = true;

        if (tipo == "CC") {
            JOptionPane.showMessageDialog(null, "Conta corrente criada! Você ganhou R$50,00!");
            saldo += 50;
        } else if (tipo == "CP") {
            JOptionPane.showMessageDialog(null, "Conta poupança criada! Você ganhou R$150,00!");
            saldo += 150;
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            JOptionPane.showMessageDialog(null, "Você nâo pode fechar a conta, pois tem dinheiro nela!");
        } else {
            JOptionPane.showMessageDialog(null, "Conta fechada.");
            status = false;
        }
    }

    public void depositar() {
        do {
            String valorDepositar = JOptionPane.showInputDialog("Informe o valor que deseja depositar");
            if (valorDepositar == null || valorDepositar.trim().isEmpty()) {
                break;
            } else {
                if (valorDepositar.contains(".") || valorDepositar.contains(",")) {
                    JOptionPane.showMessageDialog(null, "Apenas números interos são aceitos, digite novamente");
                } else {
                    Integer adicaoDepositar = Integer.parseInt(valorDepositar);
                    saldo += adicaoDepositar;
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
                    painelDeposito = false;
                }
            }
        } while (painelDeposito);
        painelDeposito = true;
    }

    public void sacar() {
        do {
            String valorSacar = JOptionPane.showInputDialog("Informe o valor que deseja sacar");
            if (valorSacar == null || valorSacar.trim().isEmpty()) {
                break;
            } else {
                if (valorSacar.contains(".") || valorSacar.contains(",")) {
                    JOptionPane.showMessageDialog(null, "Apenas números interos são aceitos, digite novamente");
                } else {
                    Integer subtracaoSacar = Integer.parseInt(valorSacar);
                    if (subtracaoSacar <= saldo) {
                        saldo -= subtracaoSacar;
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Saldo atual: R$ " + saldo);
                        painelSaque = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível realizar o seu saque pois você tem menos dinheiro do que deseja sacar!");
                    }
                }
            }
        } while (painelSaque);
        painelSaque = true;
    }

    /*
    public void pagarMensal() {
        if (tipo == "CC") {
            saldo -= 12;
        } else if (tipo == "CP") {
            saldo -= 20;
        }
    }

    public int getNumConta() {
        return this.numConta;
    }
     */

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /*
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }
     */

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /*
    public boolean getStatus() {
        return this.status;
    }
     */

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void funcionamento() {
        abrirConta();
        do {
            int painelPrincipal = JOptionPane.showInternalOptionDialog(
                    null,
                    "Você deseja depositar ou sacar o seu dinheiro?",
                    "Bem vindo(a), " + dono + "!",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    genrenciamentoConta,
                    0
            );
            switch (painelPrincipal) {
                case 0:
                    depositar();
                    break;
                case 1:
                    sacar();
                    break;
                case 2:
                    fecharConta();
                    if (saldo == 0)
                        contaAberta = false;
                    break;
            }
        } while (contaAberta);
    }

    public contaBanco() {
        setStatus(false);
        setSaldo(0);
    }
}
