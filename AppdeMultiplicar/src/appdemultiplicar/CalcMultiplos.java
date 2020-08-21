package appdemultiplicar;

public class CalcMultiplos {

    //atributos
    int numero1;
    int numero2;

    public CalcMultiplos(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //metodos
    public int calcM() {
        int resultado = 0;
        for (int i = 0; i < numero2; i++) {
            resultado = resultado + numero1;
        }
        return resultado;

    }

}
