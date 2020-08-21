package contacorrenteheranca;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente contaCorrente;
        ContaEspecial contaEspecial;

        String tipoConta[] = {"Conta Corrente", "Conta Especial"};

        String operacoes[] = {"Saldo", "Saque", "Depósito", "Sair"};

        String num = JOptionPane.showInputDialog(null, "Informe o nº da conta",
                "Banco de Todos S.A", 3);

        String nome = JOptionPane.showInputDialog(null,
                "Informe o nome do titular da conta nº " + num,
                "Banco de Todos S.A", 3);

        String sobrenome = JOptionPane.showInputDialog(null,
                "Informe o sobrenome do titular da conta nº " + num,
                "Banco de Todos S.A", 3);

        String cpf = JOptionPane.showInputDialog(null,
                "Informe o CPF do titular da conta nº " + num,
                "Banco de Todos S.A", 3);

        String tipo = (String) JOptionPane.showInputDialog(null, "Conta do tipo:",
                "Banco de Todos S.A", 3,
                null, tipoConta, tipoConta[0]);
      
        String opUsuario = "";

        Pessoa titular = new Pessoa(nome, sobrenome, cpf);

        if (tipo.equals(tipoConta[0])) { //ContaCorrente
            contaCorrente = new ContaCorrente(num, titular);
            while (!opUsuario.equals("Sair")) {

                opUsuario = (String) JOptionPane.showInputDialog(null, "Selecione a operação:",
                        "Banco de Todos S.A",
                        3, null, operacoes, operacoes[0]);

                switch (opUsuario) {
                    case "Saldo":
                        JOptionPane.showMessageDialog(null, contaCorrente,
                                "Banco de Todos S.A", 1);
                        break;
                    case "Saque":
                        float valorSaque = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Informe o valor do saque",
                                "Banco de Todos S.A", 3));

                        if (contaCorrente.saque(valorSaque)) {
                            JOptionPane.showMessageDialog(null,
                                    "Saque realizado com Sucesso!!!",
                                    "Banco de Todos S.A", 1);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Saque não realizado. Saldo INSUFICIENTE!!!",
                                    "Banco de Todos S.A", 0);
                        }
                        break;
                    case "Depósito":
                        float valorDep = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Informe o valor do depósito",
                                "Banco de Todos S.A", 3));
                        contaCorrente.deposito(valorDep);
                        JOptionPane.showMessageDialog(null,
                                "Depóstio realizado com Sucesso!!!",
                                "Banco de Todos S.A", 1);
                }//switch
            }//while

        } else {
            contaEspecial = new ContaEspecial(2000, num, titular);
             while (!opUsuario.equals("Sair")) {

                opUsuario = (String) JOptionPane.showInputDialog(null, "Selecione a operação:",
                        "Banco de Todos S.A",
                        3, null, operacoes, operacoes[0]);

                switch (opUsuario) {
                    case "Saldo":
                        JOptionPane.showMessageDialog(null, contaEspecial,
                                "Banco de Todos S.A", 1);
                        break;
                    case "Saque":
                        float valorSaque = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Informe o valor do saque",
                                "Banco de Todos S.A", 3));

                        if (contaEspecial.saque(valorSaque)) {
                            JOptionPane.showMessageDialog(null,
                                    "Saque realizado com Sucesso!!!",
                                    "Banco de Todos S.A", 1);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Saque não realizado. Saldo INSUFICIENTE!!!",
                                    "Banco de Todos S.A", 0);
                        }
                        break;
                    case "Depósito":
                        float valorDep = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Informe o valor do depósito",
                                "Banco de Todos S.A", 3));
                        contaEspecial.deposito(valorDep);
                        JOptionPane.showMessageDialog(null,
                                "Depóstio realizado com Sucesso!!!",
                                "Banco de Todos S.A", 1);
                }//switch
            }//while


        }

        System.exit(0);
    }
}
