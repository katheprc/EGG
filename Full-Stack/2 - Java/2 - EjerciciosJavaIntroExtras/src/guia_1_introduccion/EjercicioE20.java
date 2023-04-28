package guia_1_introduccion;

public class EjercicioE20 {
	
    public static void main(String[] args) {
    	int[] vector = new int[10];
    	rellenar(vector);
    	imprimir(vector);
    }
    
    public static int[]rellenar (int[]vector){
    	
    	for (int aux = 0; aux < 10; aux++) {
    		vector[aux] = (int)(Math.random()*10);
    		
    	}
    	
    	return vector;
    }
    
    public static void imprimir (int[]vector) {
    	
    	for (int aux = 0; aux < 10; aux++) {
    		System.out.print(vector[aux] + "  ");    		
    	}
    	
    }
    
}
