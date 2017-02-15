
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Invitado
 */
public class Pandereta extends Instrumento{
    
    public Pandereta() {
        super();
        this.nombre = "Pandereta";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/pandereta.PNG")).getImage();
    }
    
}
