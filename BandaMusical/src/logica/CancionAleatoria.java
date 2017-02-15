/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author VARGAS
 */

import java.util.Random;
public class CancionAleatoria extends Cancion {
    public static String repertorio[] = {"La cucaracha","La gota fría","El corrido de Falcao","Cali Pachanguero","¿Que le pasa a Lupita?"};
    
    public CancionAleatoria(){
        this.nombre = selectorCancion();
    }
    
    private String selectorCancion(){
        int indice = 0;
        Random generador = new Random(System.currentTimeMillis()*System.currentTimeMillis());
        indice = generador.nextInt(repertorio.length);
        return repertorio[indice];
    }
}
