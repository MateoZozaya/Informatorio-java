package Nivel_Iniciado_JAVA_JEDI;
/*Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado. */

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        
        int num1 = 10;
        int num2 = 3;
        int suma = num1 + num2;

        var divisible = num1 % num2 == 0 ? "si" : "no" ;

        System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es " + suma + " .Y el numero " + num1 +" "+ divisible + " es divisible por el numero " + num2);
    }
}
