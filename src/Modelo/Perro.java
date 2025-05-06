/**
 * Clase Perro que hereda de Animal
 *
 * @author Andres de Gregorio
 * @version 1.0
 */
package Modelo;

public class Perro  extends Animal{

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Guau");
    }
}
