
package appfolhadepagamentoherança;


public class Empregado {
    //atributos
    protected String matricula;
    protected String nome;
    protected String cpf;
    protected float salario;

    public Empregado(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Empregado(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }
    
    
    
    
    public float inss(){
        return salario*8/100;    
    }
    
    
}
