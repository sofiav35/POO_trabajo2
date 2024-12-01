package Actividad_2;

import java.lang.Math;

public class Triangulo2 {
	int baseT;
	int alturaT;
	
	public Triangulo2(int base, int altura) {
		this.baseT = base;
		this.alturaT = altura;
	}
	
	double calcularArea() {
		return(baseT*alturaT)/2;
	}
	
	double calcularPerimetro() {
		return (baseT+alturaT+calcularHipotenusa());
	}
	
	double calcularHipotenusa() {
		return Math.pow(baseT*baseT+alturaT*alturaT,0.5);
	}
	
	void determinarTipo() {
		if ((baseT==alturaT)&&(baseT==calcularHipotenusa())&&(alturaT==calcularHipotenusa()))
				System.out.println("El triangulo es equilatero");
		else if ((baseT!=alturaT)&&(baseT!=calcularHipotenusa())&&(alturaT!=calcularHipotenusa()))
			System.out.println("El triangulo es escaleno");
		else
			System.out.println("El triangulo es isoceles");
	}

}