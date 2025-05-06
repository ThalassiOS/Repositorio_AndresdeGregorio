/**
 * Clase Animal que contiene el atributo nombre, metodo toString y el metodo para el sonido
 *
 * @author Andres de Gregorio
 * @version 1.0
 */

package Modelo;

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

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public abstract void sonido();
}
