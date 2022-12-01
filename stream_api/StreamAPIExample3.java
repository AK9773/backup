package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample3 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Aman", 1, 26));
		students.add(new Student("Vishal", 2, 23));
		students.add(new Student("Gaurav", 3, 22));
		students.add(new Student("Amit", 4, 29));
		students.add(new Student("Sarthak", 5, 4));
		//System.out.println(students);

		List<String> newList = students.stream().filter(s-> s.getAge()<30).map(s->s.getName()).sorted().collect(Collectors.toList());
		System.out.println(newList);
	}

}
