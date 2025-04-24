/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Joptionpane;

/**
 *
 * @author Juan
 */
import javax.swing.JOptionPane;


public class Mensaje {
     public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
     JOptionPane.showMessageDialog(null, "Hola "+ nombre);
    
     }

}
