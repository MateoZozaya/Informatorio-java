package Nivel_Maestro_JAVA_JEDI;
/*Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int num1 = 23;
        double num2 = 233;
        int num3 = 23;
        double num4 = 7953;
        int num5 = 849;
        double num6 = 2193;

        double media = (num1 + num2 + num3 + num4 + num5 + num6) / 6;

        System.out.println("La media aritmétrica es de " + media);
    }
}
