## Flujo del MVC 

# 1
El usuario abre el navegador en http://localhost:8080
El navegador envía una petición GET / al servidor.

# 2
DispatcherServlet recibe la petición
Spring tiene un componente central llamado DispatcherServlet que recibe
todas las peticiones HTTP y decide a qué controlador enviarlas.
El desarrollador no lo programa.

# 3
El DispatcherServlet llama al Controller
Spring detecta que la petición es GET / y la dirige al método inicio()
porque tiene la anotación @GetMapping("/").

# 4
El Controller construye el Model
Dentro del método inicio(), el controlador crea los datos y los empaca
en el objeto Model. Aquí ocurre el envío de información hacia la vista.

# 5 
El Controller indica qué vista mostrar
El método devuelve el String "index", lo que le dice a Spring
que busque y renderice la plantilla templates/index.html.

# 6
Thymeleaf procesa la vista
Thymeleaf toma el archivo index.html y reemplaza todas las expresiones
th: con los datos reales que vienen del Model.

# 7
El servidor responde con HTML puro
El HTML procesado se envía de vuelta al navegador.


# Evidencias 
![Captura de la consola mostrando el servidor iniciado](assets/Evidencia1.png)
![Captura de la lista de frutas en el navegador](assets/Evidencia2.png)


