package guia_1_introduccion;


public class Ejercicio18 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [4][4];
		int[][] matriz2 = new int [4][4];
		for (int aux = 0; aux < 4; aux++)  {
			for (int aux2 = 0; aux2 < 4; aux2++) {
				matriz[aux][aux2] = (int)(Math.random()*10);
				System.out.print(matriz[aux][aux2] + " ");
			}
			System.out.println(" ");
		}

		System.out.println(" ");
		
		for (int aux = 0; aux < 4; aux++)  {
			for (int aux2 = 0; aux2 < 4; aux2++) {
				matriz2[aux][aux2] = matriz[aux2][aux];
				System.out.print(matriz2[aux][aux2] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
	}

}