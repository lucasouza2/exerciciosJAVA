package classes;

import java.util.ArrayList;

public abstract class Cartao {

    private ArrayList<Integer> numeros;
    protected int contNumeros;

    public Cartao() {
        numeros = new ArrayList<>();
        contNumeros = 0;
    }

    public int getContNumeros() {
        return contNumeros;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void adiciona(Integer adici) {
        numeros.add(adici);
    }

    public Integer getInfAdici(int pos) {
        return numeros.get(pos);
    }

    public int tam() {
        return numeros.size();
    }

    public Integer remove(int pos) {
        return numeros.remove(pos);
    }

    public Object[] getArrayLista() {
        return numeros.toArray();
    }

    public void removeTodos() {
        numeros.clear();
    

    
    public String numerosCartao() {
        StringBuilder dados = new StringBuilder("\n");
        for (int i = 0; i < tam(); i++) {
            dados.append(numeros[i]).append(" ");
        }
        return dados.toString();
    }
}
