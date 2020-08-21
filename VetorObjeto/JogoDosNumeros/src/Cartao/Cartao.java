package Cartao;

import javax.swing.JOptionPane;

public abstract class Cartao {

    protected int numeros[];
    protected int contNumeros;

    public Cartao(int qtde) {
        numeros = new int[qtde];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int addNumeros(int numero) {
        if (contNumeros < numeros.length) {
            if (!existe(numero)) {
                numeros[contNumeros++] = numero;
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

    public boolean existe(int num) {
        for (int i = 0; i < contNumeros; i++) {
            if (numeros[i] == num) {
                return true;
            }
        }
        return false;
    }

    public String numerosCartao() {
        StringBuilder saida = new StringBuilder("Valores:\n");
        for (int i = 0; i < contNumeros; i++) {
            saida.append(numeros[i]).append("\t");
        }
        return saida.toString();
    }

}//fim
// -1=estouro
// 1 = addiciona 
// 0 = ja existe
