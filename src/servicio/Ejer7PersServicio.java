/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package servicio;

import entidad.Ejer7PersEntidad;
import java.util.Scanner;

public class Ejer7PersServicio {

    // instanciar un objeto 
    Ejer7PersEntidad p0 = new Ejer7PersEntidad();
    // lleno los atributos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejer7PersEntidad crearPersona(Ejer7PersEntidad p0) {

        System.out.print("Ingrese el nombre de la persona: ");
        p0.setNombre(leer.next().toLowerCase());
        System.out.print("Ingrese la edad de la persona: ");
        p0.setEdad(leer.nextInt());
        if (p0.getEdad() >= 18) {
            p0.setEsMayorDeEdad(true);
        } else {
            p0.setEsMayorDeEdad(false);
        }
        System.out.print("Ingrese el sexo de la persona (H, M, O): ");
        p0.setSexo(leer.next().toUpperCase().charAt(0));
        while (p0.getSexo() != 'H' && p0.getSexo() != 'M' && p0.getSexo() != 'O') {
            System.out.print("Ingreso incorrecto. Ingrese nuevamente el sexo (H, M, O): ");
            p0.setSexo(leer.next().toUpperCase().charAt(0));
        }
        System.out.print("Ingrese el peso de la persona en kg: ");
        p0.setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura de la persona en metros: ");
        p0.setAltura(leer.nextDouble());

        double imc = p0.getPeso() / Math.pow(p0.getAltura(), 2);
        if (imc < 20) {
            p0.setCalcularIMC(-1);

        } else if (imc >= 20 && imc <= 25) {
            p0.setCalcularIMC(0);

        } else {
            p0.setCalcularIMC(1);
        }

        return p0;

    }


}
