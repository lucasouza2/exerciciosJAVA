
package contacorrenteheranca;

public class ContaEspecial extends ContaCorrente{
    private double limite;
    
    //Construtor

    public ContaEspecial(double limite, String numeroConta, Pessoa titular) {
        super(numeroConta, titular);
        this.limite = limite;
    }

    public ContaEspecial(String numeroConta, Pessoa titular) {
        super(numeroConta, titular);
        limite=1000;
    }
    
     public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo()+limite;
    }
       

    @Override
    public String toString(){
        return super.toString()+
                "\nLimite: "+limite+
                "\nSaldo disponível: "+getSaldo();
    }
    
    
    
}
