
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Invitado
 */
public class Violin extends Instrumento {

    public Violin() {
        super();
        this.nombre = "Violin";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/violin.PNG")).getImage();  
    }

}
