
import javax.swing.JOptionPane;


public class numeropar {
    public static void main(String[] args) {
        int numero, numerodos;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Hola! -inserte un numero-"));
        numerodos = numero%2;

        if(numerodos==0){
            JOptionPane.showMessageDialog(null, "tu numero es par");

        }
        else{
            JOptionPane.showMessageDialog(null, "tu numero no es par");
        }
    }
}
