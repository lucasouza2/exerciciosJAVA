package appcontacorrente;

public class ContaCorrente {

    protected String conta;
    protected Pessoa titular;
    protected double saldo;

    public ContaCorrente(String conta, Pessoa titular) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos
    public boolean saque(float valor) {
        if (getSaldo() >= valor) {
            saldo -= valor;
            return true;
        }
        return false;}
    
public void deposito(float valor){
saldo+=valor;}
    
public String toString(){
return "Banco para todos S.A "+
        "\nConta n°: "+conta+
        "\nTitular: "+titular.dadosPessoa()+
        "\nSaldo: "+getSaldo();
}
}
