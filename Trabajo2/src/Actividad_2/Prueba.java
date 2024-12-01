package Actividad_2;
import java.util.Scanner;

public class Prueba {
	public static void main(String args[]){
		
		//Circulo
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo: ");
		int radio = scanner.nextInt();
		
		Circulo figura1 = new Circulo(radio);
		
		System.out.println("El area del circulo es: "+figura1.calcularArea());
		System.out.println("El perimetrodel circluo es: "+figura1.calcularPerimetro());
		System.out.println();
		
		//Rectangulo
		
		System.out.println("Ingrese la base del rectangulo: ");
		int base = scanner.nextInt();
		System.out.println("Ingrese la altura del rectangulo: ");
		int altura = scanner.nextInt();
		
		Rectangulo figura2 = new Rectangulo(base, altura);
		System.out.println("El area del rectangulo es: "+figura2.calcularArea());
		System.out.println("El perimetro del rectangulo es: "+figura2.calcularPerimetro());
		System.out.println();
		
		//Cuadradinho
		
		System.out.println("Ingrese la longitud de los lados del cuadradinho: ");
		int lado = scanner.nextInt();
		
		Cuadrado figura3 = new Cuadrado(lado);
		System.out.println("El area del cuadradinho es: "+figura3.calcularArea());
		System.out.println("El perimetro del cuadradinho es: "+figura3.calcularPerimetro());
		System.out.println();
		
		//Triangulo
		
		System.out.println("Ingrese la base del triangulo: ");
		int baseT = scanner.nextInt();
		System.out.println("Ingrese la altura del triangulo: ");
		int alturaT = scanner.nextInt();
		
		Triangulo2 figura4 = new Triangulo2(baseT, alturaT);
		System.out.println("El area del triangulo es: "+figura4.calcularArea());
		System.out.println("El perimetro del triangulo es: "+figura4.calcularPerimetro());
		figura4.determinarTipo();
		
		scanner.close();
	} 

}