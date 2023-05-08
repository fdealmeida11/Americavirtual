import javax.swing.JOptionPane;
public class DiasDelMesConAniosBisiestos {
    public static void main(String[] args) {
       
        int numeroMes = Integer.parseInt(JOptionPane.showInputDialog("¿Que mes queres saber?"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("¿de que año?"));
        int numeroDias;
        int añoBisiesto = año%4 ;
        switch(numeroMes){
            
            case 1 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"enero tiene " + numeroDias + " en el año " + año);
                        break;
            case 2 : if ( añoBisiesto == 0){numeroDias = 29;}
                            else{numeroDias = 28;}
                        JOptionPane.showMessageDialog(null,"febrero tiene " + numeroDias + " en el año " + año);
                        break;
            case 3 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"marzo tiene " + numeroDias + " en el año " + año);
                        break;
            case 4 : numeroDias = 30;
                        JOptionPane.showMessageDialog(null,"abril tiene " + numeroDias + " en el año " + año);
                        break;
            case 5 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"mayo tiene " + numeroDias + " en el año " + año);
                        break;
            case 6 : numeroDias = 30;
                        JOptionPane.showMessageDialog(null,"junio tiene " + numeroDias + " en el año " + año);
                        break;
            case 7 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"julio tiene " + numeroDias + " en el año " + año);
                        break;
            case 8 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"agosto tiene " + numeroDias + " en el año " + año);
                        break;
            case 9 : numeroDias = 30;
                        JOptionPane.showMessageDialog(null,"septiembre tiene " + numeroDias + " en el año " + año);
                        break;
            case 10 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"octubre tiene " + numeroDias + " en el año " + año);
                        break;
            case 11 : numeroDias = 30;
                        JOptionPane.showMessageDialog(null,"noviembre tiene " + numeroDias + " en el año " + año);
                        break;
            case 12 : numeroDias = 31;
                        JOptionPane.showMessageDialog(null,"diciembre tiene " + numeroDias + " en el año " + año);
                        break;
        }


    }
}
