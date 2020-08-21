package classes;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Random;
import javafx.scene.chart.LineChart;

/**
 * @author Ângelo
 */
public class MatrizDeInteiros {

    private int[][] matriz;
    
    public MatrizDeInteiros(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }

    @Override
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

    public void completarRandom() {
        Random rng = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (rng.nextInt(99) + 1) * (rng.nextBoolean() ? -1 : 1);
            }
        }
    }

    public int somarMatriz() {
        int resultado = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                resultado += matriz[l][c];
            }
        }
        return resultado;
    }

    public int[][] subMatrizTramp(int[][] matrizTransposta) {
        int aux[][] = new int[matriz.length][matriz.length];
        int cont = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha != coluna) {
                    aux[linha][coluna] = matriz[linha][coluna] - matrizTransposta[linha][coluna];
                    cont++;
                }
            }
        }
        return aux;
    }

    public int[][] encontrarNaMatriz(int valor) {
        int[][] matrizAuxiliar = new int[contarNumeros(valor)][2];
        int count = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == valor) {
                    matrizAuxiliar[count][0] = linha;
                    matrizAuxiliar[count][1] = coluna;
                    count = count + 1;

                }
            }
        }
        return matrizAuxiliar;
    }

    public int contarNumeros(int valor) {
        int cont = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (valor == matriz[l][c]) {
                    cont++;
                }
            }

        }
        return cont;
    }

    public int[] somarCadaLinha() {
        int[] auxMatriz = new int[matriz.length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                auxMatriz[l] += matriz[l][c];
            }
        }
        return auxMatriz;
    }

//    }
    public int[] somarCadaColuna() {
        int[] soma = new int[matriz.length];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma[coluna] += matriz[linha][coluna];
            }
        }
        return soma;
    }

    public int[][] matrizTransposta() {
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matrizTransposta[c][l] = matriz[l][c];
            }
        }
        return matrizTransposta;
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

    public int[] diagonalPrincipal() {//melhorar utilizando apenas uma estrutura de repetiçao
        int[] vetor = new int[matriz.length];
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            vetor[count] = matriz[l][l];
            count++;
        }

        return vetor;
    }

    public int[] diagonalSecundaria() {
        int[] vetor = new int[matriz.length];
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l == matriz[l].length - c - 1) {
                    vetor[count] = matriz[l][c];
                    count++;
                }
            }
        }
        return vetor;
    }

    public int[] retornarImpares() {
        int[] vetor = new int[contarImpares()];
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] % 2 != 0) {
                    vetor[count] = matriz[l][c];
                    count++;
                }
            }
        }
        return vetor;
    }

    public int contarImpares() {
        int count = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[][] trocarLinhas() {
        int[][] aux = new int[matriz.length][matriz[0].length];
        int max = matriz.length - 1;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l == 0) {
                    aux[max][c] = matriz[l][c];
                } else if (l == max) {
                    aux[0][c] = matriz[l][c];
                } else {
                    aux[l][c] = matriz[l][c];
                }
            }
        }
        return aux;
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

    public int retornarMaiorValor() {//melhor o codigo pois esta errado
        int aux = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] > aux) {
                    aux = matriz[l][c];
                }
            }
        }
        return aux;
    }

    public int[][] substituir() {
        int[][] aux = new int[matriz.length][matriz[0].length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] % 2 == 0) {
                    aux[l][c] = 1;
                } else {
                    aux[l][c] = -1;
                }
            }
        }
        return aux;
    }

    public boolean matrizSimetrica() {
        int[][] matrix = matrizTransposta();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (linha != coluna) {
                    if (matriz[linha][coluna] != matrix[linha][coluna]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean matrizQuadrada() {
        return matriz.length == matriz[0].length;
    }

    public int [][] matrizRandom(int linha,int coluna) {
        int [][]matrizR = new int[linha][coluna];
        Random rng = new Random();
        for (int l = 0; l < matrizR.length; l++) {
            for (int c = 0; c < matrizR[l].length; c++) {
                matrizR[l][c] = (rng.nextInt(99) + 1) * (rng.nextBoolean() ? -1 : 1);
            }
        }
        return matrizR;
    }


    public int[][] multiplicaMatriz(int[][] matrizRandom) {
        int[][] resp = new int[matriz.length][matrizRandom[0].length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matrizRandom[l].length; c++) {
                for (int x = 0; x < matriz[l].length; x++) {
                    resp[l][c] += (matriz[l][x] * matrizRandom[x][c]);

                }
            }
        }
        return resp;
    }
    
    public int getLinhas() {
        return matriz.length;
    }
    
    public int getColunas() {
        return matriz[0].length;
    }
}
