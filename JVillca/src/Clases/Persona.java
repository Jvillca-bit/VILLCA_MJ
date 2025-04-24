package Clases;
public class Persona {
    String nombre;
    String apellido;
    int edad;
    
    public void mostrarDatos(){
        System.out.println("Hola! "+nombre);
        System.out.println("Tu apellido es: "+apellido);
        System.out.println("Y tienes: "+edad);
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Jonathan";
        p1.apellido="Villca";
        p1.edad=18;
        p1.mostrarDatos();
    }
    
}
