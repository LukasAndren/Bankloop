/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankloop;
import javax.swing.JOptionPane;
/**
 *
 * @author buster
 */
public class Bankloop {

    
    
    
    public static void main(String[] args) {
        
        
    while (true){
        
    String s = JOptionPane.showInputDialog("Hur mycket pengar vil du lägga in?");
    double pengar = Double.parseDouble(s);
    
    if (s == null)
            break;
    
    String tabell = null;
    
    s = JOptionPane.showInputDialog("Hur många år ska pengarna sitta inne?");
    int ar = Integer.parseInt(s);
    
    s = JOptionPane.showInputDialog("Vad är räntesatsen i procent?");
    double rantesats = Double.parseDouble(s) / 100 + 1;
    
    for(int i = 1; i <= ar; i++ ){
        
        pengar *= (rantesats);
        System.out.println("\nEfter år: " + i + "\nSumma: " + Math.round(pengar));
        tabell += "\nEfter år: " + i + "\nSumma: " + Math.round(pengar);
    }
    
    JOptionPane.showMessageDialog(null, tabell);
    
    }
    }

}
