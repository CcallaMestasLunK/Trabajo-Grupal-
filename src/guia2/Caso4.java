package guia2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer numero : ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		int num2 = sc.nextInt();
		System.out.print("Ingrese tercer numero: ");
		int num3 = sc.nextInt();
		System.out.print("Ingrese cuarto numero: ");
		int num4 = sc.nextInt();
		
		if (num1 == num2 && num2 == num3 && num3 == num4)
			System.out.println("Los numeros son iguales");
		else if(num1 < num2 && num1 < num3 && num1 < num4)
			System.out.println("El primer numero es menor");
		else if(num2 < num1 && num2 < num3 && num2 < num4)
			System.out.println("El segundo numero es menor");
		else if(num3 < num1 && num3 < num2 && num3 < num4)
			System.out.println("El tercer numero es menor");
		else
			System.out.println("El cuarto numero es el menor");

	}

}
