/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ejer11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt() - 1; // Se le resta 1 al mes porque en la clase Date, enero es el mes 0.

        System.out.println("Ingrese el año: ");
        String anioStr = scanner.next();
        int anio = Integer.parseInt(anioStr);

// Crear objeto Date con la fecha ingresada
        Date fecha = new Date(anio - 1900, mes, dia);

// Formatear fecha usando SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy");
        System.out.println("La fecha ingresada es: " + dateFormat.format(fecha));

// Calcular diferencia en años con la fecha actual
        Date fechaActual = new Date();
        long diferenciaEnMilisegundos = fechaActual.getTime() - fecha.getTime();
        double segundosPorDia = 24 * 60 * 60 * 1000;
        int diferenciaEnAnios = (int) (diferenciaEnMilisegundos / segundosPorDia / 365.25);

        System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es: " + diferenciaEnAnios + " años");
    }
}
