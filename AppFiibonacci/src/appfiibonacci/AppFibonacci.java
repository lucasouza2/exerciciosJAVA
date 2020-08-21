
package appfiibonacci;



import com.sun.javafx.tk.PrintPipeline;
import javax.swing.JOptionPane;


public class AppFibonacci {

    
    public static void main(String[] args) {
       Fibonacci objFibonacci = new Fibonacci();
       String resultado = " ";
        for (int i = 0; i < 20; i++) {
        resultado=resultado + objFibonacci.calcFi(i) + "\n";
        }
         
        
        JOptionPane.showMessageDialog(null,resultado);
       
              
    }
    
}
