package Actividad_2;
import java.util.Scanner;

public class Punto11 {
	
	public static void main(String args[]) {
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero:");
		double n1= numero.nextDouble();
		
		System.out.println("Ingrese el segundo numero:");
		double n2= numero.nextDouble();
		
		System.out.println("Ingrese el tercer numero:");
		double n3= numero.nextDouble();
		
		if(n1>n2 && n1>n3) {
			
			System.out.println("El numero mayor entre "+n1+", "+n2+",1 "+n3+" es "+n1);
		}
		
		else if(n2>n1 && n2>n3) {
			
			System.out.println("El numero mayor entre "+n1+", "+n2+", "+n3+" es "+n2);
		}

		else{

			System.out.println("El numero mayor entre "+n1+", "+n2+", "+n3+" es "+n3);
		}

	}

}