Buenos días

Este juego fue desarrollado con Netbeans 8.2 en java consta de 4 paquetes que contienen:
Contenido del proyecto
•	el main o clase principal.
•	paquete de preguntas donde se almacena la base de datos en un Hash-Map de respuestas y preguntas.
•	también existe el paquete jugador que contiene al objeto jugador  
•	el paquete presentación que contiene 2 formularios de interfaz gráfica.
•	una carpeta para guardar imágenes que se utilizaran en la interfaz gráfica.

Funcionamiento
Se ejecuta el programa desde la clase principal o main el cual inicializa la interfaz gráfica llamada presentación. La cual solicita que se ingrese un nombre sin este parámetro el programa no inicia, ya que se requiere para su almacenamiento en el futuro. Para lo cual se genera un cuadro de dialogo que le informa de carácter obligatorio el ingreso de un nombre.
Al ingresar el nombre se despliega otro formulario que contiene el nombre ingresado. El puntaje que al inicio es de 0 y los diferentes niveles que están separados por temas en este caso los temas son películas de Marvel Studio a medida que se avanza de nivel las preguntas son más complejas para, pero serán referentes al personaje correspondiente.

Más abajo aparece el cuadro de texto donde se formula la pregunta estas preguntas, al igual que las respuestas son seleccionadas de forma aleatoria y siempre cambian de orden al iniciar el programa. Eso quiere decir que para cada personaje hay un repertorio de 5 preguntas con sus respectivas e respuestas, pero solo se visualizara una de ellas que será escogida por el programa de forma aleatoria como se indicó anteriormente.


Si se indica responder, pero no se ha seleccionado una respuesta saldrá un cuadro de dialogo indicando que seleccione una respuesta. Si la respuesta seleccionada es incorrecta se generará un cuadro de dialogo indicando que erro en su respuesta y el puntaje será de 0 puntos y que no se guardaran los datos hasta el momento es decir nombre o puntaje.

Si se responde de manera correcta se generará un puntaje de acuerdo al nivel alcanzado ejemplo:
nivel 1 serán 100 puntos
nivel 2 serán 200 puntos
nivel 3 serán 300 puntos
nivel 4 serán 400 puntos
nivel 5 serán 500 puntos

estos puntajes son acumulativos es decir para el nivel 2 si se responde correctamente tendrá 100 puntos del nivel 1 + 200 puntos del nivel 2 lo que darán 300 puntos totales. Si llega al nivel 5 sin ningún error tendrá un puntaje total de 1500 puntos. Además, una vez sube de nivel el indicador cambiara de azul a verde indicando el progreso.
Una vez obtenga los 1500 puntos que es el máximo, se genera un cuadro de dialogo felicitando al jugador y sus datos serán guardados en un documento externo. Y al dar aceptar se cerrará el programa. 

Si el jugador se encuentra el nivel 2 y decide retirarse de manera voluntaria independientemente que haya seleccionado o no una respuesta se generara un cuadro de dialogo felicitándolo y guardara su nombre y progreso hasta el momento en el archivo externo y se cerrara el programa.

La interfaz grafica es la encargada de traer las preguntas y las respuestas de la base de datos correspondiente y de procesar si se responde correctamente o no. Si el programa decide que el jugador se retira voluntariamente o gana los datos de nombre y puntaje son enviados al objeto jugador que crea una frase y esta frase se envía a la clase principal la cual se encarga de recibir esta línea de caracteres y guardarlos en el archivo externo. Para ser consultado posteriormente en la carpeta llamada doc. Y el archivo de nombre fichero.txt
Esta carpeta se encuentra ubicada en el mismo proyecto.


Gracias por su atención.

Cordialmente
Hair Alonso Valbuena 

