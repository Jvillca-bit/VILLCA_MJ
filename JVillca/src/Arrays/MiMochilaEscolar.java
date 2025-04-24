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

public class MiMochilaEscolar {
    public static void main(String[] args) {
       // String[] util = new String[5];
        
//util[0] = "lapiz";
//util[1] = "pico";
//util[2] = "pan";
//util[3] = "cartuchera";
//util[4] = "goma";

String[] util = {"lapiz", "pico","pan", "cartuchera", "gomma"};
       // System.out.println(inventario[4]);
        JOptionPane.showMessageDialog(null,util[1]);
        JOptionPane.showMessageDialog(null,util[4]);
        
//JOptionPane.showMessageDialog(null, inventario[2]);

        for (int i = 0; i <util.length; i++) {
            JOptionPane.showMessageDialog(null,"La cosas que contienen tu mcohila son: "+ util[i]);
        }
    }
}
