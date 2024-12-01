package Actividad_2;

import java.util.Scanner;
public class Ventas {

	public double vDpt1, vDpt2, vDpt3, salarioVendedores,totalVentas, salario1, salario2, salario3,porcentaje;
	
	public void obtener_datos() {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese las ventas del departamento 1: ");
		vDpt1=entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Ingrese las ventas del departamento 2: ");
		vDpt2=entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Ingrese las ventas del departamento 3: ");
		vDpt3=entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Ingrese el salario base de los vendedores: ");
		salarioVendedores=entrada.nextDouble();
		
		totalVentas=vDpt1+vDpt2+vDpt3;
		porcentaje=totalVentas*0.33;
		
		entrada.close();
		
		}
	
	
	public void calcular_salario_Dpt1() {
		
		if(vDpt1>porcentaje) {
			
			salario1= salarioVendedores+(salarioVendedores*0.2);
		}
		
		else {
			salario1=salarioVendedores;
		}	
	}
	
	public void calcular_salario_Dpt2() {
		
		if(vDpt2>porcentaje) {
			
			salario2= salarioVendedores+(salarioVendedores*0.2);
		}
		
		else {
			salario2=salarioVendedores;
		}	
	}
	
	public void calcular_salario_Dpt3() {
		
		if(vDpt3>porcentaje) {
			
			salario3= salarioVendedores+(salarioVendedores*0.2);
		}
		
		else {
			salario3=salarioVendedores;
		}	
	}
	
	public void mostrar_salarios() {
		
		System.out.println("El salario de los vendedores:\nDepartamento 1: "+salario1+"$\nDepartamento 2: "+salario2+"$\nDepartamento 3: "+salario3+"$\n\nTotal de ventas: "+totalVentas);
	}
}