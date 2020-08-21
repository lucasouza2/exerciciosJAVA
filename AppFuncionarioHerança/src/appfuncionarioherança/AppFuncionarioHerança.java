
package appfuncionarioherança;

import javax.swing.JOptionPane;


public class AppFuncionarioHerança {


    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog(null,"Nome do Funcionario","Folha Pgto",3);
        String carteira=JOptionPane.showInputDialog(null,"carteira de trabalho","Folha Pgto",3);
        double salarioBase=Double.parseDouble(JOptionPane.showInputDialog(null,"Salário Base","Folha Pgto",3));
        
    String tipoFunc[]={"Funcionário","Funcionário Comissionado"};
    
    String escolhaUsr=(String)JOptionPane.showInputDialog(null,"selecio o tipo de funcionário","Folha Pgto",3,null,tipoFunc,tipoFunc[0]);
    if(escolhaUsr.equals(tipoFunc[0])){
        Funcionario func = new Funcionario(nome,carteira,salarioBase);
        JOptionPane.showMessageDialog(null,func.dadosFuncionario(),"Folha Pgto",1);
            }else if(escolhaUsr.equals(tipoFunc[1])){
            double vendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Total vendido","Folha Pgto",3));
            double percentual=Double.parseDouble(JOptionPane.showInputDialog(null,"percentual a ser aplicado","Folha de pgto",3));
            FuncionarioComissionado funcComissionado = new  FuncionarioComissionado(vendas,percentual,nome,carteira,salarioBase);
            JOptionPane.showMessageDialog(null,funcComissionado.dadosFuncionario(),"Folha Pgto",1);
            }
    System.exit(0);
    }
    
    
    
}
