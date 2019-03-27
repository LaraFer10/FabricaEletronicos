
package fabrica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fabrica {

    public static void main(String[] args) {
       Liquidificador l = new Liquidificador("Phillips", 50, 120);
       Scanner input = new Scanner(System.in);
       Tampa tampa = new Tampa();
       
       l.setTampa(tampa);
       l.getTampa().setCor("rosa");
       
       System.out.println(""+l.getTampa().getCor());
       String a = JOptionPane.showInputDialog("digite volt");
       l.setVoltagem(Integer.parseInt(a));
       JOptionPane.showMessageDialog(null, l.VerificaVolt());
    }
    
}
