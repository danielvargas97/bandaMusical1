
package logica;

/**
 *
 * @author Invitado
 */

public class Musico {
    private Instrumento instrumentoMusico;
    private boolean tengoInstrumento;
    
    public Musico(){
        this.tengoInstrumento = false;
    }
    
    
    /**
     * LLama a la CajaInstrumentos para que
     * se le asigne un instrumento aleatorio
     */
    public void asignarInstrumento(){
        CajaInstrumentos caja = new CajaInstrumentos();
        this.instrumentoMusico = caja.darInstrumento();
        this.tengoInstrumento = true;
    }
    
    
    /**
     * Toca una nota de prueba
     * @param n es la nota que se elige para tocar
     * @return nombre de la nota si posee un instrumento afinado
     */
    public String tocarNota(Nota n){
        StringBuilder sonidoNota = new StringBuilder();
        sonidoNota.append("La nota ");
        sonidoNota.append(n.getNota());
        sonidoNota.append(" es así en el");
        sonidoNota.append(instrumentoMusico.getNombre());
        
        
        if(!tengoInstrumento){
            return "No tengo instrumento";
        }
        
        if(instrumentoMusico.isEstaAfinado()){
            
            instrumentoMusico.setNota(n.getNota());
            
            sonidoNota.append(instrumentoMusico.getNota());
            return sonidoNota.toString();
        }
        
        else{
            // Devuelve una nota inentendible, 
            // puesto que el instrumento no esta afinado
            sonidoNota.append("#!#!#!");
            return sonidoNota.toString();
        }
        
        
        
    }
    /**
     * Afina el instrumento del musico
     * @return nombre del instrumento del musico afinado
     */
    public String afinarInstrumento(){
        String respuesta;
        if(!tengoInstrumento){
            respuesta = "No tengo instrumento!";
            return respuesta;
        }
        
        else{
            respuesta = instrumentoMusico.getNombre()+" está listo";
            return respuesta;
        }      
    }
    
    
    /**
     * El musico interpreta una canción
     * @param c la cancion que va a interpretar
     * @return Nombre de la cancion que esta interpretando
     */
    public String tocarCancion(Cancion c){
        return ("El musico stá tocando " + c.getNombre());
    }
    
    /**
     * Devuelve el nombre del instrumento del musico
     * @return nombre del instrumento
     */
    public String miInstrumento(){
        return this.instrumentoMusico.getNombre();
    }

    public Instrumento getInstrumentoMusico() {
        return instrumentoMusico;
    }

    public void setInstrumentoMusico(Instrumento instrumentoMusico) {
        this.instrumentoMusico = instrumentoMusico;
    }

    public boolean isTengoInstrumento() {
        return tengoInstrumento;
    }

    public void setTengoInstrumento(boolean tengoInstrumento) {
        this.tengoInstrumento = tengoInstrumento;
    }
    
    
}
