package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {
//Exercício 1 | Author: Abner Werley | Date: 03/09/2021

	public static void main(String[] args) {

		double[] valores = new double[5];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a pontuação das 5 atividades:");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = entrada.nextDouble();
		}

		System.out.println("As notas foram: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}

		entrada.close();
	}
}
