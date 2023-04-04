/*
 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la Ejer2CirEntidad (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package servicio;

import entidad.Ejer2CirEntidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer2CirServicio {

    public Ejer2CirEntidad crearCircunferencia() {

        // instanciar un objeto de tipo Ejer2CirEntidad
        Ejer2CirEntidad v1 = new Ejer2CirEntidad();

        // llenar los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
       v1.setRadio(leer.nextDouble());
        return v1;

    }
    
    public void metodoArea (Ejer2CirEntidad v1) {
        
        double area;
        
        area = Math.PI * Math.pow(v1.getRadio(), 2);
        System.out.println(" El área de la circunferencia es de : " + area);
        
    }
    
    public void perimetro (Ejer2CirEntidad v1) {
        
        double perimetro;
                
         perimetro = 2 * Math.PI * v1.getRadio();
         
         System.out.println(" El perímetro de la circunferencia es de : " + perimetro);
    }
}
