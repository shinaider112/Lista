/**

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Wendell Neander

* Data: 29/11/2016

* Repositório: https://github.com/shinaider112/Lista.git

*/

package lista;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double celsius;
		
		System.out.println("Digite a temperatura em celsius: ");
		celsius = s.nextInt();
		
		System.out.println("A temperatura em fahrenheit e: " + (9 * celsius + 160)/5);

	}

}
