
package classes;

import static java.lang.Math.*;

public class Circulo extends FiguraGeometrica{
    //Atributos
    private float raio;

    public Circulo(float raio) {
        super("Circulo");
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*pow(raio, 2);
    }

    @Override
    public double perimetro() {
       return 2*PI*raio;
    }
    
    public float diametro(){
        return 2*raio;
    }
    
    public String dados(){
        return super.dados()+
                "\nRaio: "+raio+
                "\nDiâmetro: "+diametro();
    }
    
    
}
