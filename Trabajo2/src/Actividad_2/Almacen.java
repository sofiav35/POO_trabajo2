package Actividad_2;

import java.util.Scanner;

public class Almacen {
	
	public double compra;
	public String color;
	public double pago;
	public double descuento;
	
	public void obtener_datos() {
		Scanner informacion= new Scanner(System.in);
		
		System.out.println("Ingrese el precio del prducto: ");
		compra= informacion.nextDouble();
		
		informacion.nextLine();
		
		System.out.println("Ingrese el color de la pelota: ");
		color= informacion.nextLine();
	
		informacion.close();
	}

	
	public void calcular_descuento() {
		
		if(color.equalsIgnoreCase("azul")) {
			
			descuento=0.5;
		}
		
		else if(color.equalsIgnoreCase("amarillo")) {
			
			descuento=0.25;
		}
		
		else if(color.equalsIgnoreCase("verde")) {
			
			descuento=0.10;
		}
		
		else if(color.equalsIgnoreCase("rojo")) {
			
			descuento=1;
		}
		
		else {
			
			descuento=0;
		}	
		
		pago= compra-(compra*descuento);
	}
	
	public void mostrar_datos() {
		
		
		
		System.out.println("Valor de la compra: "+compra+"\nColor: "+color+"\nPorcentaje de descuento:"+(descuento*100)+"%\nValor a pagar: "+pago);		
	}
}