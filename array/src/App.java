public class App {
   public static void main(String[] args) {
    int[] numero = new int[] {1,10,23,4,5,6,145,153,5,67};
        int numeroMayot = numero[0];
        
        for (int x = 1; x < numero.length; x++) {
			if (numero[x] > numeroMayot) {
				numeroMayot = numero[x];
			}
		}
		System.out.println("El mayor es: " + numeroMayot);



   }
}