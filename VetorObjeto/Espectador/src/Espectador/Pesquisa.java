package Espectador;


import Espectador.Espectador;


public class Pesquisa {

    private Espectador pesquisa[];
    private int qtdeRespPesquisa;

    public Pesquisa(int tam) {
        pesquisa = new Espectador[tam];
    }

    public Pesquisa() {
        pesquisa = new Espectador[10];
    }

    public int getQtdeRespPesquisa() {
        return qtdeRespPesquisa;
    }

    public boolean adiciona(Espectador novo) {
        if (qtdeRespPesquisa < pesquisa.length) {
            pesquisa[qtdeRespPesquisa++] = novo;
            return true;
        }
        return false;
    }

    public int[] ocorrencias() {
        int resultado[] = new int[5];
        for (int i = 0; i < qtdeRespPesquisa; i++) {
            switch (pesquisa[i].getOpiniao()) {
                case 'A':
                    resultado[0]++;
                    break;
                case 'B':
                    resultado[1]++;
                    break;
                case 'C':
                    resultado[2]++;
                    break;
                case 'D':
                    resultado[3]++;
                    break;
                case 'E':
                    resultado[4]++;
                    break;

            }
        }
        return resultado;

    }
public String dados(int ocorrencias[]){
String saida ="\n";
String valores[]={"A(Ótimo)","B(Bom)","C(Regular)","D(Ruim)","E(Péssimo)"};
for(int i=0;i<ocorrencias.length;i++){
saida+=valores[i]+ "="+ocorrencias[i]+"\n";}
return saida;

}
}//fim
