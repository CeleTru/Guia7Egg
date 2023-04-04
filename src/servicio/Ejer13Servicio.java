/*
Uso de vectores como atributos de clase

13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package servicio;

import entidad.Ejer13Entidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer13Servicio {
    
    Ejer13Entidad v1 = new Ejer13Entidad();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
    */
    
    

    public Ejer13Entidad crearCurso() {

//        lleno los atributos
        System.out.print("Ingrese el nombre del curso: ");
        v1.setNombreCurso(leer.nextLine().toLowerCase());
        System.out.print("Ingrese la cantidad de horas por día: ");
        
        v1.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Ingrese la cantidad de días por semana: ");
        
        v1.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.print("Ingrese el turno (mañana o tarde): ");
        v1.setTurno(leer.next().toLowerCase());
        
        System.out.print("Ingrese el precio por hora: ");
        
        v1.setPrecioPorHora(leer.nextDouble());

        cargarAlumnos();

        return v1;

    }

//     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    public void calcularGananciaSemanal() {

        double calcularGananciaSemanal;

        calcularGananciaSemanal = v1.getCantidadHorasPorDia() * v1.getPrecioPorHora() * v1.getCantidadDiasPorSemana() * v1.getAlumnos().length;

        System.out.print("La ganancia es  " + calcularGananciaSemanal + " ");
    }

    
    public void cargarAlumnos() {
//        Cuando llamamos a un vector no se usa set ya que lo declaramos al tamaño en la entidad

        for (int i = 0; i < v1.getAlumnos().length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            v1.getAlumnos()[i] = leer.next().toLowerCase();

        }

}
}
