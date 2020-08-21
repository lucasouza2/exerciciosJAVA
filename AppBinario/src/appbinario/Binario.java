
package appbinario;


public class Binario {
    private byte numero;

    public Binario(byte numero) {
        this.numero = numero;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }
    public void binario(int numero) {
		int d = numero;
		StringBuffer binario = new StringBuffer(); // guarda os dados
		while (d > 0) {
			int b = d % 2;
			binario.append(b);
			d = d >> 1; // é a divisão que você deseja
		}
		System.out.println(binario.reverse().toString()); // inverte a ordem e imprime
	
    
    }
            
}
