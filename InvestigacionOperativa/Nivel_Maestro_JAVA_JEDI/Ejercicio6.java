package Nivel_Maestro_JAVA_JEDI;
/*Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido. */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        

        double vel_ini = 30;
        double acel_grav = 20;
        double tiempo_transcu = 10;

        double vel_final = vel_ini + acel_grav * tiempo_transcu;

        System.out.println("La velocidad final del objeto en caida libre es de " + vel_final);
    }
}
