
package appdemultiplicar;

import javax.swing.JOptionPane;


public class AppdeMultiplicar {

   
    public static void main(String[] args) {
        CalcMultiplos objCalcMultipos;
         int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque o primeiro numero","AppdeSoma",3));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque o segundo numero","AppdeSoma",3));
         
        
    
        objCalcMultipos = new CalcMultiplos(numero1,numero2);
        JOptionPane.showMessageDialog(null,objCalcMultipos.calcM(), "AppdeSoma" ,1);
    }
    
}//fim

