package javaapplication1;

public class Pilha {

    private int vetor[];
    private int n, topo;

    public Pilha(int n) {
        this.n = n;
        vetor = new int[n];
        this.topo = -1;
    }

    public boolean isEmpty() {
        if (topo == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topo == n - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int v) {
        topo++;
        vetor[topo] = v;
    }

    public int pop() {
        int temp = vetor[topo];
        topo--;
        return temp;
    }

}
