package simpli.learn;

import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 2, 3, 4, 6, 4, 3, 2, 1, 6, 5 };
		HashSet<Integer> duplicateNumber = new HashSet<Integer>();
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					duplicateNumber.add(number[i]);
				}
			}
		}
		System.out.println("Duplicate Elements: " + duplicateNumber);

	}

}
