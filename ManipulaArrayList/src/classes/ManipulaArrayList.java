
package classes;

import java.util.ArrayList;

public class ManipulaArrayList {
    //Atributo
    private ArrayList<String> lista;

    //Construtor
    public ManipulaArrayList() {
        lista=new ArrayList<>();
       }
        
    public void adiciona(String info){
        lista.add(info);
    } 
    public String getInfoLista(int pos){
        return lista.get(pos);
    }
    public ArrayList<String> getLista() {
        return lista;
    }    
    public int tam(){
        return lista.size();
    }   
    public String remove(int pos){
        return lista.remove(pos);
    }
    public Object[] getArrayLista(){
        return lista.toArray();
    }
    public void removeTodos(){
        lista.clear();
        
    }
}//fim da classe
