/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un Ejer1Entidad pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del Ejer1Entidad y el
numero de páginas.
 */
package servicio;

import entidad.Ejer1Entidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer1Servicio {
    
    public Ejer1Entidad cargarLibro (){
        
        // instanciar un objeto de tipo Ejer1Entidad 
        
        Ejer1Entidad v1 = new Ejer1Entidad(); 
        
        // lleno los atributos
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        v1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro: ");
        v1.setAutor(leer.next());
        System.out.println("Ingrese el ISBN: ");
        v1.setNumHoja(leer.nextInt());
        System.out.println("Ingrese el número de páginas: ");
        v1.setNumHoja(leer.nextInt());
        return v1;
                             
    }
    
    public void imprimirLibro (Ejer1Entidad v1){
          
          System.out.println("Los datos ingresados del libro son: ");
          System.out.println("El nombre del libro es " + v1.getTitulo());
          System.out.println(" El autor del libro es " + v1.getAutor());
          System.out.println(" El ISBN del libro es " + v1.getISBN());
          System.out.println(" El número de páginas del libro es " + v1.getNumHoja());
          
          
   
    }
    
    
}
