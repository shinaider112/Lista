package lista;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double distancia, tempo, velocidade;
		
		System.out.println("Digite o tempo gasto em horas: ");
		tempo = s.nextDouble();
		
		System.out.println("Digite a velocidade media em km/h: ");
		velocidade = s.nextDouble();
		
		distancia = tempo * velocidade;
		System.out.println("A distancia percorrida em km/h: " + distancia);
		System.out.println("Total de litros gastos : " + distancia/12);

	}

}
