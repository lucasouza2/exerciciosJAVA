
package appoperaçoesbasica;

public class Calculadora {
    //Atributos
    private double x;
    private double y;
    
    //metodos de acesso

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    //metodos
    public double soma(){return x+y;}
    public double subtraçao(){return x-y;}
    public double divisao(){return x/y;}
    public double multiplicaçao(){return x*y;}
    
    
}
