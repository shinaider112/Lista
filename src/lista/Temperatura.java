package lista;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double fahrenheit, celsius, kelvin;
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		fahrenheit = s.nextInt();
		
		celsius = (( fahrenheit - 32)*5)/9;
		kelvin = (celsius +  273.15);
		System.out.println("A temperatura em kelvin e: " + kelvin);

	}
	
}
