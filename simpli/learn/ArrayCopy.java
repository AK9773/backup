package simpli.learn;

public class ArrayCopy {

	public static void main(String[] args) {
		String students[]= new String[7];
		students[0]="Aman";
		students[1]="Amit";
		students[2]="Ajay";
		students[3]="Sarthak";
		students[4]="Aryan";
		students[5]="Arun";
		students[6]="Anuj";
		String newArray[]= new String[students.length];
		for (int i = 0; i < students.length; i++) {
			newArray[i]=students[i];
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

	}

}
