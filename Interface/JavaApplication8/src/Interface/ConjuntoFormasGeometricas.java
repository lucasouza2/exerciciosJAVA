
package Interface;


public class ConjuntoFormasGeometricas {

    private FormaGeometrica colecao[];
    private int quant;

    public ConjuntoFormasGeometricas() {
        this.colecao = new FormaGeometrica[5];
        this.quant = 0;
    }

       public ConjuntoFormasGeometricas(int quant) {
        this.colecao = new FormaGeometrica[quant];
        this.quant = 0;
    }

    public boolean add(FormaGeometrica novaForma) {
        if (quant < colecao.length) {
            colecao[quant++] = novaForma;
            return true;
        }
        return false;
    }

    public String dadosFormasGeometricas() {
        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < quant; i++) {
            saida.append(colecao[i]).append("\n\n");
        }
        return saida.toString();
    }

}
