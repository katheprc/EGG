package guia_1_introduccion;

public class Ejercicio15 {

	public static void main(String[] args) {

		int[] vector = new int[100];
		
		for (int aux = 0; aux < 100; aux++) {
			vector[aux] = aux + 1;
		}
		
		for (int aux2 = 99; aux2 >= 0; aux2--) {
			System.out.print(vector[aux2] + " ");
		}
				
		
	}

}
