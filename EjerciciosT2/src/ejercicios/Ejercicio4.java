package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num1;
		int num2;
		String letra=null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número comprendido entre 1 y 99");
		num=sc.nextInt();
		if(num<16) {
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
		case 15:
			letra=("quince");	
			break;
		
	} 
		} else {
			num1= (int) num/10;
			num2=num%10;
		
		switch (num1) {
			case 1:
				letra="dieci";
				break;
			case 2:
				letra="veinti y";
				break;
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
		switch (num2) {
			
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
		}
		if(num==20) {
			letra="veinte";
		}
		System.out.println(letra);
	}
}
