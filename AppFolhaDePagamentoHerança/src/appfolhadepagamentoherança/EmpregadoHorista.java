
package appfolhadepagamentoherança;


public class EmpregadoHorista extends Empregado{
    private float valorHora;
    private int horasTrab;
    
    public EmpregadoHorista(String matricula,String nome,float valorHora,int horasTrab){
    super(matricula,nome);
    this.valorHora=valorHora;
    this.horasTrab=horasTrab;
    }
}
