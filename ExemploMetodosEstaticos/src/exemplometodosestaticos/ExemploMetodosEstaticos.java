
package exemplometodosestaticos;

import javax.swing.JOptionPane;


public class ExemploMetodosEstaticos {

   
    public static void main(String[] args) {
        
        String operaçoes[]={"maior três valores","é par","soma dois numeros","é primo","sair"};
        String escolhaUsr="";
        
        while(!operaçoes.equals(operaçoes[4])){
            escolhaUsr=(String)JOptionPane.showInputDialog(null,"Escolha sua opçao","App",3,null,operaçoes,operaçoes[0]);
              
               
                    
        
        while(escolhaUsr){
           case escolharUsr = "maior três valores"};
        }}
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero",3));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero",3));
        int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro numero",3));
        
        JOptionPane.showMessageDialog(null,"Maior de Tres valores "+MetodosDiversos.maiorTresInteiros(num1,num2 ,num3),"Estaticos",1);
        
        
                
    }
    
}
