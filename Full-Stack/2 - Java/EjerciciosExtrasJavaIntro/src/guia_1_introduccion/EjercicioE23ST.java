package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE23ST {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String matriz[][] = new String[20][20];
        int cont = 1;
        int rand;
        String palabras;
        do {
            System.out.println("ingrese las palabras");
            palabras = leer.nextLine();
           
            

            if (palabras.length() > 2 && palabras.length() < 5) {
                     cont++;
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        rand = (int) (Math.random()) * 19;
                        matriz[rand][j] = palabras.substring(i, i + 1);
                        if (matriz[rand][j].equals("")) {
                            matriz[rand][j] = "*";
                        }

                    }

                }
                
            }
            else{System.out.println("la palabra no esta dentro del rango");
            }
        } while (cont == 5);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                System.out.println(matriz[i][j]);  
                
            }
            System.out.println(" ");
        }
    }
 }
