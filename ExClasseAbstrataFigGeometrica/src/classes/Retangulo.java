
package classes;

public class Retangulo extends FiguraGeometrica{
    //Atributos
    private float comprimento;
    private float largura;
    
    public Retangulo(float comprimento,float largura){
        super("Retângulo");
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
       return comprimento * largura;
    }

    @Override
    public double perimetro() {
        return 2*comprimento + 2 * largura;
    }
    
    
        
        
}
