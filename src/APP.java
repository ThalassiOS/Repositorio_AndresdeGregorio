/**
 * Clase APP usada para ejecutar desde un main
 *
 * @author Andres de Gregorio
 * @version 1.0
 */

import Modelo.Gato;
import Modelo.Perro;

public class APP {

    public static void main(String[] args) {

        Perro perro = new Perro("Fluffy");
        System.out.println(perro);
        perro.sonido();
        Gato gato = new Gato("Michi");
        System.out.println(gato);
        gato.sonido();
    }
}
