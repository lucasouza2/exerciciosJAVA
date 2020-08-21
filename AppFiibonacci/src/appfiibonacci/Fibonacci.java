package appfiibonacci;

public class Fibonacci {
    //atributos

//metodo
    public int calcFi(int n) {
        if (n < 2) {
            return n;
        } else {
            return calcFi(n - 1) + calcFi(n - 2);
        }
        
        

    }
}
