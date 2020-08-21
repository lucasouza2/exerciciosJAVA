
package Interface;


public class Retangulo implements FormaGeometrica{
    private float base;
    private float altura;
    
    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }
    

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
       return 2*base+2*altura;
    }

   
     @Override
    public String toString(){
    return tipo()+"Retangulo\n"+
            "\nBase="+getBase()+
            "\nAltura="+getAltura()+
            "\nArea="+MASCARA.format(area())+
            "\nPerimetro="+MASCARA.format(perimetro());
    }
    
}
