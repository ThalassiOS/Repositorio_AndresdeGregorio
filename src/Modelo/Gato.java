package Modelo;
/**
 * Clase Gato que hereda de la clase Animal.
 * Representa un perro y su sonido característico.
 *
 * @author Andres de Gregorio
 * @version 1.0
 */
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Miau";
    }
}
