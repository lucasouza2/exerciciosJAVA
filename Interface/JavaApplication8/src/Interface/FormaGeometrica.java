package Interface;

import java.text.DecimalFormat;

public interface FormaGeometrica {

    DecimalFormat MASCARA = new DecimalFormat("0.0");

    public double area();

    public double perimetro();

    public default String tipo() {
        return "Forma Geométrica:";
    }

}
