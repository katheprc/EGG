/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. */

package Ejercicio4;

import Ejercicio4.Entity.Pelicula;
import Ejercicio4.Service.ServicePelicula;
import java.util.*;

public class Ejercicio4_main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Pelicula> lista = new ArrayList<>();
        ServicePelicula srvPelicula = new ServicePelicula();
        String opc;
        
        do {
            lista.add(srvPelicula.crearPelicula());
            do {
                System.out.println("¿Continuar ingresando? (S/N)");
                opc = leer.nextLine().toUpperCase();
                if (opc.equals("N") || opc.equals("S")) {
                    break;
                }
            } while (true);
            
        } while (opc.equals("S"));
        
        srvPelicula.mostrarPeliculas(lista);
        srvPelicula.mostrarPeliculasMayoresHora(lista);
        srvPelicula.ordenarPeliculasDescendente(lista);
        srvPelicula.ordenarPeliculasAscendente(lista);
        srvPelicula.ordenarPorTitulo(lista);
        srvPelicula.ordenarPorDirector(lista);
        
        leer.close();
        
    }
    
}
