
package Matris;


public class Matriz {
    private int mat[][]={{1,2,3},{5,8},{9},{6,7,8,9}};
   
    
    public String getMat(){
    StringBuilder saida= new StringBuilder("Valores\n");
    for(int vet[]:mat){
    for(int valor:vet){
    saida.append(valor).append(" ");
    }
    saida.append("\n");
    }
    return saida.toString();
    }
    
    
    
//    public String getMat(){
//    StringBuilder dados = new StringBuilder("Valor:\n");
//    for(int l=0;l<mat.length;l++){
//    for (int c=0;c<mat[l].length;c++){
//    dados.append(mat[l][c]);
//    dados.append("\t");
//    }
//    dados.append("\n");}
//    return dados.toString();}
//    
    




    
}


