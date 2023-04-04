/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un Ejer1Entidad pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del Ejer1Entidad y el
numero de páginas.
 */
package poo;

import entidad.Ejer1Entidad;
import servicio.Ejer1Servicio;


public class Ejer1Libro {

  
    public static void main(String[] args) {
        
        Ejer1Servicio vs = new Ejer1Servicio();
        Ejer1Entidad v1 = vs.cargarLibro(); 
        vs.imprimirLibro(v1);
        
    }
    
}
