
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Invitado
 */
public class Trompeta extends Instrumento{

    public Trompeta() {
        super();
        this.nombre = "Trompeta";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/trompeta.PNG")).getImage();
        
    }
    
    
}
