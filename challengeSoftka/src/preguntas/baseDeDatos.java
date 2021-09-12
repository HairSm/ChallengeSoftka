/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.HashMap;


/**
 *base de datos de las preguntas separadas por _,primero las respuestas y la primera es la correcta, 
 * se uso este orden ya que en la visualizacion se muestran de forma aleatoria tanto la pregunta,
 * como el orden de las respuestas
 * @author Hair
 */
public class baseDeDatos {
     private final  HashMap<Integer, String> listaPreguntasIron;
     private final  HashMap<Integer, String> listaPreguntasThor;
     private final  HashMap<Integer, String> listaPreguntasCapitan;
     private final  HashMap<Integer, String> listaPreguntasBlackP;
     private final  HashMap<Integer, String> listaPreguntasAntMan;
     
     /**
      * creamos los objetos que corresponden a respuestas y preguntas
      */
      public baseDeDatos(){
        listaPreguntasIron = new HashMap<>();
        listaPreguntasIron.put(0,"MARK I _ J.A.R.V.I.S. _ VIERNES _  S.I.R.I._ En Iroman como se llamaba el primer traje creado en la cueva por Tony Stark");
        listaPreguntasIron.put(1,"2008 _ 2010 _ 2005 _ 2012 _ ¿En qué año se estrenó la primera película de Iron Man, que lanzó el Marvel Cinematic Universe?");
        listaPreguntasIron.put(2,"Natalia Romanoff _ Natalie Rushman _ Nicole Rohan _ Naya Rabe _ ¿Qué nombre falso usa Natasha cuando conoce a Tony por primera vez?");
        listaPreguntasIron.put(3,"Armas _ Tecnologia _ Software _ Vehiculos autonomos _ Que comercializaba Tony Stark antes de ser Iron Man ");      
        listaPreguntasIron.put(4,"Reactor Arc _ Paladium _ Trecerapto _ Celdas solares _Como se llama la fuente de energia del traje de Iron Man");
        
        listaPreguntasThor = new HashMap<>();
        listaPreguntasThor.put(0,"beach boy _ Thor, el vengador mas fuerte _ Dios del trueno _  Thor, hijo de Odin._ En Thor ragnarok, cual es la palaba  clave de Thor del Quinjet");
        listaPreguntasThor.put(1,"El engaño y/o mentira _ El hielo  _Guerra_ No es un Dios. _ En la pelicula de Thor, LOKI es el dios de ?");
        listaPreguntasThor.put(2,"Trecerapto _ AllSpark _ La gema de la Mente _ El cubo del destino _  ¿Cuál es el nombre del misterioso cubo azul brillante que Loki usa como arma?");
        listaPreguntasThor.put(3,"Mjolnir _ Stormbreaker _ Minué. _ thunder hollow _ como se llama el mazo de thor ");      
        listaPreguntasThor.put(4,"Coger el metro en Charing Cross, tres paradas. _ Encontrar el cetro de Loki y formar un agujero de gusano.  _ Abrir un portal dimensional desde el puente Bifrost_ Luchar contra HULK en un torneo _¿Qué tiene que hacer Thor para acudir a Greenwich en la batalla final de 'El Mundo Oscuro'?");

  
        listaPreguntasCapitan = new HashMap<>();
        listaPreguntasCapitan.put(0,"¿Quién diablos es Bucky?_ ¿Te conozco? _ El se fue. _ ¿Qué dijiste? _ ¿Qué dice el Soldado de Invierno después de que Steve lo reconoce por primera vez? ");
        listaPreguntasCapitan.put(1,"Vibranio_ Adamantium _ prometeo _ Carbonadio_ ¿De qué está hecho el escudo del Capitán América?");
        listaPreguntasCapitan.put(2,"El Stork Club _ El Cotton Club _ El marruecos _ El copacabana _  ¿Dónde le dice Peggy a Steve que quiere encontrarse con él para bailar, antes de que él se hunda en el hielo?");
        listaPreguntasCapitan.put(3,"Howard Stark. _ Tony Stark. _ T'Challa _ Lo encontro Escondido _ ¿Quién creó el escudo del Capitán América?");      
        listaPreguntasCapitan.put(4,"Rober Downey Jr _ Chris Evans _ Scarlett Johansson _ Jeremy Renner _ ¿Qué actor aplazó su anunciado retiro del universo cinematográfico de Marvel tras rodar Los Vengadores: La era de Ultrón, para participar en Captain América: Civil War?");
      
        listaPreguntasBlackP = new HashMap<>();
        listaPreguntasBlackP.put(0,"T'Challa _ M'Baku _ N'Jadaka _N'Jobu_ ¿Cuál es el verdadero nombre de la Pantera Negra?");
        listaPreguntasBlackP.put(1,"Shuri _ Nakia _ Ramonda _ Okoye_  ¿Quién es la hermana de Black Panther?");
        listaPreguntasBlackP.put(2," Nigeria_ Sira _ Congo_ Sierra Leona_  En 'Black Panther', ¿en qué país africano opera Nakia como espía antes de que llegara T'Challa y la trajera de regreso a Wakanda?");
        listaPreguntasBlackP.put(3," Zemo_ Hombre mono _ Ulysses Klaue _ Pietro Maximoff _ ¿Quién fue el responsable de la muerte del rey T’Chaka?");      
        listaPreguntasBlackP.put(4," Dora Milaje_las Valquirias _ Las Amazonas _ las Morag_ ¿ Cual es el nombre de las gerreras elite de Wakanda");
        
        listaPreguntasAntMan = new HashMap<>();
        listaPreguntasAntMan.put(0,"Oveja _ Ratón _ Pato _ Orangutan _ ¿Qué animal encoge Darren Cross sin éxito en Ant-Man?");
        listaPreguntasAntMan.put(1,"Reino cuántico _ Reino sub-atomico _ Universo 7 _ Universo 376 _  ¿Cuál es el nombre del universo microscópico al que viaja Ant-Man cuando se vuelve subatómico?");
        listaPreguntasAntMan.put(2,"Chaqueta amarilla _ Biotraje cuantico _ Traje Pym _Traje Mecc    _ En Ant-Man, Darren Cross desarrolló un traje retráctil similar al que llevaba Scott Lang. ¿Como se llamaba?");
        listaPreguntasAntMan.put(3,"Un raton _ Hulk _ Tony Stark _ Un policia _ ¿Quién liberará a Ant-Man del Reino Cuántico antes o durante Avenger End Game");      
        listaPreguntasAntMan.put(4,"La hija de Hank Pym  _ La hija Scott Lang _ la villana ‘Ghost’ _ La esposa de Hank Pym_ Qien es Hope van Dyne");
        
      }
      /**
       * getter de la base de datos de IronMan
       * @return 
       */
    public HashMap<Integer, String> getListaPreguntasIron() {
        return listaPreguntasIron;
    }
    /**
     * getter de la base de datos de Thor
     * @return 
     */

    public HashMap<Integer, String> getListaPreguntasThor() {
        return listaPreguntasThor;
    }
    /**
     * getter de la base de datos de Capitan America
     * @return 
     */
    public HashMap<Integer, String> getListaPreguntasCapitan() {
        return listaPreguntasCapitan;
    }
    /**
     * getter de la base de datos de Black panter
     * @return 
     */
    public HashMap<Integer, String> getListaPreguntasBlackP() {
        return listaPreguntasBlackP;
    }
    /**
     * getter de la base de datos de AntMan
     * @return 
     */
    public HashMap<Integer, String> getListaPreguntasAntMan() {
        return listaPreguntasAntMan;
    }

    

}   


     

