package classe;

import java.util.Random;

public class MatrizDeInteiros {

    private int matriz[][];

    public MatrizDeInteiros(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }

    private void zeraMatriz() {
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                matriz[linhas][colunas] = 0;
            }
        }
    }

    public void adicionaMatriz() {
        Random valor = new Random();
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                matriz[linhas][colunas] = valor.nextInt(10);
            }
        }
    }

    public int somarMatriz() {
        int somador = 0;
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                somador = somador + matriz[linhas][colunas];
            }

        }
        return somador;
    }
    
    public int[][] testar() {
        
        int[][] valor = new int[matriz[0].length][matriz.length];
        
        for(int c = 0; c < matriz[0].length; c++){
            for(int l = 0; l < matriz.length; l++){
                valor[c][l] = matriz[l][c];
            }
        }

        return valor;
    }

    public int[] somaLinha() {
        int[] valor = new int[matriz.length];
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            valor[linhas] = 0;
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                valor[linhas] += matriz[linhas][colunas];
            }

        }
        return valor;

    }
    public int[] somaColuna() {
        int[] valor = new int[matriz[0].length];
        for (int colunas = 0; colunas < matriz.length; colunas++) {
            valor[colunas] = 0;
            for (int linhas = 0; linhas < matriz[colunas].length; linhas++) {
                valor[colunas] += matriz[linhas][colunas];
            }

        }
        return valor;

    }

    public int contarValor(int numero) {
        int cont = 0;
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                if (matriz[linhas][colunas] == numero) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public int[][] returnPos(int numero) {
        int[][] valor = new int[contarValor(numero)][2];
        int aux = 0;
        int aux2 = 1;
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                if (matriz[linhas][colunas] == numero) {
                    valor[aux][0] = linhas;
                    valor[aux][1] = colunas;
                    aux++;

                }
            }

        }
        return valor;
    }

    public String dados() {
        StringBuilder saida = new StringBuilder("Valores\n"); //StringBuilder consome menos memória
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                saida.append(matriz[l][c]);
                saida.append("\t");
            }
            saida.append("\n");

        }
        return saida.toString();
    }
    
    public String dadosMat(int[][] mat) {
        StringBuilder saida = new StringBuilder("Valores\n"); //StringBuilder consome menos memória
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                saida.append(mat[l][c]).append("\t");
                            }
            saida.append("\n");

        }
        return saida.toString();
    }
    
        public String dadosVetor(int[] vet) {
        StringBuilder saida = new StringBuilder("Valores\n"); //StringBuilder consome menos memória
        for (int l = 0; l < vet.length; l++) {
      
     

        }
        return saida.toString();
    }


}
