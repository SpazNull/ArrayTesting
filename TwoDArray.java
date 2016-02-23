// Joshua Hale 2016
// Demonstrate a multi-dimensional arrays.

//int[3][4][2] array3D
// means Three (4x2) 2 Dimensional Arrays 

//int[4][2]
//means Four 1 dimensional arrays.

class TwoDArray {
	public static void main(String args[]) {

		TwoDArr twoD = new TwoDArr();
		System.out.println("---Declared 4x5 2D array 'twoD' location: " + twoD);
		twoD.twoDArray();// Call TwoDArr class, method twoDArray()
		TwoDAgain twoDA = new TwoDAgain();
		System.out.println("\n---Manually allocated array 'twoDA' location: " + twoDA);
		twoDA.twoDAgain();// Call TwoDAgain class, twoDAgain() method
		ThreeDArray threeDA = new ThreeDArray();
		System.out.println("\n---Dynamic allocated 3D array 'threeDA' location: " + threeDA);
		threeDA.threeDArray();// Call ThreeDArray class, threeDArray() method

	}
}

class TwoDArr {
	public void twoDArray() {
		int twoD[][] = new int[4][5];// declare and initiate array
		int i, j, k = 0;// primitive int

		// This allocates a 4 by 5 array and assigns it to twoD. Internally this
		// matrix is implemented as an array of arraysof int.

		// add values to array by nested for loop
		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;// assigns 0-19 based on loop count
				k++;// incrementer
			}

		// prints array by nested for loop
		for (i = 0; i < twoD.length; i++) {// twoD.length calls for size of
											// array and loops based on it's
											// length
			for (j = 0; j < 5; j++)
				System.out.print("|" + twoD[i][j] + "\t");
			System.out.println();
		}
	}
}

// Manually allocate differing size second dimensions.
class TwoDAgain {
	public void twoDAgain() {
		// System.out.println("Manually allocate differing size second
		// dimensions");
		int twoD[][] = new int[4][];// Declare first dimension, leave second
									// blank
		twoD[0] = new int[1];// Declare size = 1 of type int
		twoD[1] = new int[2];// size of 2
		twoD[2] = new int[3];// size of 3
		twoD[3] = new int[4];// size of 4
		int i, j, k = 0;// Primitive int's
		for (i = 0; i < twoD[3].length; i++)// Loops through array with loop
											// count based
			// on loop location
			for (j = 0; j < i + 1; j++) {
				twoD[i][j] = k;// Fills value within array
				k++;
			}
		for (i = 0; i < 4; i++) {// Loop prints values through array
			for (j = 0; j < i + 1; j++)
				System.out.print("|" + twoD[i][j] + " ");
			System.out.println();
		}
	}
}

class ThreeDArray {
	public void threeDArray() {
		// System.out.println("Dynamic 3D array.");
		// Array 3 Dimensions
		int x = 4, y = 5, z = 6;

		// Primitive Iterators
		int i, j, k;

		// Declare 3D Array
		int[][][] array3D = new int[x][y][z];

		// Access array elements
		for (i = 0; i < x; i++) {
			System.out.println("Array side: " + i);

			for (j = 0; j < y; j++) {
				System.out.println();

				for (k = 0; k < z; k++) {
					array3D[i][j][k] = (i * y * z) + (j * z) + k;
					System.out.print("\t" + array3D[i][j][k]);
				}
			}

			System.out.println('\n');
		}
	}
}