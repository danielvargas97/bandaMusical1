package logica;

/**
 *
 * @author VARGAS
 */

import java.util.Random;

public class Nota {
    public static String notas[] = {"DO","RE","MI","FA","SOL","LA","SI"};
    private String nota;
    
    public Nota() {
        int valorNota = notaAlAzar();
        this.nota = notas[valorNota];
    }
    
    private Integer notaAlAzar(){
        Integer valorNotaAleatoria = 0;
        Random generadorAleatorio = new Random(System.currentTimeMillis());
        
        valorNotaAleatoria = generadorAleatorio.nextInt(notas.length);
        
        return valorNotaAleatoria;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
