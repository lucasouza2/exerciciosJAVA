package appfrase;

public class Frase {

    private String texto;
    private char letra;

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   

    public String getPalavra() {
        return texto.toLowerCase();
    }


    //metodos
    public int ehTexto() {
        int contLetra = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contLetra++;
            }

        }

        return contLetra;
    }
}
