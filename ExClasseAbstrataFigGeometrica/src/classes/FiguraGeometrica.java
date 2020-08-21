
package classes;

public abstract class FiguraGeometrica {
    //Atributos
    protected String tipo;
    
    //Construtor
    public FiguraGeometrica (String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public abstract double area();
    public abstract double perimetro();
    public String dados(){
        return "Figura do tipo: "+tipo+
                "\nÁrea: "+area()+
                "\nPerímetro: "+perimetro();
    }
}
