
package pp2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pp2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        int a, b, h = 0,a1,b1;
        
        
        String a_s = JOptionPane.showInputDialog(null,"Ingrese un numero" );
                a = Integer.valueOf(a_s);
                String b_s = JOptionPane.showInputDialog(null,"Ingrese otro numero" );
                b = Integer.valueOf(b_s);
        
        
        a1 = (a*a) + (b*b);
        h = (int) Math.sqrt(a1);
        
        JOptionPane.showInputDialog(null, "La hipotenusa es:" + h);
        
    }
    
}
