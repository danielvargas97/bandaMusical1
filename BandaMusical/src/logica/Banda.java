package logica;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase Banda: Contiene la banda y sus operaciones
 * @author Invitado
 */
public class Banda {

    private ArrayList<Musico> miBanda;
    private int integrantes;
    private boolean bandaEquipada;
    private boolean bandaAfinada;
    
    /**
     * 
     */
    public Banda() {
        this.bandaAfinada = false;
        this.bandaEquipada = false;
        this.integrantes = generarNumIntegrantes();
        formarBanda(this.integrantes);
    }

    /**
     * Genera el numero aleatorio de integrantes
     * @return numero integrantes de la banda
     */
    public int generarNumIntegrantes() {
        int numIntegrantes = 0;
        Random generador = new Random(System.currentTimeMillis()*System.currentTimeMillis());
        numIntegrantes = 3 + generador.nextInt(8);
        return numIntegrantes;
    }
    
    
    /**
     * Crea los musicos de la banda
     * @param integrantes numero de integrantes de la banda
     * @return 
     */
    private boolean formarBanda(int integrantes) {
        miBanda = new ArrayList<>();

        for (int i = 0; i< integrantes;i++) {
            Musico unMusico = new Musico();
            miBanda.add(unMusico);
        }

        return true;

    }
    
    /**
     * Equipa a los musicos de la banda con un instrumento aleatorio
     * @return true: los musicos tienen su instrumento
     */
    public boolean equiparBanda() {
        if(bandaEquipada){
            return true;
        }
        else{
            for (Musico unMusico : miBanda) {
                unMusico.asignarInstrumento();

            }
            this.bandaEquipada = true;
            return true;
        }
    }
    
    /**
     * Devuelve los instrumentos que tiene la banda
     * @return Instrumentos de la banda
     */
    public ArrayList<Instrumento> getInstrumentosBanda(){
        ArrayList<Instrumento> instrumBanda = new ArrayList<>();
        
        for(Musico musico:miBanda){
            instrumBanda.add(musico.getInstrumentoMusico());
        }
        
        return instrumBanda;
    }

    /**
     * Afina los instrumentos de la banda
     * @return true si se han afinado los instrumentos. false si no tienen instrumentos.
     */
    public boolean afinar(){
        if(!bandaEquipada){
            return false;
        }
        else{
            for(Musico unMusico: miBanda){
                unMusico.afinarInstrumento();
            }
        
            this.bandaAfinada  = true;
            return true;
        }
    }
    
    /**
     * La banda toca una nota de prueba
     * @param n la nota de prueba
     * @return el nombre de la nota tocada
     */
    public String tocarNotaPrueba(Nota n){
        
        if(!bandaEquipada){
            return "La banda aún no tiene instrumentos";
        }
        else if(!bandaAfinada){
            return "La banda no ha afinado";
        }
        else{
            for(Musico unMusico:miBanda){
                unMusico.tocarNota(n);
            }
            return ("la banda toca la nota "+ n.getNota());
        }
        
    }
    /**
     * Permite que la banda toque una cancion
     * @param c Una cancion
     * @return nombre de la cancion que la banda toca
     */
    public String tocarCancion(Cancion c){
        return ("La banda está tocando " + c.getNombre());
    }
    
    
    public ArrayList<Musico> getMiBanda() {
        return miBanda;
    }

    public void setMiBanda(ArrayList<Musico> miBanda) {
        this.miBanda = miBanda;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
}
