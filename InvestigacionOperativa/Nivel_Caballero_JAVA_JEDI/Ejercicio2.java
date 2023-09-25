package Nivel_Caballero_JAVA_JEDI;
/*Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int dolares = 500;
        final int conversion_pesos = dolares * 700;

        System.out.println("$" + dolares +" dolares" + " son $" + conversion_pesos + " pesos");
    }
}
