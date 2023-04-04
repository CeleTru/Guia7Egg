/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package servicio;

import entidad.Ejer3Entidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer3Servicio {

    public Ejer3Entidad cargarNumero() {

        // instanciar un objeto de tipo libro 
        Ejer3Entidad v1 = new Ejer3Entidad();

        // lleno los atributos
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        v1.setNumero1(leer.nextDouble());

        System.out.println("Ingrese el segundo número");
        v1.setNumero2(leer.nextDouble());

        return v1;

    }

    public void suma(Ejer3Entidad v1) {

        double suma;

        suma = v1.getNumero1() + v1.getNumero2();

        System.out.println("La suma de " + v1.getNumero1() + " + " + v1.getNumero2() + " es igual a " + suma);

    }

    public void resta(Ejer3Entidad v1) {

        double resta;

        resta = v1.getNumero1() - v1.getNumero2();

        System.out.println("La resta de " + v1.getNumero1() + " - " + v1.getNumero2() + " es igual a " + resta);

    }

    public void multiplicacion(Ejer3Entidad v1) {

        double multiplicacion;

        if (v1.getNumero1() != 0 && v1.getNumero2() != 0) {
            multiplicacion = v1.getNumero1() * v1.getNumero2();
            System.out.println("La multiplicacion de " + v1.getNumero1() + " x " + v1.getNumero2() + " es igual a " + multiplicacion);
        } else {
            System.out.println("La respuesta es 0");
        }
    }

    public void divide(Ejer3Entidad v1) {

        double divide;
        if (v1.getNumero1() != 0 && v1.getNumero2() != 0) {
            divide = v1.getNumero1() / v1.getNumero2();
            System.out.println("La division de " + v1.getNumero1() + " / " + v1.getNumero2() + " es igual a " + divide);

        } else {
            System.out.println("Hay un error ya que no se divide por 0");
        }

    }
}
