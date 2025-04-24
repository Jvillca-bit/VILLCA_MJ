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
public class edadesFamilia {
     public static void main(String[] args) {

String[] edad = {"18", "17","15", "13", "11"};
       // System.out.println(inventario[4]);
        JOptionPane.showMessageDialog(null,edad[1]);
        JOptionPane.showMessageDialog(null,edad[4]);
        for (int i = 0; i <edad.length; i++) {
            JOptionPane.showMessageDialog(null,"Las edades son: "+ edad[i]);
        }
    }
}
