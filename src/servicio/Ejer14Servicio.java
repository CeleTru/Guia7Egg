/*
14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package servicio;

import entidad.Ejer14Entidad;
import java.util.Scanner;


public class Ejer14Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejer14Entidad v1 = new Ejer14Entidad();

    public Ejer14Entidad cargarCelular() {

        System.out.println("Ingrese la marca del celular:");
        v1.setMarca(leer.nextLine().toLowerCase());
        System.out.println("Ingrese el precio del celular:");
        v1.setPrecio(leer.nextFloat());
        System.out.println("Ingrese el modelo del celular:");
        v1.setModelo(leer.next());
        System.out.println("Ingrese la cantidad de memoria RAM del celular:");
        v1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento del celular:");
        v1.setAlmacenamiento(leer.nextInt());
        ingresarCodigo();

        return v1;

    }

//     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
    public void ingresarCodigo() {
        //        Cuando llamamos a un vector no se usa set ya que lo declaramos al tamaño en la entidad
        System.out.println("Ingrese el código del celular (debe ser un número de 7 dígitos):");

        int digitCount = 0;
        while (digitCount < 7) {
            String input = leer.next();
            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                v1.getCodigo()[digitCount] = Character.getNumericValue(input.charAt(0));
                digitCount++;
            } else {
                System.out.println("Debe ingresar un solo dígito numérico.");
            }
        }
        System.out.print("El código ingresado es: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(v1.getCodigo()[i]);
        }
        System.out.println();

        /*
         String codigoString = "";

        for (int i = 0; i < 7; i++) {
            if (leer.hasNextInt()) {
                v1.getCodigo()[i] = leer.nextInt();
                codigoString += v1.getCodigo()[i];
            } else {
                System.out.println("Debe ingresar un número entero.");
                i--; // Retroceder el contador para volver a intentar leer el mismo número 
            }

            System.out.println("El código ingresado es: " + codigoString);

        }
         */
    }

}
