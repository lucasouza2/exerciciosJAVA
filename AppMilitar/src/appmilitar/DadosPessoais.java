package appmilitar;

public class DadosPessoais {
//atributos

    private String nome;
    private byte idade;
    private float altura;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
//metodo

    public String estaApto() {
        if (this.sexo == 'f') {
            return "Não possui o sexo necessario";
        } else if (idade < 18) {
            return "Não possui a idade correta";
        } else {
            return "Você está Inapto para serviços militares";
        }
    }

}
