/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package servicio;

import entidad.Ejer10Entidad;
import java.util.Arrays;

public class Ejer10Servicio {

    //        instanciar un objeto  
    Ejer10Entidad v1 = new Ejer10Entidad();

    public Ejer10Entidad resolucion() {

        // Inicializar arregloA con números aleatorios
        for (int i = 0; i < v1.getArregloA().length; i++) {
            v1.getArregloA()[i] = Math.round(Math.random() * 100.0) / 100.0;
        }

        System.out.println("Arreglo A  rellenado con números aleatorios:");
        System.out.println(Arrays.toString(v1.getArregloA()));

        // Ordenar arregloA de menor a mayor
        Arrays.sort(v1.getArregloA());
        
        // Copiar los primeros 10 números ordenados de arregloA a arregloB
        //        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        System.arraycopy(v1.getArregloA(), 0, v1.getArregloB(), 0, 10);

        // Rellenar los últimos 10 elementos de arregloB con el valor 0.5
        Arrays.fill(v1.getArregloB(), 10, v1.getArregloB().length, 0.5);
        
        System.out.println("Mostrar los dos arreglos resultantes");
        // 
        System.out.println("Arreglo A de menor a mayor");
        System.out.println(Arrays.toString(v1.getArregloA()));

        System.out.println("Arreglo B con 10 primeros números ordenados de arreglo A  y los últimos 10 elementos con valor 0.5:");
        System.out.println(Arrays.toString(v1.getArregloB()));

        return v1;

    }
}
