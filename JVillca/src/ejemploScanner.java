//Diseñar un programa que pida un número 
//al usuario por teclado y a continuación lo muestre.

import java.util.Scanner;
public class ejemploScanner {
    int num;
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          System.out.println("Ingrese un numero: ");
          int numero=entrada.nextInt();
          System.out.println("El numero ingresado es:"+numero);
    }
         
}

