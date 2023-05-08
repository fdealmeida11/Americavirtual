
import javax.swing.JOptionPane;


public class OrdenarNombres {
    public static void main(String[] args) {

    String nombre =  JOptionPane.showInputDialog("Dame un nombre");
    String nombre2 =  JOptionPane.showInputDialog("Dame otro nombre");
    String nombre3 =  JOptionPane.showInputDialog("Dame un nombre mas");
    int CharNombre = 0;
    int Charnombre2 = 0;
    int Charnombre3 = 0;

    for (int i=0; i<nombre.length();i++){
        if(Character.isLetter(nombre.charAt(i)))
            CharNombre++;
    }
    for (int i1=0; i1<nombre2.length();i1++){
        if(Character.isLetter(nombre2.charAt(i1)))
            Charnombre2++;
    }
    for (int i2=0; i2<nombre3.length();i2++){
        if(Character.isLetter(nombre3.charAt(i2)))
            Charnombre3++;
    }
         if(   ( CharNombre > Charnombre2) && (CharNombre > Charnombre3  )                                                                           )
         {
            JOptionPane.showMessageDialog(null, nombre);
             JOptionPane.showMessageDialog(null, CharNombre);

     }if (      ( Charnombre2 > CharNombre ) && ( Charnombre2 > Charnombre3  )                                                                                 )
     {
            JOptionPane.showMessageDialog(null, nombre2);
            JOptionPane.showMessageDialog(null, Charnombre2);

     }else
     {
            JOptionPane.showMessageDialog(null, nombre3);
            JOptionPane.showMessageDialog(null, Charnombre3);
     }





    }

}
