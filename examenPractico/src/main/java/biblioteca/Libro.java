package biblioteca;

/**
 * @author cristian mauricio osso parra
 * @github cristian0612
 * Clase que representa un libro con título, autor y año de publicación
 */
public class Libro {
    /**
     * Título del libro
     */
    // TODO: Documentar estos atributos
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * Año de publicación del libro
     */
    private int anioPublicacion;

    /**
     * Constructor para crear un objeto Libro.
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    // TODO: Documentar este método
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro
     * @return el título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Determina el título del libro
     * @param titulo el título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro
     * @return el autor del libro
     */
    // TODO: Documentar este método
    public String getAutor() {
        return autor;
    }

    /**
     * Determina el autor del libro
     * @param autor el autor del libro
     */

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro
     * @return el año de publicación
     */
    // TODO: Documentar este método
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Determina el año de publicación del libro.
     * @param anioPublicacion
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
