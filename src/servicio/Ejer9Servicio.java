/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package servicio;

import entidad.Ejer9Entidad;

public class Ejer9Servicio {

//        instanciar un objeto  
    Ejer9Entidad v1 = new Ejer9Entidad();

    public Ejer9Entidad numeroRandom() {

        v1.setNum1(Math.round(Math.random() * 10000.0) / 10000.0);
        v1.setNum2(Math.round(Math.random() * 10000.0) / 10000.0);

        System.out.println("Número real 1 = " + v1.getNum1());
        System.out.println("Número real 2 = " + v1.getNum2());

        return v1;

    }

    // Método para devolver el mayor de los dos atributos
    public void devolverMayor() {
        
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("Cálculo de atributo de mayor valor ");

        if (v1.getNum1() > v1.getNum2()) {
            System.out.println("El número mayor es: " + v1.getNum1());
        } else {
            System.out.println("El número mayor es: " + v1.getNum2());
        }
    }

    // Método para calcular la potencia del mayor valor elevado al menor valor Previamente se deben redondear ambos valores.
    public void calcularPotencia() {
        double resultado;
        long valor1, valor2;

        valor1 = Math.round(v1.getNum1());
        valor2 = Math.round(v1.getNum2());
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("Cálculo de potencia del mayor valor elevado al menor valor ");

        System.out.println("Tras un redondeo, número 1 es " + valor1 + " y el número 2 es " + valor2);

        if (valor1 > valor2) {
            resultado = Math.pow(valor1, valor2);
            System.out.println(valor1 + " elevado a la potencia de " + valor2 + " es igual a " + resultado);
        } else if (valor2 > valor1) {
            resultado = Math.pow(valor2, valor1);
            System.out.println(valor2 + " elevado a la potencia de " + valor1 + " es igual a " + resultado);
        } else {
            System.out.println("Los números son iguales");
        }

    }

    // Método para calcular la raíz cuadrada del menor de los dos valores
    public void calcularRaiz() {
        
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("Cálculo de la raíz cuadrada del menor de los dos valores ");


        if (v1.getNum1() > v1.getNum2()) {
            double raiz = Math.sqrt(Math.abs(v1.getNum2()));
            System.out.println("La raíz cuadrada de " + v1.getNum2() + " (valor absoluto) es: " + raiz);
        } else if (v1.getNum2() > v1.getNum1()) {
            double raiz = Math.sqrt(Math.abs(v1.getNum1()));
            System.out.println("La raíz cuadrada de " + v1.getNum1() + " (valor absoluto) es: " + raiz);
        } else {
            System.out.println("Los números son iguales");
        }

    }

}
