package Nivel_Caballero_JAVA_JEDI;
/*Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        int bitcoins = 3;
        final int conversion_dolar = bitcoins * 26331;

        System.out.println(bitcoins +" BTC" + " son " + "$" + conversion_dolar);
    }
}
