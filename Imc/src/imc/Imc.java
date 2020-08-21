package imc;

import javax.swing.JOptionPane;

public class Imc {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno", "Academia", 3);
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o peso de " + nome, "Imc", 3));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o altura de " + nome, "Imc", 3));

        //instanciação
        Calcimc objCalc = new Calcimc();
        objCalc.setNome(nome);
        objCalc.setPeso(peso);
        objCalc.setAltura(altura);
        
        JOptionPane.showMessageDialog(null,objCalc.getNome()+" está "+objCalc.situaçao()," Academia ",1);

    }
}
