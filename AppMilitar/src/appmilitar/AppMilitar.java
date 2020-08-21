package appmilitar;

import javax.swing.JOptionPane;

public class AppMilitar {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Escreva seu nome", "AppMilitar", 3);
        String sexo = JOptionPane.showInputDialog(null, "Qual seu sexo?", "AppMilitar", 3);
        Byte idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Coloque a sua Idade", "AppMilitar", 3));

        //instanciação
        DadosPessoais objDados = new DadosPessoais();
        objDados.setNome(nome);
        objDados.setIdade(idade);
        objDados.setSexo(sexo.charAt(0));

        JOptionPane.showMessageDialog(null, objDados.getNome() + " " + objDados.estaApto(), "AppMilitar", 1);

    }

}
