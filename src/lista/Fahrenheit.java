package lista;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double fahrenheit;
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		fahrenheit = s.nextInt();
		
		System.out.println("A temperatura em celsius e: " + (( fahrenheit - 32)*5)/9);

	}

}
