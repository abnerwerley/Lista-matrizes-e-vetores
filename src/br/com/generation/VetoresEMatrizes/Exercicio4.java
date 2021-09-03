package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {
//Exercício 4 | Author: Abner Werley | Date: 03/09/2021

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		double soma = 0.0, somaDiagonal;

		System.out.println("Insira os valores pra matriz:");
		for (int l = 0; l < matriz.length; l++) {

			for (int c = 0; c < matriz[l].length; c++) {

				matriz[l][c] = entrada.nextDouble();
				soma = soma + matriz[l][c];
			}
		}

		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];

		System.out.println("Soma dos valores: " + soma + ".");
		System.out.println("Soma da diagonal principal: " + somaDiagonal + ".");
		entrada.close();
	}
}
