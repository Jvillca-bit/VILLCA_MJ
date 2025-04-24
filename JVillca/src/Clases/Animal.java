package Clases;
public class Animal {
  String nombre;
  String Raza;
  int edad;

public void mostrarDatos (){
    System.out.println("El nombre del animal es: "+nombre);
    System.out.println("La raza del animal es: "+Raza);
    System.out.println("La edad del animal es: "+edad);
}
    public static void main(String[] args) {
        Animal a1 = new Animal ();
        a1.nombre="Zeus";
        a1.Raza="Pitbull";
        a1.edad=7;
        a1.mostrarDatos();
    }
}
