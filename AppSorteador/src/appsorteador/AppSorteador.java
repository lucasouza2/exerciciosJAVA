
package appsorteador;


import javax.swing.JOptionPane;


public class AppSorteador {

   
    public static void main(String[] args) {
        
       
        
        Sorteador objSorteador = new Sorteador();
        
        
        int nD = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivinhe o numero entre 0 e 10","AppSorteador",3)); 
        
        while (!objSorteador.acertou(nD)){
            JOptionPane.showMessageDialog(null, "Infelizmente vc não acertou. Tente novamente");
            nD = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivinhe o numero entre 0 e 10","AppSorteador",3)); 
        }
        
            JOptionPane.showMessageDialog(null,"Você acertou em "+objSorteador.getTentativas()+" tentativas");
            
        }
    }
    
