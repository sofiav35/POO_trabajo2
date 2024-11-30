package Actividad_2;
import java.util.Scanner;

public class Punto7 {

	public static void main(String args[]) {
		
		System.out.println("Ingrese el primer numero:");
		Scanner num1= new Scanner(System.in);
		double a=num1.nextDouble();
		
		System.out.println("Ingrese el segundo numero:");
		Scanner num2= new Scanner(System.in);
		double b=num2.nextDouble();
		
		if(a>b) {
			System.out.println("El numero "+a+" es mayor que el numero "+b);
		}
		else if(b>a) {
			System.out.println("El numero "+b+" es mayor que el numero "+a);
		}
		else {
			System.out.println("El numero "+a+" es igual que el numero "+b);
		}
	}	
}