package appsorteador;

import java.util.Random;

public class Sorteador {

    private int numeroSort;
    private byte tentativas;

    public Sorteador() {
        Random gerador = new Random();
        numeroSort = gerador.nextInt(11);
        tentativas = 0;
    }

    public int getNumeroSort() {
        return numeroSort;
    }

    public byte getTentativas() {
        return tentativas;
    }
    
    public boolean acertou(int palpite){
        boolean acertou = false;
        if (numeroSort == palpite){
            acertou =true;
        }
        
        tentativas++;
        return acertou;
    }

}//fim
