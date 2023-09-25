package Nivel_Caballero_JAVA_JEDI;
/* Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        

        int pesos = 300000;
        final double conversion_euros = pesos * 0.002698;

        System.out.println("$" + pesos + " pesos" + " son $" + conversion_euros + "euros");
    }
}
