package guia_1_introduccion;

public class EjercicioE12 {

	public static void main(String[] args) {
       
        int num1 = 0;
        int num2 = 0;
        for (int num3= 0; num3 <= 10; num3 ++) {
        	
        	if (num1 == 3 && num2 == 3 && num3 == 3) {
        		System.out.println("E - E - E");
        	} else if (num1 == 3 && num2 == 3) {
        		System.out.println("E - E - " + num3);
        	} else if (num2 == 3 && num3 == 3) {
        		System.out.println(num1 + " - E - E");
        	} else if (num1 == 3 && num3 == 3) {
        		System.out.println("E - " + num2 + " - E");
        	} else if (num1 == 3) {
        		System.out.println("E - " + num2 + " - " + num3);
        	} else if (num2 == 3) {
        		System.out.println(num1 + " - E - " + num3);
        	} else if (num3 == 3) {
        		System.out.println(num1 + " - " + num2 + " - E");
        	} else {
        		System.out.println(num1 + " - " + num2 +" - " + num3);
        	}
        	

        	if (num1 == 9 && num2 == 9 && num3 == 9) {
        		break;
        	}
        	
        	
        	if (num3 == 9 && num2 == 9) {
        		num3 = 0;
        		num2 = 0;
        		num1++;
        	}
        	
        	if (num3 == 9) {
        		num3 = 0;
        		num2++;
        	} 
        	

        }
    }
}