package multiplo;

import javax.swing.JOptionPane;

public class Multiplo {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o primeiro número", "Multiplo", 3));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o segundo número", "Multiplo", 3
        ));

        DoisNumeros objDois = new DoisNumeros();//instanciaçao de obj
        objDois.setNumero1(n1);
        objDois.setNumero2(n2);

        boolean resultado = objDois.ehMultipo();

        String msg = "não é multiplo";

        if (resultado) {
            msg = "é multiplo";
        }

        JOptionPane.showMessageDialog(null, objDois.getNumero1() + " " + msg + " de " + objDois.getNumero2(), "Aplicativo Multiplo", 1);
    }

}
