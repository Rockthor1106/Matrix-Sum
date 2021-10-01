package ui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[][] A = new int[2][2];
//		
//		A[0][0] = 2;
//		A[0][1] = 3;
//		A[1][0] = 4;
//		A[1][1] = 5;
//		
//		int[][] B = new int[2][2];
//		
//		B[0][0] = 25;
//		B[0][1] = 34;
//		B[1][0] = 43;
//		B[1][1] = 52;
//		
//		int[][] C = new int[2][2];
//		
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A.length; j++) {
//				C[i][j] = A[i][j]+B[i][j];
//			}
//		}
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A.length; j++) {
//				System.out.println(C[i][j]);
//			}
//		}
		System.out.println("Please type a nomber to the amount of components for the two vectors");
		
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		System.out.println("Introduce the values for the first vector");
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Introduce the values for the second one");
		
		for (int i = 0; i < A.length; i++) {
			B[i] = sc.nextInt();
		}	
		
		System.out.println("Answer");
		int aux = 0;
		int answer = 0;
		for (int i = 0; i < A.length; i++) {
			aux = A[i]*B[i];
			answer += aux;
		}
		System.out.println(answer);
	}

}
