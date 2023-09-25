package Nivel_Iniciado_JAVA_JEDI;
/* Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        
        float num1 = 6;
        float num2 = 8 ;
        float multiplicacion_real = num1 * num2;

        int num3 = 4;
        int num4 = 9 ;
        int multiplicacion_entero = num3 * num4;

        var suma = multiplicacion_entero + multiplicacion_real ;

        System.out.println("El resultado de la suma entre "+ multiplicacion_real +" y " +multiplicacion_entero +" es " + suma);
    }
}
