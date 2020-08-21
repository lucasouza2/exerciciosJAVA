
package appfrase;

import javax.swing.JOptionPane;


public class AppFrase {


    public static void main(String[] args) {
    String frase = JOptionPane.showInputDialog(null,"Digite a frase","App Frase",3);
    String letra = JOptionPane.showInputDialog(null,"Qual a letra","App Frase",3);
    Frase objletras = new Frase();
    
    
   
    objletras.setLetra(letra.charAt(0));
        objletras.setTexto(frase);
                
    JOptionPane.showMessageDialog(null,"A sentença ' "+ objletras.getPalavra() +" ' apresenta "+objletras.ehTexto() + " vezes a letra " + objletras.getLetra());
        
    }
    
}
