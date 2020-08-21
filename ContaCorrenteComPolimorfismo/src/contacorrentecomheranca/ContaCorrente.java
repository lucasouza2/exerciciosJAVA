
package contacorrentecomheranca;

public class ContaCorrente {
    //Atributos
    protected String numeroConta;
    protected Pessoa titular;
    protected double saldo;

    public ContaCorrente(String numeroConta, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        saldo=0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    public boolean saque(float valor){
        if (getSaldo()>= valor){
            saldo-=valor;
            return true;
        }
        return false;
    }
    
    public void deposito(float valor){
        saldo+=valor;
    }
    
    @Override
    public String toString(){
        return "Banco para todos S.A"+
                "\nConta nº: "+numeroConta+
                "\nCliente: "+titular.nomeCompleto()+
                "\nSaldo: "+saldo;
    }
    
    
    
}
