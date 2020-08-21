
package appfuncionarioherança;


public class FuncionarioComissionado extends Funcionario{
    private double totalDeVenda;
    private double percentualDeComissao;
    
    //construtor

    public FuncionarioComissionado(double totalDeVenda, double percentualDeComissao, String nome, String cTrabalho, double salario) {
        super(nome, cTrabalho, salario);
        this.totalDeVenda = totalDeVenda;
        this.percentualDeComissao = percentualDeComissao;
    }

    public double getTotalDeVenda() {
        return totalDeVenda;
    }

    public void setTotalDeVenda(double totalDeVenda) {
        this.totalDeVenda = totalDeVenda;
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    //metodos
    
    public double calculaSalarioTotal(){
    return salarioBase+(totalDeVenda*percentualDeComissao/100);
    
    }
    
    @Override
    public String dadosFuncionario(){
    return super.dadosFuncionario()+
            "\nTotal vendido: "+totalDeVenda+
            "\n% de comissão:"+percentualDeComissao+
            "\nSallário final R$ "+calculaSalarioTotal();
    }
    
    
    
}
