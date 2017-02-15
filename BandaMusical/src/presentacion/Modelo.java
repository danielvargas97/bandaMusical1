/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import logica.Banda;
import logica.Cancion;
import logica.CancionAleatoria;
import logica.Instrumento;
import logica.Nota;

/**
 *
 * @author Invitado
 */
public class Modelo {
    
    private Vista ventanaInicial;
    private Banda miBanda;
    private Canvas lienzo;
    private BufferedImage dobleBuffer;

    public Modelo() {
        lienzo = getVentanaInicial().getLienzo();
        dobleBuffer = new BufferedImage(lienzo.getWidth(), lienzo.getHeight(), BufferedImage.TYPE_INT_ARGB);
    }
    
    public void iniciar() {//METODO QUE INICIA LA BANDA
        
        System.out.println("Integrantes: "+getBanda().getIntegrantes());
        getBanda().equiparBanda();
        System.out.println("Instrumentos:");
        for(Instrumento i: getBanda().getInstrumentosBanda()){
            System.out.println(" "+i.getNombre());
        }
        
        getBanda().afinar();
        System.out.println("La banda ha afinado: "+getBanda().afinar());
        System.out.println(getBanda().tocarNotaPrueba(new Nota()));
        System.out.println(getBanda().tocarCancion(new CancionAleatoria()));
        getVentanaInicial().setVisible(true);
    }
    
    public Banda getBanda(){
        if(miBanda == null){
            miBanda = new Banda();
        }
        return miBanda;
    }
    
    public Vista getVentanaInicial() {
        if(ventanaInicial == null){
            ventanaInicial = new Vista(this);
        }
        return ventanaInicial;
    }
    
    public void dibujar(){// TOMA LAS IMAGENES PARA EL LIENZO EN LA VISTA
        Graphics lapizPrincipal = lienzo.getGraphics();
        Graphics lapiz = dobleBuffer.getGraphics();
        dibujarInstrumentos(lapiz);
        lapizPrincipal.drawImage(dobleBuffer, 0, 0, lienzo);
    }
    
    public void dibujarInstrumentos(Graphics lapiz){//METODO QUE DIBUJA INSTRUMENTOS DE LA BANDA
        int x=0,y =0;
        for(Instrumento i: miBanda.getInstrumentosBanda()){
            lapiz.drawImage(i.getImgInstrumento(), 2+x, 2+y, lienzo);
            x=x+72;
        }
    }
    
}
