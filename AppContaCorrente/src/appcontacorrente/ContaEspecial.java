
package appcontacorrente;


public class ContaEspecial extends ContaCorrente{
    private double limite;

    public ContaEspecial(double limite, String conta, Pessoa titular) {
        super(conta, titular);
        this.limite = limite;
    }
    public ContaEspecial(String conta, Pessoa titular) {
        super(conta, titular);
        this.limite = 1000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

public double getSaldo(){
return super.getSaldo()+limite;
}
    
public String toString(){
return super.toString()+
        "\nLimite: "+limite+
        "\nSaldo disponivel: "+getSaldo();

}
    
    
    
    
    
}
