package Clases;
import java.util.Scanner;
public class cuentaBancaria {
    String numCuenta;
    String nombreTitular;
    int saldo;

    public cuentaBancaria(String numCuenta, String nombreTitular, int saldo) {
        this.numCuenta = numCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("El numero de cuenta es: "+numCuenta);
        int numCuenta = entrada.nextInt();
        System.out.println("El nombre del titular es: "+nombreTitular);
        System.out.println("El Saldo es: "+saldo);
               
    }
    public void mostrarNumCuenta(){
        System.out.println("Su numero de cuenta es: ");
    }
    public void mostrarTitular(){
        System.out.println("El nombre del titular es: ");
    }
    public void mostrarSaldo(){
        System.out.println("Su Saldo es: ");
    }
    public static void main(String[] args) {
        cuentaBancaria l1 = new cuentaBancaria("199899", "Arnold", 100);
        l1.numCuenta = "1999";
        l1.nombreTitular = "Arnold";
        l1.saldo = 377;
        l1.mostrarInformacion();
    }
        
}

