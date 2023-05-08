import java.util.Arrays;
;

public class actividad8 {

    public static void main(String[] args) {
        int[] numero = new int[] {2,2,2,3,4,4,5,5,6};
        Arrays.sort(numero);
        int contador = 0;
        int aux=numero[0];

        for( int i=0 ; i <= numero.length; i++)
        { if (aux == numero[i]){
            contador++;
        }else{
            System.out.println("el numero " + aux + " se repite " + contador + " veces");
            contador=1;
            aux=numero[i];
            ;
        }  }      
    }
    
}
