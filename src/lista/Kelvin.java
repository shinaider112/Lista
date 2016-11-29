package lista;

import java.util.Scanner;

public class Kelvin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double celsius;
		
		System.out.println("Digite a temperatura em celsius: ");
		celsius = s.nextInt();
		
		System.out.println("A temperatura em kelvin e: " +  (celsius +  273.15));

	}

}
