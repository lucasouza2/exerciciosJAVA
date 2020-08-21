
package apptabuada;

import javax.swing.JOptionPane;

public class AppTabuada {

    
    public static void main(String[] args) {
    int num=Integer.parseInt(JOptionPane.showInputDialog(null,"informe o n°","AppTabuada",3));
     
    Tabuada objTabuada;
    
    objTabuada=new Tabuada(num);
    
    
    JOptionPane.showMessageDialog(null,objTabuada.ehTabuada(),"Tabuada do n°"+objTabuada.getNumero(),1);
            }
}
