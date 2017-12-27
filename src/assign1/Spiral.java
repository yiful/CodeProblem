package assign1;

import java.io.PipedReader;

public class Spiral {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9},{10,11,12}}; 
		//printSpiralArray(matrix); 
		 int[][] matrix2 = getSpiralMatrix(4);
		 printMatrix(matrix2); 
	}

	private static void printMatrix(int[][] matrix2) {
		for(int[] array : matrix2) {
			for(int num : array) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	private static int[][] getSpiralMatrix(int n) {
		int[][] matrix = new int[n][n]; 
		int i=0, j=0; 
		int row=n, col = n; 
		int num = 1;
		while(row>0 && col>0) {
			for(int k = 0; k<col; k++) {
				matrix[i][j] = num; 
				j++; 
				num++; 
			}
			j--;
			row--; 
			for(int k = 0; k<row; k++) {
				i++; 
				matrix[i][j] = num; 
				num++;
			}
			col--; 
			for(int k = 0; k<col; k++) {
				j--; 
				matrix[i][j] = num; 
				num++; 
			}
			row--; 
			for(int k=0; k<row; k++) {
				i--; 
				matrix[i][j] = num; 
				num++; 
			}
			col--; 
			j++; 
		}
		return matrix; 
	}
	
	private static void printSpiralArray(int[][] matrix) {
		int i=0,j=0;
		int m = matrix.length; 
		int n = matrix[0].length; 
		while(m>0 && n>0) {
			for(int k = 0; k < n; k++) {
				System.out.print(matrix[i][j]+" ");
				j++;
			}
			j--;
			m--; 
			for(int k = 0; k < m; k++) {
				i++;
				System.out.print(matrix[i][j]+" ");
			}
			n--; 
			for(int k = 0; k < n; k++) {
				j--;
				System.out.print(matrix[i][j]+" ");
			}
			m--;
			for(int k = 0; k < m; k++) {
				i--;
				System.out.print(matrix[i][j]+" ");
			}
			j++;
			n--;
		}
	}
}
