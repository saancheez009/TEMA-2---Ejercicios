package ejercicios;

import java.util.Scanner;
//Para comprobar que el programa funciona correctamente, hemos introducido una distancia mayor a 800km y una estancia mayor a 7 días para que así se realice el descuento, al hacer esto, el sistema nos ha devuelto el valor del billete con un descuento del 30% aplicado.
//Luego hemos introducido una estancia menor de 800km y una estancia menor a 7 días y el systema nos ha calculado el precio total del billete sin descuento ya que no cumple los requisitos del descuento
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducimos las variables distancia, días que son las que introducirá el usuario. Luego introducimos las variables para calcular el precio del billete ( variables: descuento, precioN y precioD)
		//Declaramos también la constante precio, que es el precio por km recorrido
		int distancia; //La distancia en km que el usuario ha introducido
		int dias; //Los dias de estancia en el tren que el usuario ha introducido
		double descuento;  // Cálculo del porcentaje del descuento del 30% en el precio
		final double precio; //Constante del precio que es 2,5 euros
		double precioN; //Precio sin descuento
		double precioD; //Precio con descuento
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que por favor introduzca la distancia que desea recorrer
		System.out.println("Por favor introduzca la distancia a recorrer: ");
		distancia=sc.nextInt();
		//Le pedimos al usuario que por favor introduzca el número días que desea estar en el tren
		System.out.println("Por favor introduzca el número de días de estancia: ");
		dias=sc.nextInt();
		// Le damos el valor a la constante precio
		precio= 2.5;
		// Calculamos el precio normal,( sin decuento), multiplicandole a la distancia los euros que cuesta cada km
		precioN= distancia*precio;
		// Calculamos el monto de descuento que se le haría al precio total normal. Para ello multiplicamos el precio total normal por 0*3 
		descuento= 0.3*precioN; 
		//Al precio normal total se le resta el monto del descuento calculado . Esto nos da resultado del precio con el descuento
		precioD= precioN-descuento;
		//Declaramos que si la distancia es mayor a 800km y los números de días de estancia son más de 7, el cliente obtendrá un descuento del 30% en el precio total
		if (distancia>800 && dias>7) {
			System.out.println("El precio de su billete es de "+precioD+" euros. Ha obtenido un 30% de descuento al superar los 7 días de estancia y los 800km");
		} else { //En caso de no cumplirse lo condicionado, el cliente no obtendrá descuento y el total del precio será la distancia multiplicada por 2,5 que es el precio de cada km
			System.out.println("El precio de su billete es de "+precioN+" euros.");
			
		} //Le mostramos al usuario el precio final de su billete
		
		sc.close(); // Cerramos el scanner
	}

}
