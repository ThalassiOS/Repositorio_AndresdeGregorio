package Modelo;
/**
 * Clase abstracta Animal que representa un animal genérico.
 * Contiene un atributo nombre y un metodo abstracto sonido().
 *
 * @author Andres de Gregorio
 * @version 1.0
 */
public abstract class Animal {

    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String sonido();
}
