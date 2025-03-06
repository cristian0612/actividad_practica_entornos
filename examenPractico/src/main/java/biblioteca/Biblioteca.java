package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cristian osso parra
 * @github cristian0612
 * Clase que representa una biblioteca la cual almacena libros.
 */
public class Biblioteca {
    /**
     * Lista de libros
     */
    // TODO: Documentar estos atributos
    private final List<Libro> libros;

    /**
     * Constructor sin parametros que inicializa la lista de libros
     */
    // TODO: Documentar este método
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * constructor que inicializa la biblioteca con una lista de libros
     *
     * @param libros lista de libros que se usa para añadir a la biblioteca
     */
    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Añade un libro a la biblioteca.
     *
     * @param libro libro a añadir
     * @return true si el libro se añadio correctamente, false en caso contrario
     */

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Borra un libro de la biblioteca
     *
     * @param libro libro a borrar
     * @return true si el libro se borró correctamente, false por lo contrario
     */
    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Contiene la lista de libros de la biblioteca
     *
     * @return lista de libros.
     */

    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Realiza una busqueda de libro por su titulo
     *
     * @param titulo título del libro a buscar
     * @return el libro si se encuentra, o null sino existe.
     */

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @param autor Autor del libro a buscar
     * @return el primer libro que coincida con el autor o null si por lo contrario no se encuentra
     */

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
}