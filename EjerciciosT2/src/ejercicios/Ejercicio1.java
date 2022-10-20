package ejercicios;

import java.util.Scanner;

/*He realizado una primera prueba introduciendo el número 2002 y el sistema me ha devuelto que el número es capicúa. Luego he realizado otra prueba introduciendo el número 4586 y el sistema me devuelve que el número no es capicúa*/
/*Al introducir el número 367474 el sistema me ha devuelto que El valor introducido no corresponde a los datos requeridos ya que al ser un número mayor a 9999, el sistema no podrá resolverlo*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimos las variales num, cociente, cociente1, cociente2, y resto mediante int
		
		int num; //Esta variable es el número que introduce el usuario por teclado
		int cociente; //Esta variable es el resultado de la división del número introducido por el usuario entre 10
		int resto; //Esta variable es el resultado de el cálculo del resto de la división del numero introducido por el usuario entre 10
		int cociente1; //Esta variable es el resultado de la división del número introducido por el usuario entre 100 
		int cociente2; //Esta variable es el resultado de la división del número introducido por el usuario entre 1000
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca un número comprendido entre 0 y 9999 para saber si es capicúa, un número es capicúa cuando al leerlo de derecha a izquierda se lee igual que si lo leemos de izquierda a derecha.
		System.out.println("Por favor introduzca un número comprendido entre 0 y 9999: ");
		num=sc.nextInt(); 
		//Declaramos que el cociente es igual a la división del número introducido por el usuario entre 10
		cociente=num/10;
		//Declaramos que el resto es igual al resto de la división del número introducido por el usuario entre 10
		resto=num%10;
		//Declaramos que el cociente1 es igual a la división del número introducido por el usuario entre 100
		cociente1=num/100;
		//Declaramos que el cociente2 es igual a la división del número introducido por el usuario entre 1000
		cociente2=num/1000;
		//Utilizamos el condicional if para saber si el número es capicúa
		if (num>=0 && num<10) { //Declaramos que si el número es mayor o igual a 0 el número es capicúa, tambín si el número es menor que cero se cumple esto
			System.out.println("El número introducido es capicúa");
		} else if(num>10 && num<100 && cociente==resto) { //Declaramos que si el número es mayor que diez, menor que 100 y su cociente (división del número introducido entre 10 al ser decena) es igual al resto(el resto de la división del numero introducido entre 10), el número es capicúa
				System.out.println("El número introducido es capicúa");
			} else if (num>=100 && num<1000 && cociente1==resto) {  //Declaramos que si el número es mayor que 100, menor que 1000 y su cociente (división del número introducido entre 100 al ser centena) es igual al resto(el resto de la división del numero introducido entre 10), el número es capicúa
					System.out.println("El número introducido es capicúa");
			} else if (num>=1000 && num<10000 && cociente2==resto) {  //Declaramos que si el número es mayor que 1000, menor que 10000 y su cociente (división del número introducido entre 1000 al ser milesima) es igual al resto(el resto de la división del numero introducido entre 10), el número es capicúa
					System.out.println("El número introducido es capicúa");
				} else if (num>9999 || num<0) {
			System.out.println("El valor introducido no corresponde a los datos requeridos"); //Declaramos que si el número introducido por el usuario es mayor a 9999 y menor a 0 el sistema no será resuelto al dar un valor que no se ha pedido
		} else  { //Declaramos que si ninguna de las condiciones anteriores se cumple, el systema nos dice que el número no es capicúa
			System.out.println("El número introducido no es capicúa");
		}
		//Le decimos al usuario si su número es capicúa o no
		sc.close(); //cerramos el scanner
			}
		} 
	

	

