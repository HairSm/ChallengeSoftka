/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import main.main;
import java.awt.Color;
import java.awt.Dimension;
import preguntas.baseDeDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import jugador.jugador;

/**
 *
 * @author Hair
 */
public class vistaGUI extends JFrame implements ActionListener {
    private JButton responde;
    private JButton retiro;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField participante;
    private JTextField puntajeTotal;
    private JTextField Iron;
    private JTextField capitanA;
    private JTextField thor;
    private JTextField blackp;
    private JTextField antMan;
    private JTextArea preguntas;
    private ButtonGroup bg;
    private JRadioButton R1;
    private JRadioButton R2;
    private JRadioButton R3;
    private JRadioButton R4;
    private JRadioButton R5;
    private final baseDeDatos baseDatos;
    String formulapregunta = "";
    String respuesta1 = "";
    String respuesta2 = "";
    String respuesta3 = "";
    String respuesta4 = "";
    String respuestaC = "";
       
    int puntaje = 0;
    int nivel = 0;
    int intentos = 10;
    int Pregunta = 0;
    int k = 0;
    int Variable[] = new int[intentos];

    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        vistaGUI vistaGUI =new vistaGUI();
        vistaGUI.setVisible(true); 
        }
    /**
     * 
     */
    public vistaGUI(){
        baseDatos = new baseDeDatos();
       
     /**
      * iniciamos la interfas grafica
      */ 
        initGUI();     
    }
    private void initGUI(){  
        presentacion vista=new presentacion();
        //this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONCURSO DE PREGUNTAS Y RESPUESTAS");
        setSize(500,650); 
        setBackground(Color.blue);
        getContentPane().setLayout(null);
        colocaPregunta1();
        {
            panel1=new JPanel();
            panel1.setBorder(new TitledBorder("DATOS DEL PARTICIPANTE"));
            panel1.setBounds(50,20,370,110);       
        
            label1=new JLabel("hola :");
            label1.setPreferredSize(new Dimension(40,25)); 
            panel1.add(label1);
            participante = new JTextField();
            participante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            participante.setPreferredSize(new Dimension(200,30));
            participante.setFont(new java.awt.Font("Tahoma", 3, 18)); 
            participante.setEditable(false);
            panel1.add(participante);
            participante.setText(vista.nombre);
            
            label2 = new JLabel("TU PUNTAJE ACTUAL ES :");
            label2.setPreferredSize(new Dimension(150,25));
            panel1.add(label2);
            puntajeTotal = new JTextField();
            puntajeTotal.setPreferredSize(new Dimension(110,40));
            puntajeTotal.setEditable(false);
            panel1.add(puntajeTotal);
            
            Iron= new JTextField("IRON MAN");
            Iron.setBounds(30, 140, 70, 40);
            Iron.setBackground(new java.awt.Color(51, 102, 255));
            Iron.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            Iron.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            Iron.setEditable(false);
            add(Iron);
                        
            thor= new JTextField("THOR");
            thor.setBounds(110, 140, 70, 40);
            thor.setBackground(new java.awt.Color(51, 102, 255));
            thor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            thor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            thor.setEditable(false);
            add(thor);
            
            capitanA= new JTextField("CAP. AMERICA");
            capitanA.setBounds(190, 140, 100, 40);
            capitanA.setBackground(new java.awt.Color(51, 102, 255));
            capitanA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            capitanA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            capitanA.setEditable(false);
            add(capitanA);

            
            blackp= new JTextField("BLACK PANTER");
            blackp.setBounds(300, 140, 90, 40);
            blackp.setBackground(new java.awt.Color(51, 102, 255));
            blackp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            blackp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            blackp.setEditable(false);
            add(blackp);
            
            antMan= new JTextField("ANT MAN");
            antMan.setBounds(400, 140, 70, 40);
            antMan.setBackground(new java.awt.Color(51, 102, 255));
            antMan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            antMan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            antMan.setEditable(false);
            add(antMan);
                     
            panel2=new JPanel();
            panel2.setBorder(new TitledBorder(""));
            panel2.setBounds(80,350,320,150);
            
            preguntas = new JTextArea(" "+formulapregunta);
            preguntas.setBounds(40,200,400,100);
            preguntas.setEditable(false);
            preguntas.setLineWrap(true);
            preguntas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N           
            add(preguntas);
           
            R1 = new JRadioButton(respuesta1);
            R2 = new JRadioButton(respuesta2);
            R3 = new JRadioButton(respuesta3);
            R4 = new JRadioButton(respuesta4);
            R5 = new JRadioButton();
            R1.setPreferredSize(new Dimension(200,30));
            R2.setPreferredSize(new Dimension(200,30));
            R3.setPreferredSize(new Dimension(200,30));
            R4.setPreferredSize(new Dimension(200,30));
            bg = new ButtonGroup();
            R5.setSelected(true);
            bg.add(R1);
            bg.add(R2);
            bg.add(R3);
            bg.add(R4);
            bg.add(R5);
            panel2.add(R1);
            panel2.add(R2);
            panel2.add(R3);
            panel2.add(R4);

            /**
             * segun seleccion asigna una respuesta
             */
            
            puntajeTotal.setText("" + puntaje);
            R1.setActionCommand("Respuesta1");
            R2.setActionCommand("Respuesta2");
            R3.setActionCommand("Respuesta3");
            R4.setActionCommand("Respuesta4");
            R5.setActionCommand("NoRespuesta");

            responde = new JButton("RESPONDER");
            responde.setBounds(60, 550, 150, 40);
            responde.setActionCommand("respuesta");
            responde.setBackground(new java.awt.Color(51, 204, 0));
            responde.addActionListener(this);
            add(responde);
            
            retiro= new JButton("RETIRO");
            retiro.setBackground(new java.awt.Color(255, 0, 0));
            retiro.setBounds(270, 550, 150, 40);
            retiro.setActionCommand("retirar");
            retiro.addActionListener(this);
            add(retiro);
                     
        }

       
        add(panel1);
        add(panel2);

    }
    /**
     * inicializa la primera pregunta con tema iron man de forma aleatorea
     */
    private void colocaPregunta1(){
        int prueba = numAleatorio();
        String formato = "";
        for (Map.Entry pareja : baseDatos.getListaPreguntasIron().entrySet()) {
            int dato = (Integer) pareja.getKey();
            if (prueba == dato) {
                formato = (String) pareja.getValue();
                organizaRespuestas(formato);
            }
        }
    }
    /**
     * retorna un numero aleatorio de 0 a 4
     * @return 
     */
    public int numAleatorio(){
         /**
         * creamos unva rariable ramdom para escoger la pregunta en cada nivel 
         */
         int i=0, cantidad=5, rango=5; 
         int arreglo[]=new int [cantidad];
        
         arreglo[i]=(int)(Math.random()*rango);
         for (i=1; i<cantidad; i++){
             arreglo[i]=(int)(Math.random()*rango);
             for (int j=0; j<i; j++){
                 if (arreglo[i]==arreglo[j]){
                     i--;
                 }
             }
         }
        for (int k=0; k<cantidad; k++){
                       
            Variable[k]=arreglo[k];
           System.out.print((k)+".-"+Variable[k]+"\n");         
               
        }
        int compara=Variable[k];
        
        return compara;
    }
    /**
     * organiza las respuestas de forma aleatoria
     * @param formato 
     */
    private void organizaRespuestas(String formato) {

        String[] posicion = formato.split("_");
        formulapregunta = posicion[4];
        respuestaC = "" + posicion[0];

        int i = 0, cantidad = 4, rango = 4;
        int arreglo[] = new int[cantidad];

        arreglo[i] = (int) (Math.random() * rango);
        for (i = 1; i < cantidad; i++) {
            arreglo[i] = (int) (Math.random() * rango);
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }
        for (int p = 0; p < cantidad; p++) {

            Variable[p] = arreglo[p];
            System.out.print((p) + ".-" + Variable[p] + "\n");
            if (p == 0) {
                respuesta1 = "" + posicion[Variable[p]];
            } else if (p == 1) {
                respuesta2 = "" + posicion[Variable[p]];
            } else if (p == 2) {
                respuesta3 = "" + posicion[Variable[p]];
            } else if (p == 3) {
                respuesta4 = "" + posicion[Variable[p]];
            }

        }

    }
    /**
     * 
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        String concurso = evento.getActionCommand();
        /**
         * evalua que exista un nombre de lo contrario cierral el cuestionario y abre la imagen de inicio
         */

        if (participante.getText().isEmpty()) {
            presentacion vista = new presentacion();
            vista.setVisible(true);
            this.setVisible(false);
        } else {

            if (concurso.equals("respuesta")) {
                if (R5.isSelected()) {
                    JOptionPane.showMessageDialog(null, "no ha seleccionado ninguna respuesta");
                } else {
                    switch (bg.getSelection().getActionCommand()) {
                        case "Respuesta1":
                            if (R1.getText().equals(respuestaC)) {
                                correcto();
                            } else {
                                falla();
                            }
                            break;
                        case "Respuesta2":
                            if (R2.getText().equals(respuestaC)) {
                                correcto();
                            } else {
                                falla();
                            }
                            break;

                        case "Respuesta3":
                            if (R3.getText().equals(respuestaC)) {
                                correcto();
                            } else {
                                falla();
                            }
                            break;
                        case "Respuesta4":
                            if (R4.getText().equals(respuestaC)) {
                                correcto();
                            } else {
                                falla();
                            }
                            break;
                        default:
                            break;
                    }
                    R5.setSelected(true);
                }
            } else if (concurso.equals("retirar")) {
                if (puntaje < 100) {
                    JOptionPane.showMessageDialog(null, "ATENCION como no respondio ninguna pregunta no se guardaran sus datos");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "felicidades aunque no ganaste tu registro sera almacenado");
                    salvaJugador();
                    System.exit(0);
                }
            }
        }
    }

    /**
     * Determina el cambio de nivel o tema
     *
     * @param nivel
     */
    public void subeNivel(int nivel) {
        if (nivel == 1) {
            Iron.setBackground(new java.awt.Color(204, 255, 51));
            colocaPregunta2();
            preguntas.setText(" "+formulapregunta);
            R1.setText(respuesta1);
            R2.setText(respuesta2);
            R3.setText(respuesta3);
            R4.setText(respuesta4);
            
        } else if (nivel == 2) {
            thor.setBackground(new java.awt.Color(204, 255, 51));
            colocaPregunta3();
            preguntas.setText(" "+formulapregunta);
            R1.setText(respuesta1);
            R2.setText(respuesta2);
            R3.setText(respuesta3);
            R4.setText(respuesta4);
            
        } else if (nivel == 3) {
            capitanA.setBackground(new java.awt.Color(204, 255, 51));
             colocaPregunta4();
            preguntas.setText(" "+formulapregunta);
            R1.setText(respuesta1);
            R2.setText(respuesta2);
            R3.setText(respuesta3);
            R4.setText(respuesta4);
        } else if (nivel == 4) {
            blackp.setBackground(new java.awt.Color(204, 255, 51));
             colocaPregunta5();
            preguntas.setText(" "+formulapregunta);
            R1.setText(respuesta1);
            R2.setText(respuesta2);
            R3.setText(respuesta3);
            R4.setText(respuesta4);
        } else if (nivel == 5) {
            antMan.setBackground(new java.awt.Color(204, 255, 51));
            JOptionPane.showMessageDialog(null, "Felicidades Ganador tu registro sera almacenado");
            salvaJugador();
        }
    }
    /**
     * pregunta para nivel 2
     */
    private void colocaPregunta2(){
        int prueba = numAleatorio();
        String formato = "";
        for (Map.Entry pareja : baseDatos.getListaPreguntasThor().entrySet()) {
            int dato = (Integer) pareja.getKey();
            if (prueba == dato) {
                formato = (String) pareja.getValue();
                organizaRespuestas(formato);
            }
        }
    }
    /**
     * pregunta para nivel 3
     */
    private void colocaPregunta3(){
        int prueba = numAleatorio();
        String formato = "";
        for (Map.Entry pareja : baseDatos.getListaPreguntasCapitan().entrySet()) {
            int dato = (Integer) pareja.getKey();
            if (prueba == dato) {
                formato = (String) pareja.getValue();
                organizaRespuestas(formato);
            }
        }
    }
    /**
     * pregunta para nivel 4
     */
    private void colocaPregunta4(){
        int prueba = numAleatorio();
        String formato = "";
        for (Map.Entry pareja : baseDatos.getListaPreguntasBlackP().entrySet()) {
            int dato = (Integer) pareja.getKey();
            if (prueba == dato) {
                formato = (String) pareja.getValue();
                organizaRespuestas(formato);
            }
        }
    }
        /**
     * pregunta para nivel 5
     */
    private void colocaPregunta5(){
        int prueba = numAleatorio();
        String formato = "";
        for (Map.Entry pareja : baseDatos.getListaPreguntasAntMan().entrySet()) {
            int dato = (Integer) pareja.getKey();
            if (prueba == dato) {
                formato = (String) pareja.getValue();
                organizaRespuestas(formato);
            }
        }
    }
    /**
     * metodo para salvar los datos del jugador
     * @return 
     */
    private String salvaJugador(){
        jugador jugadorGanador =new jugador();
        String jugador1=participante.getText();
        int puntos=Integer.parseInt(puntajeTotal.getText());
        jugadorGanador.setNombre(jugador1);
        jugadorGanador.setPuntaje(puntos);
        try {
            main.recibeJugador(jugadorGanador.Felicitaciones());
        } catch (IOException ex) {
            Logger.getLogger(vistaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       return jugadorGanador.Felicitaciones();
    }
    
    /**
     * en caso de acertar con la respuesta
     */
    private void correcto() {
        nivel++;
        puntaje = puntaje + (100*nivel);
        puntajeTotal.setText("" + puntaje);
        subeNivel(nivel);
    }

    /**
     * en caso de fallar
     */
    private void falla() {
        puntaje = 0;
        puntajeTotal.setText("" + puntaje);
        JOptionPane.showMessageDialog(null, "lo sentimos has fallado tu puntaje es de 0 y no sera guardado ");
        System.exit(0);
    }
}
