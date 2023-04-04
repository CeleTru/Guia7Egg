/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicio;

import entidad.Ejer6CafeEntidad;
import java.util.Scanner;

public class Ejer6CafeServicio {

    // instanciar un objeto 
    Ejer6CafeEntidad v1 = new Ejer6CafeEntidad();
    // lleno los atributos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejer6CafeEntidad Cafetera() {
        System.out.print("Ingrese la capacidad máxima de la cafetera en ml: ");
        v1.setCapacidadMaxima(leer.nextInt());

        System.out.print("Ingrese la cantidad actual de café en la cafetera en ml: ");
        v1.setCantidadActual(leer.nextInt());

        while (true) {
            int opcion;
            System.out.println("\n");
            System.out.println("---- MENÚ ----");
            System.out.println("1. Ver la cantidad actual de café.");
            System.out.println("2. Llenar la cafetera.");
            System.out.println("3. Servir una taza.");
            System.out.println("4. Vaciar la cafetera.");
            System.out.println("5. Agregar café a la cafetera.");
            System.out.println("6. Salir.");
            System.out.print("Seleccione una opción: ");
            System.out.println("\n");
            v1.setOpcion(leer.nextInt());
            switch (v1.getOpcion()) {
                case 1:
                    System.out.println("La cafetera tiene " + v1.getCantidadActual() + " ml de café.");
                    break;
                case 2:
                    llenarCafetera();
                    break;
                case 3:
                    servirTaza();
                    break;
                case 4:
                    vaciarCafetera();
                    break;
                case 5:
                    agregarCafe();                    
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    return v1;

            }

        }

    }

    public void llenarCafetera() {

        v1.setCantidadActual(v1.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada completamente y tiene " + v1.getCantidadActual() + " ml.");

    }

    public void servirTaza() {

        System.out.print("Ingrese el tamaño de la taza en ml: ");
        v1.setTamanoTaza(leer.nextInt());
        if (v1.getCantidadActual() >= v1.getTamanoTaza()) {
            int queda = v1.getCantidadActual() - v1.getTamanoTaza();
            System.out.println("Se ha servido una taza de " + v1.getTamanoTaza() + " ml y ahora en la cafetera quedan " + queda);
        } else {
            System.out.println("Solo se pudo servir " + v1.getCantidadActual() + " ml.");

        }
    }

    public void vaciarCafetera() {

        v1.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");

    }

    public void agregarCafe() {
        System.out.print("Ingrese la cantidad de café en ml que desea agregar: ");
        v1.setAgregarCafe(leer.nextInt());
        int sumaCafe = v1.getCantidadActual() + v1.getAgregarCafe();
        if (v1.getCapacidadMaxima() > sumaCafe) {
            System.out.println("Se agregó " + v1.getAgregarCafe() + " ml y ahora en la cafetera quedan " + sumaCafe + " ml.");
        } else {
            System.out.println(" No se puede agregar esa cantidad ya que supera la capacidad máxima de la cafetera ");

        }
    }

}
