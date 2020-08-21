package appterreno;

public class Terreno {

    //Atributos
    private float comprimento;
    private float largura;

    //Métodos de Acesso
    public void setComprimento(float comp){comprimento=comp;}
    public void setLargura(float larg){largura=larg;}
    public float getComprimento(){return comprimento;}
    public float getLargura(){return largura;}
    
    //Métodos
    public float calculaPerimetro() {
        return 2 * comprimento + 2 * largura;
    }

}
