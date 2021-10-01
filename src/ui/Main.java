package ui;

public class Main {

	public static void main(String[] args) {
		int[][] A = new int[2][2];
		
		A[0][0] = 2;
		A[0][1] = 3;
		A[1][0] = 4;
		A[1][1] = 5;
		
		int[][] B = new int[2][2];
		
		B[0][0] = 25;
		B[0][1] = 34;
		B[1][0] = 43;
		B[1][1] = 52;
		
		int[][] C = new int[2][2];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				C[i][j] = A[i][j]+B[i][j];
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.println(C[i][j]);
			}
		}

	}

}
