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

public class MisComidaFavorita {
    public static void main(String[] args) {

String[] comida = {"asado", "ensalada rusa","empanada", "pizza", "choripan"};
       // System.out.println(inventario[4]);
        JOptionPane.showMessageDialog(null,comida[1]);
       
        for (int i = 0; i <comida.length; i++) {
            JOptionPane.showMessageDialog(null,"Mis comidas fav son: "+ comida[i]);
        }
    }
}
