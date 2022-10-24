package ejercicios;

import java.util.Scanner;
// Para comprobar que el código es correcto he introducido en el teclado un número negativo y el sistema me calcula correctamente su valor absoluto.Y al introducir un número positivo me devuelve otro número positivo
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimos la variable num, que es el número que introducirá el usuario por el teclado
		
		int num; //Número introducido por el usuario
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que por favor introduzca un número para calcular su valor absoluto.
		
		System.out.println("Por favor introduzca un número para calcular su valor absoluto: ");
		num=sc.nextInt();
		//Para el cálculo del valor absoluto utilizamos un operador ternario en el que declaramos que si el número es nagativo, este será multiplicado por otro negativo para dar un número positivo, que sería su número absoluto.
		num= num <= 0 ? num*-1 : num;
		//Le mostramos al usuario el número absoluto
		System.out.println("El valor absoluto del número introducido es: "+num);
		
		sc.close(); //Cerramos el scanner
	}

}
