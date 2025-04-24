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

public class Auto {
        String modelo;
        String marca;

    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
      void arrancar(){
          JOptionPane.showMessageDialog(null, "el auto arranco");

      }
       public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("ingresa la marca:");
        String modelo = JOptionPane.showInputDialog("ingresa el modelo:");
    JOptionPane.showMessageDialog(null, "la marca es: "+marca);
       JOptionPane.showMessageDialog(null,"el modelo es:"+modelo);
    Auto a1 = new Auto(modelo, marca);
      a1.arrancar();
       }
    }