/**

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Wendell Neander

* Data: 29/11/2016

* Repositório: https://github.com/shinaider112/Lista.git

*/

package lista;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = s.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = s.nextInt();
		
		if(num1 > num2){
			System.out.println(num1 - num2);
		}else{
			System.out.println(num2 - num1);
		}

	}

}
