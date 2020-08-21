package Cartao;

import java.util.Random;

public class CartaoSorteio extends Cartao {

    public CartaoSorteio() {
        super(6);
        sorteiaNumeros();;
    }

    private void sorteiaNumeros() {
        Random valorRand = new Random();
        int i = 1;
        while (i <= numeros.length) {
            if (addNumeros(valorRand.nextInt(50) + 1) == 1) {
                i++;
            }
        }
    }
}
