/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Estudiante {
   
        //atributos de clase
        String nombre;
    int edad;
    double nivelFacha;
    double altura;
    String colorPelo;

    public Estudiante(String nombre, int edad, double nivelFacha, double altura, String colorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelFacha = nivelFacha;
        this.altura = altura;
        this.colorPelo = colorPelo;
    }
    
    
    

    public Estudiante() {
    }
    void estudiar(){
        System.out.println("esta estudiando.....");
    }
    
    void ridiendo(){
        System.out.println("esta rindiendo......");
    }
    void horaLire(){
        JOptionPane.showInternalMessageDialog(null, nombre+" Esta en hora libre");
}
}
class main{
    public static void main(String[] args) {
        Estudiante estuduian1 =new Estudiante("Juan",17, 10, 1.84,"negro");
         estuduian1.horaLire();
    }
}
