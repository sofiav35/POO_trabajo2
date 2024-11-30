package Actividad_2;

import java.util.Scanner;

public class Ejercicio23 {
	
	public static void main(String args[]) {
		
		double a,b,c, resultado1,resultado2;
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println("Ingrese el valor de a:");
		a=numero.nextDouble();
		
		System.out.println("Ingrese el valor de b:");
		b=numero.nextDouble();
		
		System.out.println("Ingrese el valor de c:");
		c=numero.nextDouble();
		

		if(a!=0) {
			
			if((Math.pow(b,2))-4*a*c>=0) {
				
				resultado1= (-(b)+Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
				resultado2= (-(b)-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
				
				System.out.println("Las raices son:\nX1= "+resultado1+"\nX2= "+resultado2);
			}
			
			else {
				System.out.println("Las raices hacen parte del conjunto de los números complejos");
			}
		}
		
		else {
			
			System.out.println("La única solución es 0");
		}
	}

}