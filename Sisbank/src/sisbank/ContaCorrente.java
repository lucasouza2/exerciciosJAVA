package sisbank;

public class ContaCorrente {

    //Atributos
    private String numeroDaConta;
    private Pessoa titular;
    private double saldo;

    public ContaCorrente(String numero, Pessoa titular) {
        numeroDaConta = numero;
        this.titular = titular;
        saldo = 0;
    }
    //metodos de acessos 

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

//metodos gerais
    public void deposito(float valor) {
        saldo += valor;//saldo=saldo+valor
    }

    public boolean saque(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
