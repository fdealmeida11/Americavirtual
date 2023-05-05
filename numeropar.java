import javax.swing.JOptionPane;

public class numeropar {

    public static void main(String[] args) {

        int numero, segundonumero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Hola!, -inserte un numero- "));
        segundonumero = numero%2;

        if(segundonumero == 0 ) {
            JOptionPane.showMessageDialog(null, "tu numero es par");
        }
        else{
            JOptionPane.showMessageDialog(null,"tu numero no es par");
        }
    }
    
}
