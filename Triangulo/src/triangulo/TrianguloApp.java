package triangulo;

import javax.swing.JOptionPane;

public class TrianguloApp {

    public static void main(String[] args) {
        float l1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Inforrme a primeiro medida do Triângulo", "TrianguloApp", 3));
        float l2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a segunda medida do Triângulo", "TrianguloApp", 3));
        float l3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a terceira medida do Triângulo", "TrianguloApp", 3));

        //instanciação
        Triangulo objTriangulo;
        objTriangulo = new Triangulo(l1, l2, l3);

        JOptionPane.showMessageDialog(null, "O resultado é " + objTriangulo.TipoTriangulo(), "TrianguloApp", JOptionPane.INFORMATION_MESSAGE);
    }

}//FIM

