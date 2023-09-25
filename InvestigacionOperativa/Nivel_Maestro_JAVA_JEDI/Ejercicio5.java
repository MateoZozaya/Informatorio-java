package Nivel_Maestro_JAVA_JEDI;
/*Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int masa = 20;
        int vel = 30;

        double energía = (0.5) * masa * vel * vel;

        System.out.println("La energia cinética del objeto es de " + energía);

    }
}
