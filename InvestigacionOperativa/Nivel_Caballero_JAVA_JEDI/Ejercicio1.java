package Nivel_Caballero_JAVA_JEDI;
/* Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número */
public class Ejercicio1{

    public static void main(String[] args) {
        

        int num1 = 75;
        float num2 = 100;

        float porcentaje = num1 * 100 / num2;

        System.out.println("El numero " + num1 + " es el %" + porcentaje + " de " + num2);
    }
}