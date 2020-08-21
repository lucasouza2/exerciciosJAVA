package imc;
//Alunos de academias exp
public class Calcimc {
//Atributos

    private String nome;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

//metodo
    public float Calculaimc() {
        return peso / (altura * altura);

    }

    public String situaçao() {
        float imc = Calculaimc();

        if (imc < 18.6) {
            return "abaixo do peso";
        } else if (imc <= 24.9) {
            return "peso normal";
        } else if (imc <= 30) {
            return "excesso de peso";
        } else {
            return "obeso";
        }
    }
}
