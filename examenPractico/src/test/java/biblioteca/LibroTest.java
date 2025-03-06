package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
    }

    @Test
    void getTitulo() {
        assertEquals("Cien años de soledad", libro.getTitulo());
    }

    @Test
    void setTitulo() {
        libro.setTitulo("El amor en los tiempos del cólera");
        assertEquals("El amor en los tiempos del cólera", libro.getTitulo());
    }

    @Test
    void getAutor() {
        assertEquals("Gabriel García Márquez", libro.getAutor());
    }

    @Test
    void setAutor() {
        libro.setAutor("Laura Restrepo");
        assertEquals("Laura Restrepo", libro.getAutor());
    }

    @Test
    void getAnioPublicacion() {
        assertEquals(1967, libro.getAnioPublicacion());
    }

    @Test
    void setAnioPublicacion() {
        libro.setAnioPublicacion(2004);
        assertEquals(2004, libro.getAnioPublicacion());
    }
}
