/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la Ejer2Cir (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package poo;

import servicio.Ejer2CirServicio;
import entidad.Ejer2CirEntidad;

/**
 *
 * @author CELESTE
 */
public class Ejer2Cir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ejer2CirServicio vs = new Ejer2CirServicio();
        
        Ejer2CirEntidad v1 = vs.crearCircunferencia(); 
        vs.metodoArea(v1);
        vs.perimetro(v1);
        
       
    }
    
}
