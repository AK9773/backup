package simpli.learn;

public class ArrayExample {
	public static void main(String[] args) {

		int numbers[] = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		/* int numbers[]= {12,21,23,14,51,36}; */

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("**************************");
		System.out.println("2D Array");
		int array2D[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array2D[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		System.out.println("3D Array");
		int array3D[][][] = {{ { 1, 2, 3 }, { 4, 5, 6 }}, {{ 7, 8, 9 }, { 10, 11, 12 }} };

		System.out.println(array3D[0][1][2]);
	}

}
