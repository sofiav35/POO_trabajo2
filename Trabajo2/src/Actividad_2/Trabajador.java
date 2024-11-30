package Actividad_2;

import java.util.Scanner;

public class Trabajador {
	String nombre;
	double horas_trabajadas, valor_hora_normal, salario;
	
	public void obtener_datos() {
		Scanner datos= new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del empleado: ");
		nombre= datos.nextLine();
		
		System.out.println("Ingrese el numero de horas trabajadas: ");
		horas_trabajadas= datos.nextDouble();
		
		System.out.println("Ingrese el valor por hora trabajada: ");
		valor_hora_normal= datos.nextDouble();
	}
	
	public void calcular_salario() {
		if (horas_trabajadas>40) {
			
			double horas_extra=horas_trabajadas-40;
			
			if (horas_extra>8) {
				
				double horas_max= horas_extra-8;
				salario= (40*valor_hora_normal)+(16*valor_hora_normal)+(horas_max*3*valor_hora_normal);
			}
			
		    else {
		    	salario= (40*valor_hora_normal)+(horas_extra*2*valor_hora_normal);
			}
		}
		
		else {
			
			salario= horas_trabajadas*valor_hora_normal;
		}
	}
	
	public void mostrar_datos() {
		
		System.out.println("El trabajador/a "+nombre+" devengo $"+salario);
	}
	

}