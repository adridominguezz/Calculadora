package Ejercicio;

import java.util.Scanner;

public class Calculadora

{
	
	public static void mensaje () {
		System.out.println("CES Juan Pablo Segundo Cádiz");
		}
 	
	public static int multiplica (int a, int b) {
		return a*b;
	}
	
	public static int division (int a, int b) {
		return a/b;
	}
	public static int suma (int a, int b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {


 		mensaje();
 		System.out.println( "El resultado de la multiplicación es " + multiplica(5,6));
 		System.out.println("El resultado de la división es " + division(6,3));
 		System.out.println("El resultado de la suma es " + suma(6,5));
 		System.out.println("El numero pi es: " + Math.PI);
 		System.out.println("La potencia de dos numero es: " + Math.pow(2.0, 3.0));
		
 		try {
 			
 			int divisor;
 			Scanner sc = new Scanner (System.in);
 			System.out.println("Voy a realizar una division");
 			System.out.println("Introduce divisor: ");
 			divisor= sc.nextInt();
 			sc.close();
 			
 			if (divisor == 0) {
 				throw new ArithmeticException ();
 				
 			}
 			//System.out.println(division(4,0));
 				
 		}catch (Exception e) {
 			e.printStackTrace();
 			System.out.println("Error");
 			
 		}finally {
 			System.out.println("fin del programa");
 		}
 		
	}
}
