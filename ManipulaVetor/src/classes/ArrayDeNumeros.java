package classes;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;

public class ArrayDeNumeros {

    //atributos
    private int numeros[];
    private int totElem;

    public ArrayDeNumeros() {
        numeros = new int[10];
        totElem = 0;

    }

    public ArrayDeNumeros(int tamArray) {
        numeros = new int[tamArray];
        totElem = 0;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getTotElem() {
        return totElem;
    }

    public boolean add(int valor) {
        if (totElem < numeros.length) {
            numeros[totElem++] = valor;
            return true;
        }
        return false;
    }

    public String dados() {
        StringBuilder saida = new StringBuilder("Valores\n");
        for (int cont = 0; cont < totElem; cont++) {
            saida.append(numeros[cont]).append("\t");
        }

        return saida.toString();
    }

    public void invertenumeros() {
        int aux = 0;
        int contA = totElem - 1;
        for (int i = 0; i <= contA / 2; i++) {
            aux = numeros[i];
            numeros[i] = numeros[contA];
            numeros[contA] = aux;
            contA--;
        }

    }

    public void soma() {
        int soma = 0;
        for (int cont = 0; cont < totElem; cont++) {
            soma += numeros[cont];
        }
        numeros[0] = soma;
        totElem = 1;
    }

    public void adicionaAle() {
        Random random = new Random();
        while (add(random.nextInt(10)));
    }

    public void menorMaior() {
        int aux = 0;
        for (int i = 0; i < totElem; i++) {
            for (int j = 0; j < totElem - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public int indice(int num) {
        int cont=0;
        for (int i = 0; i < totElem; i++) {
            if (numeros[i] == num) {
                 cont++;
            }
        
        } 
        return cont;
    }
    public int[] procurar(int num){
    int[] vetor = new int[indice(num)];
    int j = 0;
    for (int i = 0; i < totElem; i++) {
            if (numeros[i] == num) {
              vetor[j]=i ;
              j++;
            }
    }
    return vetor;
    
}
    public boolean troca(int numeroAtrocar)
}
