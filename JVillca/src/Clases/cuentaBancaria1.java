package Clases;
import java.util.Scanner;

class CuentaBancaria{
    String numCuenta;
    String nombreTitular;
    int saldo;

    public CuentaBancaria(String numCuenta, String nombreTitular, int saldo){
        this.numCuenta = numCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public static CuentaBancaria crearCuenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("El numero de cuenta es: ");
        String numCuenta = scanner.nextLine();
        System.out.print("El nombre del titular es: ");
        String nombreTitular = scanner.nextLine();
        System.out.print("El saldo es: ");
        int saldo = scanner.nextInt();
        return new CuentaBancaria(numCuenta, nombreTitular, saldo);
    }
    public void mostrarNumCuenta(){
        System.out.println("Numero de cuenta es: "+numCuenta);
    }
    public void mostrarTitular(){
        System.out.println("Titular es: "+nombreTitular);
    }
    public void mostrarSaldo(){
        System.out.println("Saldo es: "+saldo);
    }
    public static void main(String[] args){
        CuentaBancaria c1 = CuentaBancaria.crearCuenta();
        c1.mostrarNumCuenta();
        c1.mostrarTitular();
        c1.mostrarSaldo();
    }
}