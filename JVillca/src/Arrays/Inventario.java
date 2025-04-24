/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Juan
 */
import javax.swing.JOptionPane;

public class Inventario {
    public static void main(String[] args) {
       // String[] inventario = new String[5];

//inventario[0] = "Espada";
//inventario[1] = "Pico";
//inventario[2] = "Pan";
//inventario[3] = "Antorcha";
//inventario[4] = "Pala";

String[] herramientas = {"espada", "pico", "pan", "tigresa voladora"};
       // System.out.println(inventario[4]);
        
        
//JOptionPane.showMessageDialog(null, inventario[2]);

        for (int i = 0; i <herramientas.length; i++) {
            JOptionPane.showMessageDialog(null, herramientas[i]);
        }
    }
}
