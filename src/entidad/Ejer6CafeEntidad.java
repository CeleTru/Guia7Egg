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
package entidad;

/**
 *
 * @author CELESTE
 */
public class Ejer6CafeEntidad {
    
   private int capacidadMaxima, cantidadActual;
   private int cafeServido, tamanoTaza, cantidad, agregarCafe, opcion;

    public Ejer6CafeEntidad() {
    }

    public Ejer6CafeEntidad(int capacidadMaxima, int cantidadActual, int cafeServido, int tamanoTaza, int cantidad, int agregarCafe, int opcion) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.cafeServido = cafeServido;
        this.tamanoTaza = tamanoTaza;
        this.cantidad = cantidad;
        this.agregarCafe = agregarCafe;
        this.opcion = opcion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCafeServido() {
        return cafeServido;
    }

    public void setCafeServido(int cafeServido) {
        this.cafeServido = cafeServido;
    }

    public int getTamanoTaza() {
        return tamanoTaza;
    }

    public void setTamanoTaza(int tamanoTaza) {
        this.tamanoTaza = tamanoTaza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAgregarCafe() {
        return agregarCafe;
    }

    public void setAgregarCafe(int agregarCafe) {
        this.agregarCafe = agregarCafe;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    
}
