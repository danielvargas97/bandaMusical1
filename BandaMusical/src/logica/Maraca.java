
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Maraca extends Instrumento{

    public Maraca() {
        this.nombre = "Maraca";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/maracas.PNG")).getImage();
    }
    
}
