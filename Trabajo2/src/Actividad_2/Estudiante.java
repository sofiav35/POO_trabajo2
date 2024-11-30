package Actividad_2;
import java.util.Scanner;

public class Estudiante {
	public int numInscripcion;
	public String nombres;
	public double patrimonio;
	public int estrato;
	public double pagoMatricula;
	
	public void obtenerInformacion() {
		
		Scanner estudiante= new Scanner(System.in);
		
		System.out.println("Ingrese el numero de inscripcion del estudiante: ");
		numInscripcion=estudiante.nextInt();
		
		estudiante.nextLine();
		
		System.out.println("Ingrese los nombres del estudiante: ");
		nombres=estudiante.nextLine();
		
		System.out.println("Ingrese la cantidad del patrimonio del estudiante: ");
		patrimonio=estudiante.nextDouble();
		
		System.out.println("Ingrese el estrato social del estudiante: ");
		estrato=estudiante.nextInt();
		
	}
	
		public void calcula_costo_matricula() {
			
			if (patrimonio>2000000 && estrato>3) {
				
				pagoMatricula= 50000+(50000*0.03);
			}
			
			else {
				
				pagoMatricula=50000;
			}
		
	
	
		}
		
		
		public void mostrarInfo() {
			
			System.out.println("El estudiante con numero de inscripcion "+numInscripcion+" y nombre "+nombres+" debe pagar "+pagoMatricula);

		}
}