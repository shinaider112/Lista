/**

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Wendell Neander

* Data: 29/11/2016

* Repositório: https://github.com/shinaider112/Lista.git

*/

package lista;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		
		System.out.println("Digite o valor: ");
		num1 = s.nextInt();
		
		if(num1 < 0){
			System.out.println(num1 * -1);
		}

	}

}
