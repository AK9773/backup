package simpli.learn;

public class ArrayElementSorting {

	public static void main(String[] args) {
		int number[]= {23,13,25,72,54};
		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;	
				}
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+"  ");
		}

	}

}
