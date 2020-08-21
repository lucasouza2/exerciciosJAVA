package classes;

public class CartaoAposta extends Cartao {

    private static int numeroAposta;

    public CartaoAposta(int tam()) {
        super(tam());
        setNumeroAposta();
    }

    public int getNumeroAposta() {
        return numeroAposta;
    }

    private void setNumeroAposta() {
        numeroAposta++;
    }

    public float calculaAposta() {
        float valorAposta = 0;
        switch (numeros.length) {
            case 6:
                valorAposta = 3.5f;
                break;
            case 7:
                valorAposta = 24.5f;
                break;
            case 8:
                valorAposta = 98f;
                break;
            case 9:
                valorAposta = 294f;
                break;
            case 10:
                valorAposta = 735f;
                break;
        }
        return valorAposta;
    }

    public int[] valoresIguais(CartaoSorteio sorteio) {
        int acertos = totAcertos(sorteio);

        int iguais[] = new int[acertos];
        int k = -1;
        for (int i = 0; i < contNumeros; i++) {
            if (sorteio.existe(numeros[i])) {
                iguais[++k] = numeros[i];
            }
        }
        return iguais;
    }

    public int totAcertos(CartaoSorteio sorteio) {
        int acertos = 0;
        for (int i = 0; i < contNumeros; i++) {
            if (sorteio.existe(numeros[i])) {
                acertos++;
            }
        }
        return acertos;
    }
}
