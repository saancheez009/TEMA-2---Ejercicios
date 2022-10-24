package ejercicios;

import java.util.Scanner;
// Para probar si el código es correcto y hace lo requerido (mostrar la hora sumándole un segundo), he introducido 3h , 30 min y 15 seg, y me ha devuelto 3h , 30min y 16 seg
// Luego heintroducido la hora: 5h 59min y 59 seg , y me ha devuelto 6h 0min y 0seg ya que al sumarle un seg a 59 se convierte en un min y al tener 59 min al sumarle ese min, se convierte en una hora
// Finalmente he introducido 2h 40 min y 59seg, el sistema me ha devuelto 2h 41 min y 0 seg ya que al sumarle 1 seg a 59 se convierte en un min.
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables horas, minutos y segundos, estas serán introducidas por el usuario mediante el teclado
		int horas; // horas introducidas por el usuario
		int minutos;  //minutos introducidos por el usuario
		int segundos; //segundos introducidos por el usuario
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		// 	Le pedimos al usuario que por favor introduzca una horqa para poder sumarle un segundo
		System.out.println("Por favor introduzca la hora en el siguiente orden (horas, minutos y segundos): ");
		horas=sc.nextInt();   //Le deecimos al sistema que lea la hora introducida por el usuario
		minutos=sc.nextInt(); //Le decimos al sistema que lea los minutos introducidos por el usuario
		segundos=sc.nextInt(); //Le decimos al sistema que lea los segundos introducidos por el usuario 
		//Declaramos que si los minutos y segundos son igual a 59, el sistema añadirá una hora ya que si a 59 seg le sumas un seg da un minuto y si tenemos 59 min y le sumamos un minuto, nos resulta una hora
		if (horas<24 && minutos==59 && segundos==59) {
			System.out.println("La hora introducida más un segundo es: "+(horas+1)+" horas "+(minutos*0)+" minutos "+(segundos*0)+" segundos");
		//Declaramos que si los segundos son 59, al sumarle un segundo da un minuto y se le suma a la hora que el usuario que ha introducido un minuto
		} else if (segundos==59) {
			System.out.println("La hora introducida más un segundo es: "+horas+" horas "+(minutos+1)+" minutos "+(segundos*0)+" segundos"); 
		} else { //Sumamos a los segundos un segundo más.
			System.out.println("La hora introducida más un segundo es: "+horas+" horas "+minutos+" minutos "+(segundos+1)+" segundos");
		} //Se le muestra al usuario el resultado de la hora más un segundo
		sc.close();//Cerramos el scanner
	}

}
