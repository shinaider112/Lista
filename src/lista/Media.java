/**

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Wendell Neander

* Data: 29/11/2016

* Repositório: https://github.com/shinaider112/Lista.git

*/

package lista;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0, media = 0;
		
		System.out.println("Digite a nota: ");
		n1 = s.nextDouble();
		
		System.out.println("Digite a nota: ");
		n2 = s.nextDouble();
		
		System.out.println("Digite a nota: ");
		n3 = s.nextDouble();
		
		System.out.println("Digite a nota: ");
		n4 = s.nextDouble();
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Media: " + media);
		
		if(media >= 6){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
		

	}
}
