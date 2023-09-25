package Nivel_Iniciado_JAVA_JEDI;
/*Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar */


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int num1 = 7;
        int num2 = 9;
        int suma = num1 + num2;

        var paridad = suma % 2 == 0 ? "Par" : "Impar" ;

        System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es " + suma + " y su paridad es " + paridad);
       
    }
}
