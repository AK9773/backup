package simpli.learn;

public class ArrayFrequencyOfElements {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 5, 3, 4, 1, 2, 3, 2, 3, 1, 3, 4 };
		int[] frequency = new int[numbers.length];
		int visited = 1;
		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited) {
				frequency[i] = count;
			}
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited) {
				System.out.println(numbers[i] + ": " + frequency[i]);
			}
		}

	}

}
