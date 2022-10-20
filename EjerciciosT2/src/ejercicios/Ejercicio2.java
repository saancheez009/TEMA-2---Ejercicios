package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
//Para comprobar que el código es correcto , he introduido número de Dni reales y he comprobado si el cálculo de la letra es correcto.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las variables NumDni que corresponde al número del dni y letra que corresponde a la letra resultante del dni
		int NumDNI; //Corresponde al número del Dni introducido por el usuario
		int letra; //Corresponde a la letra calculada por el sistema
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca su número de Dni para calcular la letra
		System.out.println("Por favor introduzca su número de dni (8 digitos)");
		NumDNI=sc.nextInt(); // Le pedimos al sistema que lea el número introducido por el usuario
		
		letra=NumDNI%23; //Declaramos que el cálculo de la letra es igual al resto de la división del número introducido entre 23
		// Para cada resultado del cálculo realizado anteriormente le asiganmos una letra mediante switch
		switch (letra) {
			case 0:
				System.out.println("T");
				break;
			case 1:
				System.out.println("R");
				break;
			case 2:
				System.out.println("W");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("G");
				break;
			case 5:
				System.out.println("M");
				break;
			case 6:
				System.out.println("Y");
				break;
			case 7:
				System.out.println("F");
				break;
			case 8:
				System.out.println("P");
				break;
			case 9:
				System.out.println("D");
				break;
			case 10:
				System.out.println("X");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("N");
				break;
			case 13:
				System.out.println("J");
				break;
			case 14:
				System.out.println("Z");
				break;
			case 15:
				System.out.println("S");	
				break;
			case 16:
				System.out.println("Q");
				break;
			case 17:
				System.out.println("V");
				break;
			case 18:
				System.out.println("H");
				break;
			case 19:
				System.out.println("L");
				break;
			case 20:
				System.out.println("C");
				break;
			case 21:
				System.out.println("K");
				break;
			case 22:
				System.out.println("E");
				break;
		} //Le mostramos al usuario la letra que le corresponde a su número de dni
		sc.close(); // Cerramos el scanner
	}

}
