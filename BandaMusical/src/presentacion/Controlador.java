
package presentacion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Controlador implements MouseListener{
    private final Vista ventana;
    
    public Controlador(Vista aThis) {
        ventana = aThis;        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ventana.getModelo().dibujar();///PROVISIONAL !!! ///////PROVISIONAL !!! ////
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
