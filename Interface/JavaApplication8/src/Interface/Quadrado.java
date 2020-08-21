
package Interface;


public class Quadrado implements FormaGeometrica{
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public String toString(){
    return "Quadrado\n"+
            "\nLado="+getLado()+
            "\nArea="+MASCARA.format(area())+
            "\nPerimetro="+MASCARA.format(perimetro());
    }


}











