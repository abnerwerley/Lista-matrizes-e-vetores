package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {
//Exerc�cio 4 | Author: Abner Werley | Date: 03/09/2021

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[][] matriz = new double[3][3]; // matriz 3x3
		double soma = 0.0, somaDiagonal; // declara��o de vari�veis

		System.out.println("Insira os valores pra matriz:");
		for (int l = 0; l < matriz.length; l++) {// esse for vai ler os valores digitados pelo usu�rio, preenchendo a
													// matriz

			for (int c = 0; c < matriz[l].length; c++) {

				matriz[l][c] = entrada.nextDouble();
				soma += matriz[l][c]; // sempre que for acrescentado um novo valor, ele vai ser acrescentado �
				// soma = soma+ matriz[l][c]; // soma
			}
		}

		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]; // a diagonal principal nessa matriz � a que est� na
																	// posi��o 0,0; 1,1; 2,2;

		System.out.println("Soma dos valores: " + soma + "."); // mostra a soma
		System.out.println("Soma da diagonal principal: " + somaDiagonal + "."); // mostra soma da diagonal principal
		entrada.close();
	}
}
