package Ejercicio2;

public class Ejercicio2_main {
	
	
	public static void main(String[] args) {
		
		Integer[] listaInts = new Integer[5];
		
		try {
			for(int aux = 0 ; aux <= 5 ; aux++) {
				listaInts[aux] = aux+1;
			}
		}catch(Exception e) {
			System.out.println("Mensaje exception: " + e.getMessage());
		}finally {
			for(int aux = 0 ; aux < 5 ; aux++) {
				System.out.println(listaInts[aux]);
			}
		}
	}

	
}
