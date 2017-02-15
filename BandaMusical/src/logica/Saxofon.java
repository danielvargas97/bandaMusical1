
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Saxofon extends Instrumento{
 
    public Saxofon() {
        super();
        this.nombre = "Saxofon";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/saxofon.PNG")).getImage();
    }
}
