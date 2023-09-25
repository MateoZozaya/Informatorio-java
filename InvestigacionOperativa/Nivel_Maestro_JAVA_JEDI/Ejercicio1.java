package Nivel_Maestro_JAVA_JEDI;
/* Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
 */
public class Ejercicio1 {
    
    public static void main(String[] args) { 
        
        int radio = 5;
        double area_circulo = 3.1416 * (radio * radio);

        System.out.println("El area del circulo es de " + area_circulo + " con un radio de " + radio);
    }
}
