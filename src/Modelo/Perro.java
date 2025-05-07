package Modelo;
/**
 * Clase Perro que hereda de la clase Animal.
 * Representa un perro y su sonido característico.
 *
 * @author Andres de Gregorio
 * @version 1.0
 */

public class Perro  extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Guau";
    }
}
