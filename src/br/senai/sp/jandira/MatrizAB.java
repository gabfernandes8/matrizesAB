package br.senai.sp.jandira;

import java.util.Scanner;

public class MatrizAB {

	public static void main(String[] args) {
		
		int matrizA[] = new int[10]; 
		int matrizB[] = new int[10];
		
		matrizA[0] = 24;
		matrizA[1] = 8;
		matrizA[2] = 26;
		matrizA[3] = 15;
		matrizA[4] = 12;
		matrizA[5] = 2;
		matrizA[6] = 7;
		matrizA[7] = 19;
		matrizA[8] = 50;
		matrizA[9] = 44;
		
		for(int i = 0; i < matrizA.length; i++) {
			
			System.out.println("* Índice: " +i+ " *");
			System.out.println("Matriz A: " +matrizA[i]);
			
			if (i % 2 == 0) {
				matrizB[i] = matrizA[i] * 5;
				System.out.println("Matriz B: " +matrizA[i]+ " * 5 = " +matrizB[i]);
				
			} else {
				matrizB[i] = matrizA[i] + 5;
				System.out.println("Matriz B: " +matrizA[i]+ " + 5 = " +matrizB[i]);
			}
			
			System.out.println("");
			
		}
		
		System.out.println("***********************");
		System.out.println(" Aqui está a Matriz B: ");
		System.out.println("***********************");
		System.out.println("");
		
		for(int c = 0; c < 10; c++) {
			System.out.println(matrizB[c]);
			
		}
		
	}

}
