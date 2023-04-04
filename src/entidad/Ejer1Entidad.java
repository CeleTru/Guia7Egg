/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un Ejer1Entidad pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del Ejer1Entidad y el
numero de páginas.
 */
package entidad;

/**
 *
 * @author CELESTE
 */
public class Ejer1Entidad {
    
    private String titulo, autor;
    private int numHoja, ISBN;
    
    // constructor por defecto

    public Ejer1Entidad() {
    }
    
    // constructor por parametros

    public Ejer1Entidad(String titulo, String autor, int numHoja, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numHoja = numHoja;
        this.ISBN = ISBN;
    }
    
    // getter and setter 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumHoja() {
        return numHoja;
    }

    public void setNumHoja(int numHoja) {
        this.numHoja = numHoja;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", numHoja=" + numHoja + ", ISBN=" + ISBN + '}';
    }
    
    
}
