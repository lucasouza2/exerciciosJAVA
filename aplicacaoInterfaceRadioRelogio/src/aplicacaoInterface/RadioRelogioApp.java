
package aplicacaoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Alindacir
 */
public class RadioRelogioApp {
   public static void main(String[] args) {
        RadioRelogio meuRadio = new RadioRelogio();
        meuRadio.ajustaHora();
        meuRadio.sintoniza(102.9f);
       JOptionPane.showMessageDialog(null,meuRadio,"Exemplo Interface",1);
        meuRadio.mostraHora();
        System.exit(0);
    }
    
}
