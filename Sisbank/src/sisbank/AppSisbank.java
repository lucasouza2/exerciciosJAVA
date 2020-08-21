package sisbank;

import javax.swing.JOptionPane;

public class AppSisbank {

    public static void main(String[] args) {
        ContaCorrente minhaConta;

        String nome = JOptionPane.showInputDialog(null, "Nome do Titular", "AppSisbank", 3);
        String sobrenome = JOptionPane.showInputDialog(null, "Sobrenome do Titular", "AppSisbank", 3);
        String numeroDaConta = JOptionPane.showInputDialog(null, "Numero da Conta", "AppSisbank", 3);
        Pessoa titular = new Pessoa(nome, sobrenome);
        minhaConta = new ContaCorrente(numeroDaConta, titular);

        String operaçoes[] = {"Saldo", "Saque", "Deposito", "Sair"};
        String opUsr = "";

        while (!opUsr.equalsIgnoreCase("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "AppSisbank", 3, null, operaçoes, operaçoes[0]);

            if (opUsr.equals(operaçoes[0])) {
                JOptionPane.showMessageDialog(null, "conta n° " + minhaConta.getNumeroDaConta() 
                        + "\n Titular: " + minhaConta.getTitular().nomeCompleto() 
                        + "\n Saldo: " + minhaConta.getSaldo(), "AppSisbank", 1);
            }else if(opUsr.equals("Deposito")){
                float valorDep=Float.parseFloat(JOptionPane.showInputDialog(null,"Valor a ser depositado","AppSisbank",3));
                minhaConta.deposito(valorDep);
                JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso!!","AppSisbank",1 );
                
            }else if(opUsr.equals(operaçoes[1])){
            float valor=Float.parseFloat(JOptionPane.showInputDialog(null,"Valor a ser sacado","AppSisbank",3));
            if(minhaConta.saque(valor)){
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!!","AppSisbank",1 );
            }else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!!","AppSisbank",1 );}
            }

        }

    }

}
