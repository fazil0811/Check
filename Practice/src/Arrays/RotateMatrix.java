package Arrays;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//		  for (int[] row : a) {
//	            for (int value : row) {
//	                System.out.print(value + " ");
//	            }
//	            System.out.println(); // Print a new line after each row
//	        }
//	    }
//	}