
package apptabuada;

public class Tabuada {
//Atributo
private int numero; 
 //construtor
public Tabuada(int num){this.numero=num;}
    
//metodos acesso
    public void setNumero(int numero){
    this.numero=numero;}
    public int getNumero(){
    return numero;}
    
    public String ehTabuada(){
    String resultado="";
    
    for(int i=1;i<=10;i++){
    resultado=resultado+numero+"x"+i+"="+numero*i+"\n";
    }return resultado;
    }
    
    
    
    






}//fim
