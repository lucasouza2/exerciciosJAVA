package multiplo;

public class DoisNumeros {
    //Atributos

    private int numero1;
    private int numero2;

    //metodos de Acesso
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Métodos gerais
    public boolean ehMultipo() {
        if (numero1 % numero2 == 0) {
            return true;
        }
        return false;

    }
}
