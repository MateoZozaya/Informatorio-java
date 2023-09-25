package Nivel_Maestro_JAVA_JEDI;
/* Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve. */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int temp_celsius = 30;
        double temp_fahrenheit = temp_celsius * 1.8 + 32;

        System.out.println(temp_celsius + "°C equivalen a " + temp_fahrenheit + "°F");
    }
}
