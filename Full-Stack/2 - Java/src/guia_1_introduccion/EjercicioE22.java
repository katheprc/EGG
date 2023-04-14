package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE22 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese tamaño de matriz");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       int suma = 0;
       int[][] matriz = new int[num1][num2];
               
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                suma = suma + matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
       
        System.out.println("La suma de los elementos de la matriz es: " + suma);

        leer.close();
        
    }
}