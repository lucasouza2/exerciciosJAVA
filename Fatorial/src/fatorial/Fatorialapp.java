package fatorial;

public class Fatorialapp {

    private int numero;

    public int getFatorialapp() {
        return numero;
    }

    public void setFatorialapp(int Fatorialapp) {
        this.numero = Fatorialapp;
    }

    public long calcFatorial() {

        long resultado = 1;
        if (numero == 0 || numero == 1) {
            return 1;
        }
        for (int i = 0; numero > i; i++) {
            resultado *= numero - i;
        }
        return resultado;
    }

}
