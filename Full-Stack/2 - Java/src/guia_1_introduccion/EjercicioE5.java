package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE5 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);  
    char opcion; 
       
    do{
         System.out.println("Ingrese una opción en mayúsculas: ");
         System.out.println("socio A");
         System.out.println("socio B");
         System.out.println("socio C");
         opcion = leer.next().charAt(0);         
       }while(opcion != 'A' && opcion != 'B' && opcion != 'C');
    
         System.out.println("Ingrese costo del tratamiento");
         int costo = leer.nextInt();
         double trat;
         System.out.println("");
         
         switch(opcion){
             case 'A':
                 trat = costo * 0.50;
                 System.out.println("El socio A tiene que abonar por el tartamiento la suma de: " + (int) trat + " pesos.");
                 break;
             case 'B':
                 trat = costo * 0.65;
                 System.out.println("El socio B tiene que abonar por el tartamiento la suma de: " + (int) trat + " pesos.");
                 break;
             case 'C':
                 System.out.println("El socio C tiene que abonar por el tartamiento la suma de: " + costo + " pesos.");
                 break;
         }
         
         
         
         leer.close();
}
}