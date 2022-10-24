package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	//Para comprobar que el código es correcto introducimos una cantidad en kilos de comida comprada, iintroducimos 50 kilos, y luego el número de perros, 40 perros, finalmente , introducimos el total de comida que comen los perros que es 50, al ser 50 igual al número de comida comprada, el sistema nos devuelve que hay comida suficiente
	// Luego hemos introducido un número de comida comprada menor a los kilos (20 kilos) que comen los perros al día (40 kilos), con ello el sistema nos muestra que no hay suficiente comida y hace el calculo de la ración que le corresponde a cada perro, el calculo es la division de la comida comprada entre el número de perros totales.
	// Por tanto nos muestra que La ración para cada animal es: 0.5714285714285714 kg.
		public static void main(String[] args) {
			
			//Declaramos las variables comidacomprada, numAnimales, KilosComida y racion
			double comidaComprada; //Kilos de comida que el usuario ha comprado
			int numAnimales; //Numero de perros totales que tiene el usuario
			int kilosComida; // Kilos de comida que comen todos los animales al día
			double racion ; //La ración que le pertenece a cada animal si no hay comida suficiente 
			//Introducimos e importamos el scanner para poder leer el teclado
			Scanner sc = new Scanner(System.in);
			// Le pedimos al usuario que por favor introduzc la cantidad de comida comprada por el usuario	
			System.out.println("Por favor introduzca la cantidad de comida comprada diariamente");
			comidaComprada=sc.nextInt(); // Le pedimos al sistema que lea el número de kilos que ha comprado el usuario
			// Le pedimos al usuario que por favor introduzca  el número de perros totales que tiene
		    System.out.println("Por favor introduzca el número de animales: ");
			numAnimales=sc.nextInt(); //Le decimos al sistema que lea el número de animales introducidos por el usuario
			// Le pedimos al usuario que por favor introduzca los kilos de comida que comen los perros en total		
			System.out.println("Por favor introduzca los kilos de comida que comen los animales en total: ");
			kilosComida=sc.nextInt(); //Le decimos al sistema que lea el número de kilos que comen los perros introducido por el usuario
			// Calculamos la racion que le corresponde a cada animal, dividiendo el numero de comida comprada entre el número de animales
			racion=comidaComprada/numAnimales;
			// Declaramos que si el número de comida comprada y los kilos de comida que comen en total son iguales, le decimos al usuario que tiene comida suficiente
			if (comidaComprada==kilosComida || comidaComprada>kilosComida) {
				System.out.println("Se dispone de alimento suficiciente para cada animal");
			} else { //Si la condición anterior no se cumple le decimos al usuario que no tiene comida suficiente y le calculamos la ración para cada animal
				System.out.println("La ración para cada animal es: "+racion+" kg.");
			}
					sc.close(); //Cerramos el scanner
				}
				
			}

