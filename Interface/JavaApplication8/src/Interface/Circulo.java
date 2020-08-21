
package Interface;


public class Circulo implements FormaGeometrica{
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(raio,2));
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public String tipo() {
        return "Circulo";
    }
    @Override
    public String toString(){
    return tipo()+
            "\n\nRaio="+getRaio()+
            "\nArea="+MASCARA.format(area())+
            "\nPerimetro="+MASCARA.format(perimetro());
    }
}
