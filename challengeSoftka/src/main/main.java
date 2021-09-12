/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.FileWriter;
import java.io.IOException; 
import javax.swing.JOptionPane;
import presentacion.presentacion;



/**
 *metodo principal que inicia la presentacion y guarda los datos del jugador en el archivo TXT
 * @author Hair
 */
public class main {
   
    public static void main(String[] args) throws IOException {     
    new presentacion().setVisible(true); 
       
      try {
          
          String SalvaJugador = args[0];
          System.out.println(SalvaJugador);

          FileWriter baseDato = new FileWriter("doc/fichero.txt", true);// sin true reescribe el archivo con true añade texto al archivo
          baseDato.write(SalvaJugador);
          baseDato.close();
          System.exit(0);
          /**
           * mensaje en caso que no encuentre al archivo TXT
           */  
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "!!ERROR¡¡ FICHERO NO ENCONTRADO");
        }     
    }   
    /**
     * metodo que trae los datos del jugador y los prepara para el envio al archivo txt
     * @param mensaje
     * @return
     * @throws IOException 
     */
   public static String recibeJugador(String mensaje) throws IOException{
       String guardaJugador=mensaje;
       String[] strArray=new String[]{guardaJugador};    
       main(strArray);
       return guardaJugador;
   }
}




