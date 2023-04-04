/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package servicio;

import entidad.Ejer4RecEntidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer4RecServicio {

    public Ejer4RecEntidad cargarNumero() {

        // instanciar un objeto  
        Ejer4RecEntidad v1 = new Ejer4RecEntidad();

        // lleno los atributos
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base en m");
        v1.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura en m");
        v1.setAltura(leer.nextDouble());

        return v1;
    }

    // Método para calcular la superficie del rectángulo
    public void superficie(Ejer4RecEntidad v1) {

        double superficie;

        superficie = v1.getBase() * v1.getAltura();

        System.out.println("La superficie del rectángulo es " + superficie + "m2");

    }

    // Método para calcular el perímetro del rectángulo
    public void perimetro(Ejer4RecEntidad v1) {

        double perimetro;

        perimetro = (v1.getBase() + v1.getAltura()) * 2;

        System.out.println("El perímetro del rectángulo es " + perimetro + "m2");

    }

    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo(Ejer4RecEntidad v1) {

        for (int i = 0; i < v1.getAltura(); i++) {
            for (int j = 0; j < v1.getBase(); j++) {

                if((i == 0 || i == ((v1.getBase()) - 1) ) || (j == 0 || j == ((v1.getBase()) - 1) ))
                
                {
                System.out.print(" * ");
                }
                
                else
                        
                {
                    System.out.print("   ");
                }
            }
            
            System.out.println(" ");
        }

    }

}
