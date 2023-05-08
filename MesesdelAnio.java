
import javax.swing.JOptionPane;

public class MesesdelAnio {

    public static void main(String[] args) {
        
        String mes = JOptionPane.showInputDialog(null, "dime un mes");
        int numeroMes;

        switch(mes){

           case "enero" :  numeroMes = 1;
           JOptionPane.showMessageDialog(null, "enero" + numeroMes + "/12"); ;
                             break;
            case "febrero" :  numeroMes = 2;
            JOptionPane.showMessageDialog(null, "febrero " + numeroMes + "/12" );;
                                break;
            case "marzo" : numeroMes = 3; 
            JOptionPane.showMessageDialog(null, "marzo " + numeroMes + "/12" );;
                                break;
            case "abril" : numeroMes = 4; 
            JOptionPane.showMessageDialog(null, "abril " + numeroMes + "/12" );;
                                break;
            case "mayo" :  numeroMes = 5;
            JOptionPane.showMessageDialog(null, "mayo " + numeroMes + "/12" );;
                                break;
            case "junio" : numeroMes = 6;
            JOptionPane.showMessageDialog(null, "junio " + numeroMes + "/12" );;
                            break;
            case "julio" : numeroMes = 7;
             JOptionPane.showMessageDialog(null, "julio " + numeroMes + "/12" );;
                            break;
            case "agosto" :  numeroMes = 8;
            JOptionPane.showMessageDialog(null, "agosto " + numeroMes + "/12" );;
                            break;
            case "septiembre" :  numeroMes = 9;
            JOptionPane.showMessageDialog(null, "septiembre " + numeroMes + "/12" );;
                            break;
            case "octubre" : numeroMes = 10;
             JOptionPane.showMessageDialog(null, "octubre " + numeroMes + "/12" );;
                            break;
            case "noviembre" : numeroMes = 11; 
            JOptionPane.showMessageDialog(null,"noviembre " + numeroMes + "/12" );;
                                break;
            case "diciembre" : numeroMes = 12;
             JOptionPane.showMessageDialog(null, "diciembre " + numeroMes + "/12" );;
            
             default : JOptionPane.showMessageDialog(null, "eso no es un mes chinchulin");
        }

       
    }}
    

