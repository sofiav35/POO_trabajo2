package Actividad_2;
/*Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente.
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.*/

import java.util.Scanner;

public class Empleado {
	 public double dineroHora;
	 public double horasTrabajadas;
	 public double retencionFuente;
	 public double salarioBruto;
	 public double salarioNeto;
	 public int codigoEmpleado;
	 public String nombre, apellido;
	 
// Metodo para ingresar los datos de un empleado.
	 
	 public void ingresarEmpleados() {
		 
		 Scanner empleado = new Scanner(System.in);
		 System.out.println("Ingrese el nombre del empleado: ");
		 nombre = empleado.nextLine();
		 
		 System.out.println("Ingrese el apellido del empleado: ");
		 apellido = empleado.nextLine();
		 
		 System.out.println("Ingrese el codigo del empleado; ");
		 codigoEmpleado = empleado.nextInt();
		 
		 System.out.println("Ingrese las horas trabajadas: ");
		 horasTrabajadas = empleado.nextDouble();
		 
		 System.out.println("Ingrese el valor por hora trabajada: ");
		 dineroHora = empleado.nextDouble();
		 
		 System.out.println("Ingrese el porcentaje de retencion: ");
		 retencionFuente = empleado.nextDouble();
	 }
	 
		
		 public void calcularSalarioBruto(){
			 salarioBruto= horasTrabajadas*dineroHora;
		 }
		 
		 public void calcularSalarioNeto(){
			 salarioNeto= salarioBruto-(salarioBruto*(retencionFuente/100)); 
		 }
		 
		 
		 public void informacionEmpleado() {
			 System.out.println("Codigo: "+ codigoEmpleado);
			 System.out.println("Nombre: "+ nombre+ " "+ apellido);
			 System.out.println("Salario Bruto: "+ salarioBruto);
			 System.out.println("Salario Neto: "+ salarioNeto);
			 
					 }
		 
}