
package Jogo;

public class Palavra {
    private String textoDaPalavra;
    private String dica;

    public Palavra(String textoDaPalavra, String dica) {
        this.textoDaPalavra = textoDaPalavra;
        this.dica = dica;
    }

    public Palavra() {
    }

    public String getTextoDaPalavra() {
        return textoDaPalavra;
    }

    public void setTextoDaPalavra(String textoDaPalavra) {
        this.textoDaPalavra = textoDaPalavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
    
    
}