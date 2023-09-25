package Nivel_Caballero_JAVA_JEDI;
/* Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int libras_esterlinas = 1500;
        final double conversion_dolares = libras_esterlinas * 1.22;

        System.out.println("$" + libras_esterlinas + " libras esterlinas" + " son $" + conversion_dolares + "dolares");
    }
}
