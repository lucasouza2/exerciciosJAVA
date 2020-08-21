package alinda.tratamentoExcecao;

public class TratandoVariasExcecoes {

    public static void main(String args[]) {

        int a = 100;

        int b[] = {0, 2, 4, 6, 8};

        try {
            System.out.println(a / b[0]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(b[6]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Índice " + e1.getMessage() + " fora do intervalo");
        } catch (Exception e2) {
            System.out.println("Erro: " + e2.getMessage());
        } finally {
            System.out.println("Sempre executa esse bloco");
        }
    }
}
