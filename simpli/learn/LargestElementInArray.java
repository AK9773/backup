package simpli.learn;

public class LargestElementInArray {

	public static void main(String[] args) {
		int number[]= {12,23,52,21,24,26,56};
		int largest=number[0];
		for (int i = 1; i < number.length; i++) {
			if(largest<number[i]) {
				largest=number[i];
			}
		}
		System.out.println("Largest Number in the Array: "+ largest);

	}

}
