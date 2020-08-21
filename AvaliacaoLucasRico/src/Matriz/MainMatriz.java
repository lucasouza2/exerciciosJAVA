package Matriz;

import java.util.Random;

public class MainMatriz {

    private int matriz[][];

    public MainMatriz(int linhas, int colunas) {
        matriz = new int[3][3];
    }

    public void completarRandom() {
        Random rng = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (rng.nextInt(10));
            }
        }
    }
     public String toString() {
        StringBuilder resultado = new StringBuilder("");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                resultado.append(matriz[l][c]).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
     public boolean matrizQuadrada() {
        return matriz.length == matriz[0].length;
    }

       public int [] somarCadaLinha() {
        int[] auxMatriz = new int[matriz.length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                auxMatriz[l] += (matriz[l][c])/2;
                
            }
        }
        return auxMatriz;
       }
       
           
       
    
       public int contarPares() {
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] retornarPares() {
        int[] vetor = new int[contarPares()];
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] % 2 == 0) {
                    vetor[count] = matriz[l][c];
                    count++;
                }
            }
        }
        return vetor;
      
    }
     
    public String imprimeMatriz(int[][] matriz) {
        StringBuilder resultado = new StringBuilder("");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                resultado.append(matriz[l][c]).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }

    public String imprimeVetor(int[] vetor) {
        StringBuilder resultado = new StringBuilder("");
        int count = 0;
        for (int l = 0; l < vetor.length; l++) {
            resultado.append(vetor[l]).append("\t");
            count++;
            if (count % 5 == 0) {
                resultado.append("\n");
            }
        }
        return resultado.toString();
    }
     public int getLinhas() {
        return matriz.length;
    }
    
    public int getColunas() {
        return matriz[0].length;
    }
    
}
