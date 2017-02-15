
package logica;

import java.util.ArrayList;
import java.util.Random;

/**
 *  Clase CajaInstrumentos: Almacena instancias de las subclases de Instrumento,
 * @author VARGAS
 */
public class CajaInstrumentos {
    private static ArrayList<Instrumento> listaInstrumentos;
    
    public CajaInstrumentos(){
        this.listaInstrumentos = new ArrayList<>();
        
        listaInstrumentos.add(new Guitarra());
        listaInstrumentos.add(new Maraca());
        listaInstrumentos.add(new Piano());
        listaInstrumentos.add(new Acordeon());
        listaInstrumentos.add(new Tambor());
        listaInstrumentos.add(new Trompeta());
        listaInstrumentos.add(new Acordeon());
        listaInstrumentos.add(new Saxofon());
        listaInstrumentos.add(new Arpa());
        listaInstrumentos.add(new Pandereta());
        listaInstrumentos.add(new Violin());
        
    }
    
    /**
     * Devuelve un instrumento de acuerdo a la posicion en el arreglo
     * @return un instrumento aleatorio del arreglo
     */
    public Instrumento darInstrumento(){
        int numeroInstrumento = 0;
        
        Random generador = new Random(System.currentTimeMillis()*System.currentTimeMillis());
        numeroInstrumento = generador.nextInt(listaInstrumentos.size());
        
        return listaInstrumentos.get(numeroInstrumento);
        
    }
    
}
