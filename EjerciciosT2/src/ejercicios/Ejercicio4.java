package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	// Para comprobar que el código es correcto, hemos introducido números del 10 al 29 y nos ha devuelto el número introducido correctamente
	// Luego hemos introducidos varios numeros a partir del 30 y nos ha devuelto el número escrito correctamente
	// 30 -->TREINTA
	//25 --> VEINTICINCO

		public static void main(String[] args) {
		
			
			//Declaramos las variables num , num1 y num2
			int num; //Número introducido por el usuario
			int num1; //Primer número del número que ha introducido el usuario , es decir si el usuario introduce 78, el num1 es 7
			int num2; //Segundo número del número que ha introducido elusuario, si ha introducido 56, el num2 es 6
			String letra=null; //número escrito que se mostrará al usuario
			//Introducimos e importamos el scanner para leer el teclado
			Scanner sc = new Scanner(System.in);
			// Le pedimos al usuario que introduzca un número comprendido entre 1 y 99
			System.out.println("Por favor introduzca un número comprendido entre 1 y 99");
			num=sc.nextInt(); //Leemos el numero intoducido por el usuario 
			if(num<29) { //Declaramos que si el número es menor a 29 se lee como asignamos a cada numero mediante switch
			switch (num) {
			case 1:
				letra=("uno");
				break;
			case 2:
				letra=("dos");
				break;
			case 3:
				letra=("tres");
				break;
			case 4:
				letra=("cuatro");
				break;
			case 5:
				letra=("cinco");
				break;
			case 6:
				letra=("seis");
				break;
			case 7:
				letra=("siete");
				break;
			case 8:
				letra=("ocho");
				break;
			case 9:
				letra=("nueve");
				break;
			case 10:
				letra=("diez");
				break;
			case 11:
				letra=("once");
				break;
			case 12:
				letra=("doce");
				break;
			case 13:
				letra=("trece");
				break;
			case 14:
				letra=("catorce");
				break;
			case 16:
				letra=("dieciseis");	
				break;
			case 17:
				letra=("diecisiete");
				break;
			case 18:
				letra=("dieciocho");
				break;
			case 19:
				letra=("diecinueve");
				break;
			case 21:
				letra=("veintiuno");
				break;
			case 22:
				letra=("veintidos");	
				break;
			case 23:
				letra=("veintitres");
				break;
			case 24:
				letra=("veinticuatro");
				break;
			case 25:
				letra=("veinticinco");
				break;
			case 26:
				letra=("veintiseis");
				break;
			case 27:
				letra=("veintisiete");	
				break;
			case 28:
				letra=("veintiocho");
				break;
			case 29:
				letra=("veintinueve");
				break;
			
			
		}  
			} else {
				num1= (int) num/10; //Esto nos mostrara el primer numero del numero, si es 89, el num1 es 8
				num2=num%10; // Esto nos muestra el segundo numero del numero introducido, por ejemplo si es 67, nos muestra 7
			// Le damos a los num1 un valor de una letra mediante switch
			switch (num1) {
				case 3:
					letra="treinta";
					break;
				case 4:
					letra="cuarenta ";
					break;
				case 5:
					letra="cincuenta";
					break;
				case 6:
					letra="sesenta";
					break;
				case 7:
					letra="setenta";
					break;
				case 8:
					letra="ochenta";
					break;
				case 9:
					letra="noventa";
					break;
				
					}
			switch (num2) { //Le damos al num2 un valor de una letra mediante un switch, este numero se agrega al num1
				
			case 1:
				letra+=(" y uno");
				break;
			case 2:
				letra+=(" y dos");
				break;
			case 3:
				letra+=(" y tres");
				break;
			case 4:
				letra+=(" y cuatro");
				break;
			case 5:
				letra+=(" y cinco");
				break;
			case 6:
				letra+=(" y seis");
				break;
			case 7:
				letra+=(" y siete");
				break;
			case 8:
				letra+=(" y ocho");
				break;
			case 9:
				letra+=(" y nueve");
				break;
			case 0:
				letra+="";
				break;
				
			}
			} // En una excepción declaramos que si el usuario introduce 20 le devolvemos el número 20 escrito
			if(num==20) {
				letra="veinte";
			} //Le mostramos al usuario el número que ha introducido escrito
			System.out.println(letra);
			
		
		sc.close(); //cerramos el scanner

	}
}