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
package poo;

import entidad.Ejer7PersEntidad;
import servicio.Ejer7PersServicio;

public class Ejer7Pers {

    public static void main(String[] args) {

        Ejer7PersServicio vs = new Ejer7PersServicio();
        
        Ejer7PersEntidad persona1 = new Ejer7PersEntidad();
        Ejer7PersEntidad persona2 = new Ejer7PersEntidad();
        Ejer7PersEntidad persona3 = new Ejer7PersEntidad();
        Ejer7PersEntidad persona4 = new Ejer7PersEntidad();

        vs.crearPersona(persona1);
        vs.crearPersona(persona2);
        vs.crearPersona(persona3); 
        vs.crearPersona(persona4);

        System.out.println("Persona 1 " + persona1.toString());
        System.out.println("Persona 2 " + persona2.toString());
        System.out.println("Persona 3 " + persona3.toString());
        System.out.println("Persona 4 " + persona4.toString());

//        Ejer7PersEntidad[] personas = {persona1, persona2};
        Ejer7PersEntidad[] personas = {persona1, persona2, persona3, persona4};

        int pesoIdeal = 0;
        int porDebajo = 0;
        int conSobrepeso = 0;
        int mayoresEdad = 0;
        int menoresEdad = 0;
        //
        for (Ejer7PersEntidad persona : personas) {

            if (persona.getCalcularIMC() == 0) {
                pesoIdeal++;
            } else if (persona.getCalcularIMC() == -1) {
                porDebajo++;
            } else {
                conSobrepeso++;
            }

            if (persona.isEsMayorDeEdad() == true) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

        double porcentajePesoIdeal = 100.0 * pesoIdeal / personas.length;
        double porcentajePorDebajo = 100.0 * porDebajo / personas.length;
        double porcentajeConSobrepeso = 100.0 * conSobrepeso / personas.length;
        double porcentajeMayoresEdad = 100.0 * mayoresEdad / personas.length;
        double porcentajeMenoresEdad = 100.0 * menoresEdad / personas.length;

        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajePorDebajo + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeConSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");
    }

}


/*
       for de 4 vueltas para entrar las 4 personas 
        
        vector de tipo objeto que vaya guardando de largo 4 llenarlo en cada posición 
        
        otra matriz de los objetos con los resultados de mayor de edad e imc
        
        void estadística. 
        
 */

// crear un vector de tamaño 4
//        Ejer7PersServicio[] vectorPersonas = new Ejer7PersServicio[4];
//
//// llenar el vector con objetos Persona creados a través del método crearPersona
//        for (int i = 0; i < vectorPersonas.length; i++) {
//            vectorPersonas[i] = new Ejer7PersServicio();  // crear una nueva instancia de Persona
//            vectorPersonas[i].crearPersona();   // llamar al método crearPersona en la instancia recién creada
//            System.out.println("/n");
//        }
//
//      
//        


/*
public static void main(String[] args) {
        int pesoIdeal=0,pesoBajo=0,sobrePeso=0;
        int mayores=0,menores=0;
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        p1.crearPersona();
        // calculo ICM 
        switch (p1.calcularIMC()){
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
        }
        // calculo mayores de edad 
        if (p1.esMayorDeEdad()){
            mayores++;
        }
        else {
            menores++;
        }    
        
        p2.crearPersona();
        
         switch (p2.calcularIMC()){
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
        }
        
        if (p2.esMayorDeEdad()){
            mayores++;
        }
        else {
            menores++;
        }    
        p3.crearPersona();
        
         switch (p3.calcularIMC()){
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
        }
        
        if (p3.esMayorDeEdad()){
            mayores++;
        }
        else {
            menores++;
        }    
        
        p4.crearPersona();
        
         switch (p4.calcularIMC()){
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
        }
        
        if (p4.esMayorDeEdad()){
            mayores++;
        }
        else {
            menores++;
        }    
        
        System.out.println("Mayores de edad : " + mayores + " " + (mayores/4)*100 + "%");
        System.out.println("Menores de edad : " + menores + " " + (menores/4)*100 + "%");
        System.out.println("Peso ideal : " + pesoIdeal);
        System.out.println("Sobrepeso  : " + sobrePeso);
        System.out.println("Peso Bajo  : " + pesoBajo);

    }
*/
