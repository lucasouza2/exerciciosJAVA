
package appterreno;

import javax.swing.JOptionPane;

public class AppTerreno {
    public static void main(String[] args) {
        String comp=JOptionPane.showInputDialog(null,"Digite o comprimento","AppTerreno v. 1.0",JOptionPane.QUESTION_MESSAGE);
        String larg=JOptionPane.showInputDialog(null,"Digite o largura","AppTerreno v. 1.0",JOptionPane.QUESTION_MESSAGE);
        
        //converte comp (String)para float
        float comprimento=Float.parseFloat(comp);
        float largura=Float.parseFloat(larg);
        
        //criaçao ou instanciaçao do objeto
        Terreno objTerreno = new Terreno();
        
        objTerreno.setComprimento(comprimento);
        objTerreno.setLargura(largura);
              
        
        JOptionPane.showMessageDialog(null,"serão necessários "+objTerreno.calculaPerimetro()+" metros de arame"," AppTerreno v.1.0 ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
