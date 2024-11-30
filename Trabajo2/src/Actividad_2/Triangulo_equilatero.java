package Actividad_2;
import java.util.Scanner;

public class Triangulo_equilatero {
	
	public double lado,perimetro, altura, area;
	
	public void ingresarLado() {
		
		System.out.println("Ingrese la longitud de el lado: ");
		Scanner valor = new Scanner(System.in); 
		lado= valor.nextDouble();
		
	}
	
	public void operaciones() {
		
		double perimetro= 3*lado;
		System.out.println("El perimetro del triangulo es: \n"+perimetro);
		
		double altura= (lado*Math.sqrt(3))/2;
		System.out.println("La altura de el triangulo es: \n"+altura);
		
		double area= (Math.sqrt(3)/4)*Math.pow(lado, 2);
		System.out.println("El area de el triangulo es:\n"+area);
	}

	
}
