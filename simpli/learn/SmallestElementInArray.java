package simpli.learn;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int number[]= {23,24,71,24,11,36,82,63,92};
		int smallest=number[0];
		for (int i = 1; i < number.length; i++) {
			if(smallest>number[i]) {
				smallest=number[i];
			}
		}
		System.out.println("Smallest Number in the Array: "+ smallest);
	}

}
