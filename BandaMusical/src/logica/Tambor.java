
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Invitado
 */
public class Tambor extends Instrumento  {

    public Tambor() {
        super();
        this.nombre = "Tambor";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/tambor.PNG")).getImage();
    }
    
}
