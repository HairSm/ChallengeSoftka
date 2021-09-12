/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Hair
 */
public class jugador{
      private int puntaje; 
      private String nombre; 
/**
 * constructor del jugador
 * @param puntaje
 * @param nombre 
 */
    public jugador(int puntaje, String nombre) {
        this.puntaje = puntaje;
        this.nombre = nombre;
    }
/**
 * 
 */
    public jugador() {
    }
    
/**
 * getter de puntaje
 * @return 
 */
    public int getPuntaje() {
        return puntaje;
    }
/**
 * setter del puntaje
 * @param puntaje 
 */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
/**
 * 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 /**
  * 
  * @return 
  */   
    public String Felicitaciones(){
        
        return ( "Muchas felicidades a :"+ this.nombre +"  tienes un puntaje total de :" + this.puntaje +"\n");
    }
          
}
