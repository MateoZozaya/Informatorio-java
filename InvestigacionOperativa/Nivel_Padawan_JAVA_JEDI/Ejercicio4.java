package Nivel_Padawan_JAVA_JEDI;
/* Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades. */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        var nombre1 = "Rodrigo";
        int edad1  = 33;
        var nombre2 = "Paul";
        int edad2  = 56;
        var nombre3 = "Jorge";
        int edad3  = 24;
        var nombre4 = "Marcela";
        int edad4  = 87;
        var nombre5 = "Paula";
        int edad5  = 72;

        int promedio = (edad1 + edad2 + edad3 + edad4 + edad5) /5;

        System.out.println("Su nombre es " + nombre1 + " y tiene " +edad1 + " años");
        System.out.println("Su nombre es " + nombre2 + " y tiene " +edad2 + " años");
        System.out.println("Su nombre es " + nombre3 + " y tiene " +edad3 + " años");
        System.out.println("Su nombre es " + nombre4 + " y tiene " +edad4 + " años");
        System.out.println("Su nombre es " + nombre5 + " y tiene " +edad5 + " años");
        System.out.println("El promedio de edad es de " + promedio + " años");
    }
}
