public class RotateArray {
	public static void main(String[] args) {
		int[][] myArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
		rotateArray(myArray);
		printArray(myArray);

	}


	public static int[][] rotateArray(int[][] turnedArray) {

		for (int i = 0; i < turnedArray.length; i++) {
			for (int j = i; j < turnedArray[j].length; j++) {
				int temp = turnedArray[i][j];
				turnedArray[i][j] = turnedArray[j][i];
				turnedArray[j][i] = temp;
			}
		}

		return turnedArray;
	}


	public static int[][] printArray(int[][] myNewArray) {
		for (int i = 0; i < myNewArray.length; i++) {
			for (int j = 0; j < myNewArray[i].length; j++) {
				System.out.print(myNewArray[i][j] + " ");
			}
			System.out.println();
		}
		return myNewArray;
	}
}
