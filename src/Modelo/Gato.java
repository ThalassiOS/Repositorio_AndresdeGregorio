/**
 * Clase Gato que hereda de Animal
 *
 * @author Andres de Gregorio
 * @version 1.0
 */

package Modelo;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Miau");
    }
}
