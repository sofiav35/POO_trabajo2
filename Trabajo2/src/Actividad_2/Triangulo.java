package Actividad_2;

import java.util.Scanner;

public class Triangulo {

	double lado1;
	double lado2;
	double lado3;
	double perimetro;
	double semiperimetro;
	double area;
	
	public void obtener_lados() {
		Scanner lado= new Scanner(System.in);
		
		System.out.println("Ingrese la longitud del primer lado:");
		lado1=lado.nextDouble();
		
		System.out.println("Ingrese la longitud del segundo lado:");
		lado2=lado.nextDouble();
		
		System.out.println("Ingrese la longitud del tercer lado:");
		lado3=lado.nextDouble();
	}
	
	public void calcular() {
		
		 perimetro= lado1+lado2+lado3;
		 semiperimetro= perimetro/2;
		 area= Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
	}
	
	public void mostrar() {
		
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El semiperimetro es: "+semiperimetro);
		System.out.println("El area es: "+area);
	}
	
}