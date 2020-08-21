
package appfuncionarioherança;


public class Funcionario {

private String nome;
private String carteiraDeTrabalho;
protected double salarioBase;

//contrutor

    public Funcionario(String nome, String cTrabalho, double salario) {
        this.nome = nome;
        this.carteiraDeTrabalho = cTrabalho;
        this.salarioBase = salario;
    }
    public Funcionario(){}


//metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
//metodos
    
    public String dadosFuncionario(){
    return "Demonstrativo de Pagamento "+ "\nFuncionario:"+nome+
            "\nCarteira de Trabalho n°"+carteiraDeTrabalho+
            "\nSálario base: R$" + salarioBase;
    }





}
