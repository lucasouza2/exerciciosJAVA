package javaapplication1;

public class Principal {

    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.push(3);
        p.push(5);
        p.push(7);
        while(!p.isEmpty()) {
            System.out.println(p.pop());
        }
    }
}
