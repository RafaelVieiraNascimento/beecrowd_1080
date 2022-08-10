package program;

/*
beecrowd | 1080 - Maior e Posição

Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int posicao = 0;
		
		for(int i = 1; i <= 100; i++) {
		
			int valores = sc.nextInt();
			
			if(valores > maior) {
				maior = valores;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		sc.close();
	}
}
