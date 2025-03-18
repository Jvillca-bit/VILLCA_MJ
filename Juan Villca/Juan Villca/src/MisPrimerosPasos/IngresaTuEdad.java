
package MisPrimerosPasos;
import java.util.Scanner;

public class IngresaTuEdad {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        int edad=guardar.nextInt();
        System.out.println("tu edad es: "+edad);
    }
}
