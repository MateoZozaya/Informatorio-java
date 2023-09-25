package Nivel_Iniciado_JAVA_JEDI;
/*Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15 */
public class Ejercicio10 {
    
    public static void main(String[] args) {
        

        int num1 = 5;
        int num2 = 7;
        int divisor = 1;

        int acumulador = num1 * num2 / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
        
        divisor++;
        acumulador +=num1 * num2  / divisor;
         
    
        System.out.println("El resultado es: " + acumulador);

        
    }  
}

