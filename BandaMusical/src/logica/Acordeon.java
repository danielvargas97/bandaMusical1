
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Acordeon extends Instrumento{

    public Acordeon() {
        this.nombre = "Acordeon";
        this.imgInstrumento = new ImageIcon(getClass().getResource("/imagenes/acordeon.PNG")).getImage();
    }

    public Image getImgAcordeon() {
        return this.imgInstrumento;
    }
    
    
    
}
