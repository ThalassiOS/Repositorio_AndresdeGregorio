package test;

import Modelo.Perro;
import Modelo.Gato;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para la clase Animal y sus subclases Perro y Gato.
 * Contiene pruebas unitarias para verificar el comportamiento de los métodos.
 *
 * @author Andres de Gregorio
 * @version 1.0
 */

public class TestAnimales {

    @Test
    public void testPerroHaceGuau() {
        Perro perro = new Perro("Rex");
        String sonido = perro.sonido();
        assertEquals("Guau", sonido, "El perro debería decir 'Guau'");
    }

    @Test
    public void testGatoHaceMiau() {
        Gato gato = new Gato("Luna");
        String sonido = gato.sonido();
        assertEquals("Miau", sonido, "El gato debería decir 'Miau'");
    }
}

