/**

* Unicesumar ? Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Wendell Neander

* Data: 29/11/2016

* Reposit�rio: https://github.com/shinaider112/Lista.git

*/

package lista;

import java.util.Scanner;

public class Galao {

	public static void main(String[] args) {
		double pi = 3.141592653589793;
		double raio, area;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		raio = s.nextDouble();
		
		System.out.println("Digite a area: ");
		area = s.nextDouble();
		
		System.out.println("O volume e: "+ pi*(raio*raio)*area);
	}

}
