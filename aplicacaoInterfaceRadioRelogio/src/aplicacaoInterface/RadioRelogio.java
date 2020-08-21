

package aplicacaoInterface;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alindacir
 */
public class RadioRelogio implements Radio, Relogio{
    private float frequencia;
    private String horaMinSeg;

    
    public RadioRelogio(){
	frequencia = 0;
	horaMinSeg = "00:00:00";	
    }

    public float getFrequencia() {
        return frequencia;
    }

    @Override
    public void sintoniza(float frequencia){
	this.frequencia = frequencia;	
    }

    @Override
    public void mostraHora(){
	javax.swing.JOptionPane.showMessageDialog(
                     null,"As "+horaMinSeg+
                     "\nSintonizado na frequência "+getFrequencia(),
                     "Hora Certa",
                     javax.swing.JOptionPane.PLAIN_MESSAGE);
    }
	
    @Override
    public void ajustaHora() {
        GregorianCalendar c = new GregorianCalendar();
        horaMinSeg = c.get(Calendar.HOUR_OF_DAY) + ":"
                              + c.get(Calendar.MINUTE) + ":"
                              + c.get(Calendar.SECOND);

    }

    @Override
    public String toString() {
        return "Sou Radio e Relógio";
    }


}

