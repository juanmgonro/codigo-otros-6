package codigodeotros.ejercicio6;

import java.util.Scanner;

//Cambio a mayuscula la clase
public class Codigo6 {
	// agregar funcion main
	public static void main(String[] args) {
		//Creacion de arreglo en n    
		int[] numeros = new int[20];

		    for (int i = 0; i < 20; i++) {
		      numeros[i] = (int) ((Math.random() * 381) + 20);
		      //Corregi el syso
		      System.out.println(numeros[i] + " ");
		    }
		    //Corregi el syso
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.println("(1 – los multiplos de 5, 2 – los multiplos de 7): ");
		    Scanner s = new Scanner(System.in);
		    int opcion = s.nextInt();
		    
//		    numeros.foreach (char e : n) {
//			      if (e % multiplo == 0) {
//			        System.out.print("[" + e + "] ");
//			       else {
//			        System.in.print(e + " ");
//			      }
//			    }
//		    }
			

		}
}