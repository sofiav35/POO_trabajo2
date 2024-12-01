package Actividad_2;

import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main(String args[]) {
		
		String empleado;
		double  salario_hora;
		double horas_trabajadas;
		double salarioTotal;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del trabajador: ");
		empleado= entrada.nextLine();
		 
		System.out.println("Ingrese el salario por hora: ");
		salario_hora= entrada.nextDouble(); 
		
		System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
		horas_trabajadas= entrada.nextDouble();
		
		salarioTotal=salario_hora*horas_trabajadas;
		
		if(salarioTotal>450000) {
			
			System.out.println("NOMBRE: "+empleado+"\nSALARIO: "+salarioTotal);
		}
		
		else {
			
			System.out.println("NOMBRE:"+empleado);
		}
		
		entrada.close();
	}

}