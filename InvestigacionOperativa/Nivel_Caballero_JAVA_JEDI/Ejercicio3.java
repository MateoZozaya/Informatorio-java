package Nivel_Caballero_JAVA_JEDI;
/*Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares. */
public class Ejercicio3 {
    
    public static void main(String[] args) {
     
        double euros = 3000;
        final double conversion_dolar = euros * 1.06;

        System.out.println("$" + euros + " euros" + " son $" + conversion_dolar + "dolares");
    }
}
