/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicio;

import entidad.Ejer8CadenaEntidad;
import java.util.Scanner;

public class Ejer8CadenaServicio {

//        instanciar un objeto  
    Ejer8CadenaEntidad v1 = new Ejer8CadenaEntidad();
//        lleno los atributos
    Scanner leer = new Scanner(System.in);

    public Ejer8CadenaEntidad ingreseFrase() {

        System.out.println(" Ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        v1.setFrase(leer.nextLine().toLowerCase());
//        v1.setAutor(leer.next());
//         v1.setLongitud(v1.getFrase().length());
        v1.setLongitud(v1.getFrase().length());

        return v1;

    }

//     Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales(Ejer8CadenaEntidad v1) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < v1.getLongitud(); i++) {
            if (vocales.indexOf(v1.getFrase().charAt(i)) != -1) {
                contador++;
            }

        }
        System.out.println("La frase tiene " + contador + " vocales.");
    }

//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Ejer8CadenaEntidad v1) {
        String invertida = "";

        for (int i = v1.getLongitud() - 1; i >= 0; i--) {
            invertida += v1.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es " + invertida);
    }
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
//    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(Ejer8CadenaEntidad v1) {
        int contador = 0;

        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next().toLowerCase();

        for (int i = 0; i < v1.getLongitud(); i++) {
            if (v1.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }

        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");

    }

// Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Ejer8CadenaEntidad v1) {

        System.out.println("Ingrese una nueva frase para comparar la longitud");
        String nuevaFrase = leer.nextLine().toLowerCase();

        if (v1.getLongitud() > nuevaFrase.length()) {
            System.out.println("La primera frase es más larga");
        } else if (v1.getLongitud() == nuevaFrase.length()) {
            System.out.println("La nueva frase es igual de larga");
        } else {
            System.out.println("La segunda frase es más larga.");
        }

    }

//    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Ejer8CadenaEntidad v1) {
        System.out.println("Ingrese una nueva frase para unir con la anterior");
        String nuevaFrase = leer.nextLine().toLowerCase();
        System.out.println("La frase resultante es: " + v1.getFrase() + " " + nuevaFrase);
    }

//       g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
    public void reemplazar(Ejer8CadenaEntidad v1) {

        System.out.println("Ingresa la letra por la que quieres reemplazar la letra 'A':");
        String reemplazo = leer.next().toLowerCase();

        String nuevaFrase = v1.getFrase().replace("a", reemplazo);

        System.out.println("La frase resultante es " + nuevaFrase);

    }

//    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public void contiene(Ejer8CadenaEntidad v1) {

        System.out.println("Ingresa la letra que quieres verificar si está en la frase");
        String letraVerificar = leer.next().toLowerCase();

        if (v1.getFrase().contains(letraVerificar)) {
            System.out.println("Verdadero, la letra sí está en la frase");
        } else {
            System.out.println("Falso, la letra no está en la frase");
        }

    }

}
