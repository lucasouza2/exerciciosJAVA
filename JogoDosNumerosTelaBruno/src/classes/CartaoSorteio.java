
package classes;

import java.util.Random;

/**
 *
 * @author alindacir
 */
public class CartaoSorteio extends Cartao{
      
   public CartaoSorteio(tam()){
       super(tam());
       sorteiaNumeros();
   }
   

    
    private void sorteiaNumeros() {
        Random valorRand = new Random();
        int i = 1;
        while (i <= tam()) {
               if (addNumero(valorRand.nextInt(50) + 1) == 1) {
                i++;
            }
        }
    }
}
