/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Juan
 */import javax.swing.JOptionPane;
public class MiPlayList {
    
    public static void main(String[] args) {

String[] PlayList = {"daytona - cris mj", "Soy un bandido - cris mj","Nueva vida - Peso pluma", "Tiene - tobal mj", "Como tu ninguna - cris mj"};
       // System.out.println(inventario[4]);
        JOptionPane.showMessageDialog(null,PlayList[1]);
        JOptionPane.showMessageDialog(null,PlayList[4]);
        for (int i = 0; i <PlayList.length; i++) {
            JOptionPane.showMessageDialog(null,"Mi Play list fav es: "+ PlayList[i]);
        }
    }
}
