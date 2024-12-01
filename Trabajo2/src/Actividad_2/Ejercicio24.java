package Actividad_2;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String args[]) {
		double a,b,c;
		
		Scanner peso= new Scanner(System.in);
		
		System.out.println("Ingrese el peso de la esfera A:");
		a= peso.nextDouble();
		
		System.out.println("Ingrese el peso de la esfera B:");
		b= peso.nextDouble();
		
		System.out.println("Ingrese el peso de la esfera C:");
		c= peso.nextDouble();
		
		if((a>b)&&(a>c)) {
			
			System.out.println("La esfera mas pesada es la A");
		}
		
		else if((b>a)&&(b>c)) {
			
			System.out.println("La esfera mas pesada es la B");
		}
		
		else {
			
			System.out.println("La esfera mas pesada es la C");
		}
		
		peso.close();
	} 
	
}