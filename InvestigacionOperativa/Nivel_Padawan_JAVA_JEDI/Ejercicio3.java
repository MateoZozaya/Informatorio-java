package Nivel_Padawan_JAVA_JEDI;

/*Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        char letra1 = '\u004D'; // 'M' en Unicode
        char letra2 = '\u0061'; // 'a' en Unicode
        char letra3 = '\u0074'; // 't' en Unicode
        char letra4 = '\u0065'; // 'e' en Unicode
        char letra5 = '\u006F'; // 'o' en Unicode
        
        System.out.print(letra1);
        System.out.print(letra2);
        System.out.print(letra3);
        System.out.print(letra4);
        System.out.print(letra5);
        
    }
}
