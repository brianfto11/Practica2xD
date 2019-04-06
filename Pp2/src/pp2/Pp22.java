package pp2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pp22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String acum = "";
        a = JOptionPane.showInputDialog(null,"Ingrese una palabra" );

        for (int i=0; i <a.length();i++ ){
            for (int j = 0; j < abc.length(); j++) {
                if (a.charAt(i) == abc.charAt(j)) {
                  acum += abc.charAt(j+1);  
                }
            }
        }
    JOptionPane.showMessageDialog(null,acum );
    }
}
