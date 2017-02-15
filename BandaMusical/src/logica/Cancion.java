package logica;

/**
 *
 * @author VARGAS
 */
public abstract class Cancion {
    
    protected String nombre;
    
    public Cancion(){}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
