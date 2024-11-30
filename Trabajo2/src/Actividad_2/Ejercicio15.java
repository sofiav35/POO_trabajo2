package Actividad_2;

import java.util.Scanner;

public class Ejercicio15 {
	double A,B,C,D;
	
	public void obtener_informacion(){
		Scanner peso= new Scanner(System.in);
		
		System.out.println("Ingrese el peso de la esfera A:");
		A=peso.nextDouble();
		
		System.out.println("Ingrese el peso de la esfera B:");
		B=peso.nextDouble();
		
		System.out.println("Ingrese el peso de la esfera C:");
		C=peso.nextDouble();
		
		System.out.println("Ingrese el peso de la esfera D:");
		D=peso.nextDouble();	
	}
	
	public void comparar_pesos() {
		
		if((A==B)&&(A==C)){
			
			if(A<D) {
				System.out.println("La esfera diferente es la D y es de mayor peso");
			}
			
			else {
				System.out.println("La esfera diferente es la D y es de menor peso");
			}
		}
		
		
		else if((A==B)&&(A==D)) {
			
			if(A<C) {
				System.out.println("La esfera diferente es la C y es de mayor peso");
			}
			
			else {
				System.out.println("La esfera diferente es la C y es de menor peso");
			}
		}
		
		else if((A==C)&&(A==D)) {
			
			if(A<B) {
				System.out.println("La esfera diferente es la B y es de mayor peso");
			}
			
			else {
				System.out.println("La esfera diferente es la B y es de menor peso");
			}
		}
		
		else if((C==B)&&(C==D)) {
			
			if(C<A) {
				System.out.println("La esfera diferente es la A y es de mayor peso");
			}
			
			else {
				System.out.println("La esfera diferente es la A y es de menor peso");
			}
		}
	}

}
