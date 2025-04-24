/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class JuegoAdivinanza {
    int numeroSecreto;
    int intentos;

    //constructor
    public JuegoAdivinanza(int numeroSecreto, int intentos) {
       Random generador = new Random();
        this.numeroSecreto = generador.nextInt(10)+1;
        this.intentos = intentos=0;
    }
    
    public void jugar(){
    int adivinanza=0;
    int maxIntentos=3;
    
        for (int i = 1; i <= maxIntentos; i++) {
           String entrada=JOptionPane.showInputDialog("intentos "+i+"de"+ maxIntentos +"\nadivina el numero entre(1-10)");
          adivinanza=Integer.parseInt(entrada);
        intentos++;
        
        if(adivinanza<numeroSecreto){
       JOptionPane.showInternalMessageDialog(null,"muy alto" );
        }else if(adivinanza>numeroSecreto){
        JOptionPane.showInternalMessageDialog(null,"muy bajo" );
        }else{
        JOptionPane.showMessageDialog(null,"correcto lo lograste en el intento"+i);
        return;
        }
        }
         JOptionPane.showInternalMessageDialog(null,"SE TE ACABARON LOS INTENTOS MANCO" );
    }
    public static void main(String[] args) {
        JuegoAdivinanza j1 = new JuegoAdivinanza(0, 0);
        j1.jugar();
    }

}
