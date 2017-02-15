
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Guitarra extends Instrumento {

    public Guitarra() {
        super();
        this.nombre = "Guitarra";
        this.imgInstrumento= new ImageIcon(getClass().getResource("/imagenes/guitarra.PNG")).getImage();
    }
    
}
