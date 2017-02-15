
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Invitado
 */
public class Arpa extends Instrumento{
    
    public Arpa() {
        super();
        this.nombre = "Arpa";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/arpa.PNG")).getImage();
        
    }

}
