package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 {
//Exercício 3 | Author: Abner Werley | Date: 03/09/2021
	public static void main(String[] args) {

		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6];
		double[][] m2 = new double[4][6];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira os valores para N1: ");
		for (int l = 0; l < n1.length; l++) {

			for (int c = 0; c < n1[l].length; c++) {
				// n1[l][c]= Math.round(Math.random());
				n1[l][c] = entrada.nextDouble();
			}

		}

		System.out.println("Insira os valores para N2: ");
		for (int l = 0; l < n2.length; l++) {

			for (int c = 0; c < n2[l].length; c++) {
				// n1[l][c]= Math.round(Math.random());
				n2[l][c] = entrada.nextDouble();

				m1[l][c] = n1[l][c] + n2[l][c];

				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}

		// os dois for's seguintes escreverão m1 e m2
		System.out.println("M1 = N1+N2:");
		for (int l = 0; l < m1.length; l++) {

			for (int c = 0; c < m1[l].length; c++) {
				System.out.print(m1[l][c] + "  ");
			}
			System.out.println();
		}

		System.out.println("M2 = N1-N2:");
		for (int l = 0; l < m2.length; l++) {

			for (int c = 0; c < m2[l].length; c++) {
				System.out.print(m2[l][c] + "  ");
			}
			System.out.println();
		}

		entrada.close();
	}
}
