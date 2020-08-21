
package Jogo;

import java.util.Random;

public class JogoDaForca {
    private Palavra arrayPalavra[];


    private Palavra dica[];
    
    Random random = new Random();

    public JogoDaForca() {
        arrayPalavra= new Palavra[10];
        adicionaPalavraVetor();
    }


    public void adicionaPalavraVetor(){
        String palavra[]={"arroz","teclado","lampada","lousa","dentista","quadro","caderno","bicicleta","colher","calendario"};
        String dica[]={"É uma comida","É um periférico de computador","Fica do teto","Tem na sala de aula","É um profissional da saúde","Serve como decoração","É um material escolar","É um meio de transporte","Tem na cozinha","Diz quando estamos"};
        for(int i=0;i<arrayPalavra.length;i++){
            arrayPalavra[i]= new Palavra(palavra[i],dica[i]);
        }
    }
    public Palavra sorteiaPalavra(){
        return arrayPalavra[random.nextInt(arrayPalavra.length)];
    }
    public String[] codificaPalavra(String palavraEscolhida){
        String palavraCodificada[] = new String[palavraEscolhida.length()];
        for(int i=0; i<palavraEscolhida.length();i++){
            palavraCodificada[i]="_";
        }
        return palavraCodificada;
    }
    
    public String[] atualizaPalavra(String palavra,String[] palavraCodificada, char letraJogador){
        String letraS= String.valueOf(letraJogador);
        int pos=0;
        while(palavra.indexOf(letraJogador, pos)!=-1){
                pos=palavra.indexOf(letraJogador,pos);
                palavraCodificada[pos]=letraS;
                pos++;
        }
        return palavraCodificada;
    }
    
    public boolean verificaLetra(char letraJogador, String palavra){
        return palavra.indexOf(letraJogador)==-1;
    }
    
    public String transcrevePalavra(String[] palavraVetor){
        String palavraString="";
        for(int i=0;i<palavraVetor.length;i++){
            palavraString+=palavraVetor[i]+" ";
        }
        return palavraString;
    }
}
