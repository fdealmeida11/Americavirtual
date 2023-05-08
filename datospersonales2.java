<<<<<<< HEAD
import javax.swing.JOptionPane;

public class datospersonales2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String apellido = JOptionPane.showInputDialog("¿y tu apellido?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tenes?"));
        String domicilio = JOptionPane.showInputDialog("¿Donde vivis?");
        JOptionPane.showMessageDialog(null, "Hola soy " + nombre + apellido + " tengo " + edad + " años y vivo en la calle " + domicilio);
    }
}
=======
import javax.swing.JOptionPane;

public class datospersonales2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String apellido = JOptionPane.showInputDialog("¿y tu apellido?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tenes?"));
        String domicilio = JOptionPane.showInputDialog("¿Donde vivis?");
        JOptionPane.showMessageDialog(null, "Hola soy " + nombre + apellido + " tengo " + edad + " años y vivo en la calle " + domicilio);

        // texto sin influencia
    }

}
>>>>>>> f981a91 ("actualizando")
