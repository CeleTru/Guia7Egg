/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package servicio;

import entidad.Ejer5BancEntidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer5BancServicio {

    // instanciar un objeto 
    Ejer5BancEntidad v1 = new Ejer5BancEntidad();
    // lleno los atributos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejer5BancEntidad cargarNumero() {

        System.out.print("Ingrese el número de cuenta: ");
        v1.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        v1.setDni(leer.nextLong());
        System.out.print("Ingrese el saldo actual: ");
        v1.setSaldoActual(leer.nextDouble());

        return v1;
    }

    // d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//y se la sumara a saldo actual.
    public void ingresar() {

        System.out.print("cuánto dinero ingresará a la cuenta: ");
        v1.setIngreso(leer.nextDouble());

        double ingreso = v1.getSaldoActual() + v1.getIngreso();

        System.out.println("El saldo total de la cuenta actualmente es : " + ingreso + " pesos.");

    }

    /*
      e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
     */
    public void retirar(double retiro) {
        System.out.print("cuánto dinero retirará de la cuenta: ");
        v1.setRetiro(leer.nextDouble());

        if (v1.getSaldoActual() >= v1.getRetiro()) {
            double saldo = v1.getSaldoActual() - v1.getRetiro();
            System.out.println("Se ha retirado " + v1.getRetiro() + " y quedan disponibles en la cuenta " + saldo);

        } else {
            System.out.println("No hay suficiente saldo para realizar el retiro.");
        }

    }

    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
     */
    public void extraccionRapida() {
        double limite = v1.getSaldoActual() * 0.2;
        System.out.print("Ingrese la cantidad a retirar (limite: " + limite + "): ");
        v1.setRetiro(leer.nextDouble());

        if (v1.getRetiro() > limite) {
            System.out.println("No se puede retirar más del 20% del saldo actual.");
        } else {
            double saldo = v1.getSaldoActual() - v1.getRetiro();
            System.out.println("Se ha retirado " + v1.getRetiro() + " y quedan disponibles en la cuenta " + saldo);
        }

    }

    /*
   g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
     */
    public void consultarSaldo() {
        System.out.print("¿quiere consultar el saldo: si / no\n");
        String respuesta = leer.next().toLowerCase();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("El saldo actual es de " + v1.getSaldoActual() + " pesos.");
        } else {
            System.out.println("¡Gracias por utilizar nuestros servicios bancarios!");
        }

    }

    /*
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     */
    public void consultarDatos() {
        System.out.print("¿quiere consultar los datos de su cuenta: si / no\n" );
        String respuesta = leer.next().toLowerCase();
        
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Número de cuenta: " + v1.getNumeroCuenta());
            System.out.println("DNI del cliente: " + v1.getDni());
            System.out.println("Saldo actual: " + v1.getSaldoActual() + " pesos.");
        } else {
            System.out.println("¡Gracias por utilizar nuestros servicios bancarios!");
        }

    }

}
