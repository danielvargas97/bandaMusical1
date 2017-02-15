
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Piano extends Instrumento{

    public Piano() {
        this.nombre = "Piano";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/piano.PNG")).getImage();
    }

}
