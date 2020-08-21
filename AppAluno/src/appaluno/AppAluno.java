
package appaluno;

import javax.swing.JOptionPane;

public class AppAluno {

    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog(null,"Nome do Aluno", "AppAluno", 3);
       String ra = JOptionPane.showInputDialog(null,"R.A do Aluno", "AppAluno", 3);
       float notaEnade = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota do Enade", "AppAluno", 3));
       float parcial1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Primeira nota Parcial", "AppAluno", 3));
       float parcial2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Segunda nota Parcial", "AppAluno", 3));
       float principal =Float.parseFloat(JOptionPane.showInputDialog(null,"Notal Principal", "AppAluno", 3));
       
       //instanciação
       Aluno objAluno = new Aluno();
       objAluno.setNome(nome);
       objAluno.setRa(ra);
       objAluno.setNotaEnade(notaEnade);
       objAluno.setParcial1(parcial1);
       objAluno.setParcial2(parcial2);
       objAluno.setPrincipal(principal);
       
       JOptionPane.showMessageDialog(null,objAluno.getNome() +" R A "+ objAluno.getRa() + " Nota "+ objAluno.ehAluno()+" "+ objAluno.situaçao()," Parabens ",1);
    } 

    
    
}//fim

