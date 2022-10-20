package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
//Para comprobar que el código es correcto hemos sumado incorrectamente el número que el sistema nos ha dado y este nos devuelve que la suma no es correcta. Y al introducir la suma correcta de los números aleatorios que nos da el sistema, el sistema nos da la enhorabuena por hacer el cálculo correctamente.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las variables num1 y num2 que serán los dos números aleatorios que saldrán para que el usuario realice la suma
				// Declaramos las variable sumaUsuario que es la suma que realiza el usuario de los dos números aleatorios
				int num1; //primer número aleatorio
				int num2; //Segundo número aleatorio
				int sumaUsuario; //El numero que introduce el usuario, que es la suma total de los dos números aleatorios
				// Le decimos al sistema que muestre dos números aleatorios al usuario a través de la función Math.random()
				num1= (int) (Math.random()*99);
				num2= (int) (Math.random()*99);
				//Introducimos e importamos el scanner para poder leer el teclado 
				Scanner sc = new Scanner(System.in);
				// Le pedimos por favor al usuario que realice la suma de los dos números aleatorios que le ha mostrado el programa
				System.out.println("Por favor realice la suma del número "+num1+" y del número "+num2);
				sumaUsuario=sc.nextInt();
				//Declaramos que si la suma de los dos números aleatorios es igual al resultado de suma introducido por el usuario es correcto, el sistema devuelva al usuario el mensaje de enhorabuena por hacer la suma correctamente 
				if (sumaUsuario==num1+num2) {
					System.out.println("La respuesta es correcta, usted ha realizado la suma de los dos números correctamente. ¡ENHORABUENA!");
				} else { //En caso de que el usuario no haya introducido bien la suma, el sistema le dirá que la suma es incorrecta y se le muestra el resultado
					System.out.println("¡LO SIENTO! La respuesta no es correcta, el resultado es "+(num1+num2));
				}
				//Le mostramos al usuario si su operación es correcta , y si no es, le mostramos el resultado
				sc.close(); //cerramos el scanner

			}
}

