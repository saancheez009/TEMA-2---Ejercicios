package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables comidacomprada, numAnimales, KilosComida,
		double comidaComprada;
		int numAnimales;
		int kilosComida;
		double racion ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la cantidad de comida comprada diariamente");
		comidaComprada=sc.nextInt();
		
		System.out.println("Por favor introduzca el número de animales: ");
		numAnimales=sc.nextInt();
		
		System.out.println("Por favor introduzca los kilos de comida que comen los animales en total: ");
		kilosComida=sc.nextInt();
		
		racion=comidaComprada/numAnimales;
		
		if (comidaComprada==kilosComida || comidaComprada>kilosComida) {
			System.out.println("Se dispone de alimento suficiciente para cada animal");
		} else {
			System.out.println("La ración para cada animal es: "+racion+" kg.");
		}
		sc.close();
	}
	
}
