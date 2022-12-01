package array;

import java.util.Scanner;

//Array can hold similar data type elements, null and repeating element

public class ArrayExample {

	public static void main(String[] args) {

		String[] studentsName = new String[7];

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter Array Elements:"); for (int i = 0; i < 7; i++) {
		 * studentsName[i] = scanner.nextLine(); } scanner.close(); for (String str :
		 * studentsName) { System.out.print(str + ", "); }
		 */

		studentsName[0] = "Aman Kumar";
		studentsName[1] = "Amit Kumar";
		studentsName[2] = "Ajay Kumar";
		studentsName[3] = "Aryan Kumar";
		studentsName[4] = "Vishal Kumar";
		studentsName[5] = "Arun Kumar";
		studentsName[6] = "Gaurav Kumar";

		for (String str : studentsName) {
			System.out.print(str + ", ");
		}
		System.out.println();

		String[] student = { "Aman Kumar", "Amit Kumar", "Ajay Kumar", "Aryan Kumar", "Vishal Kumar", "Arun Kumar",
				"Gaurav Kumar", null };
		student[0] = "Aman";
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}

		System.out.println(student.getClass().getSimpleName());

	}

}
