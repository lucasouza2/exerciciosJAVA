
package appoperaçoesbasica;

import javax.swing.JOptionPane;


public class AppOperaçoesBasica {
        public static void main(String[] args) {
        double x=Double.parseDouble(JOptionPane.showInputDialog(null,"informe o primeiro número","calculadora",JOptionPane.QUESTION_MESSAGE));
        double y=Double.parseDouble(JOptionPane.showInputDialog(null,"informe o segundo número","calculadora",JOptionPane.QUESTION_MESSAGE));  
        
        //criaçao ou instanciaçao do objeto
        Calculadora objCalc = new Calculadora();
         objCalc.setX(x);
         objCalc.setY(y);
                         
        JOptionPane.showMessageDialog(null,"As operaçoes são:\n"+
                objCalc.getX()+"+"+objCalc.getY()+"="+objCalc.soma()+"\n"+
                objCalc.getX()+"-"+objCalc.getY()+"="+objCalc.subtraçao()+"\n"+
                objCalc.getX()+"/"+objCalc.getY()+"="+objCalc.divisao()+"\n"+
                objCalc.getX()+"*"+objCalc.getY()+"="+objCalc.multiplicaçao(),
                "Calculadora",JOptionPane.PLAIN_MESSAGE);
        }
    
}
