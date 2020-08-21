package fatorial;

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {

       int numero= Integer.parseInt(JOptionPane.showInputDialog(null,"coloque o valor para calcular o fatorial","calculo fatorial",3));            
        Fatorialapp fat = new Fatorialapp();
          fat.setFatorialapp(numero);
        JOptionPane.showMessageDialog(null, " resultado fatorial " +fat.calcFatorial());
    }

}
