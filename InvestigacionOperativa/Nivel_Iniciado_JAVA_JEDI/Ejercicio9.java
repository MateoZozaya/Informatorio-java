package Nivel_Iniciado_JAVA_JEDI;
/* Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo */

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int num1 = 9;
        int al_cuadrado = num1 * num1;
        int al_cubo = al_cuadrado * num1;

        System.out.println("El numero " + num1 + " elevado al cuadro es: "+al_cuadrado + " y elevado al cubo es: " + al_cubo);
    }
}
