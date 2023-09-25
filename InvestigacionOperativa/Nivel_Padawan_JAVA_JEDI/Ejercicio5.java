package Nivel_Padawan_JAVA_JEDI;
/*Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        double libras = 150;
        final double conversion_kg = libras / 2.2046;

        System.out.println(libras+" libras " + " son " + conversion_kg + " kilogramos");

    }
}
