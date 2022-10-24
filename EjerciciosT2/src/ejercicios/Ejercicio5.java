package ejercicios;

import java.util.Scanner;
// Para comprobar que el código es correcto he introducido en el teclado EL NÚMERO -5 y el sistema me calcula correctamente su valor absoluto, por tanto me devuelve 5.Y al introducir un número positivo como el 8, me devuelve otro número positivo, el 8.
public class Ejercicio5 {

	public static void main(String[] args) {
	
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
