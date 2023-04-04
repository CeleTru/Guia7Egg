/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package servicio;

import entidad.Ejer12Entidad;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;

public class Ejer12Servicio {

    Ejer12Entidad v1 = new Ejer12Entidad();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejer12Entidad crearPersona() {

        System.out.println("Ingrese el nombre de la persona: ");
        v1.setNombre(leer.nextLine());

        System.out.println("Ingrese la fecha de nacimiento de la persona (en formato dd/MM/yyyy): ");
        String fechaStr = leer.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento;

        try {
            fechaNacimiento = formato.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha. Se creará la persona con fecha de nacimiento nula.");
            return new Ejer12Entidad(v1.getNombre(), null);
        }
        v1.setFechaNacimiento(fechaNacimiento);

        return v1;
    }

    public int calcularEdad() {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(v1.getFechaNacimiento());
        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH)) {
            edad--;
        } else if (fechaActual.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH)) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(int edad) {
        int edadPersona = this.calcularEdad();
        return edadPersona < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + v1.getNombre());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if (v1.getFechaNacimiento() != null) {
            System.out.println("Fecha de nacimiento: " + formato.format(v1.getFechaNacimiento()));
            System.out.println("Edad: " + this.calcularEdad());
        } else {
            System.out.println("Fecha de nacimiento: N/A");
            System.out.println("Edad: N/A");
        }
    }

}
