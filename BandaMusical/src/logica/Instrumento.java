/**
 * @author Daniel  Vargas - Brayan Aldana
 * Clase Instrumento: contiene la informacion de un instrumento
 */
package logica;

import java.awt.Image;///BORRAR


public abstract class Instrumento {
    protected String nombre;
    protected String nota;
    protected boolean estaAfinado;
    protected Image imgInstrumento;//BORRAR

    
    public Instrumento(){
        this.estaAfinado = false;
        this.nota = "";
    }

    public Image getImgInstrumento() {
        return imgInstrumento;
    }

    public void setImgInstrumento(Image imgInstrumento) {
        this.imgInstrumento = imgInstrumento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isEstaAfinado() {
        return estaAfinado;
    }

    public void setEstaAfinado(boolean estaAfinado) {
        this.estaAfinado = estaAfinado;
    }
    



}

