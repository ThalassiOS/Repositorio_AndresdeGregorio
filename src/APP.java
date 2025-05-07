import Modelo.Gato;
import Modelo.Perro;
/**
 * Clase Main para ejecutar el programa.
 *  Crea instancias de Perro y Gato, imprime sus detalles y sonidos.
 *
 * @author Andres de Gregorio
 * @version 1.0
 */
public class APP {

    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Michi");

        System.out.println(perro.getNombre() + " dice: " + perro.sonido());
        System.out.println(gato.getNombre() + " dice: " + gato.sonido());
    }
}
