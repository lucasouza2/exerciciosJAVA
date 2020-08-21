
package appaluno;


public class Aluno {
    //atributos
    private String nome;
    private String ra;
    private float notaEnade;
    private float parcial1;
    private float parcial2;
    private float principal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getNotaEnade() {
        return notaEnade;
    }

    public void setNotaEnade(float notaEnade) {
        this.notaEnade = notaEnade;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }
    
    public float ehAluno(){
    return notaEnade+parcial1+parcial2+principal;
    }
    public String situaçao(){
    float sit = ehAluno();
    if (sit>=6){return "está Aprovador Parabéns";
    }else if (sit>=4){return "está de Exame"; 
    }else{return "está Reprovado";}
    }
    
}//fim
