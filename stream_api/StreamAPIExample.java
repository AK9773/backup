package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Aman");
		name.add("Amit");
		name.add("Ajay");
		name.add("Vishal");
		name.add("Gaurav");
		name.add("Sonu");
		//List<String> collect = name.stream().filter(str->str.startsWith("A")).collect(Collectors.toList());
		
		//System.out.println(collect);
		name.stream().findFirst().ifPresent(System.out::println);
		long count = name.stream().count();
		System.out.println(count);

		List<Integer> number = Arrays.asList(81, 24, 43, 41, 52, 64, 37, 48, 39, 10, 11, 12);
		Integer max = number.stream().max(Integer::compare).get();
		System.out.println(max);

		number.stream().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		List<Integer> numberInDescendingOrder = number.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted List: " + numberInDescendingOrder);
		System.out.println("Orginal List: " + number);
		
		number.stream().sorted().filter(n->n%2==0).collect(Collectors.toList()).forEach(n->System.out.print(n+ "  "));
		
		List<String> name2= new ArrayList<String>();
		for(String s:name) {
			if (s.startsWith("A")) {
				name2.add(s.concat(" Kumar"));
			}			
		}
		//List<String> name2 = name.stream().filter(str->str.startsWith("A")).map(m->m.concat(" Kumar")).collect(Collectors.toList());
		System.out.println(name2);
		System.out.println("************");
		
		System.out.println(number);
		List<Integer> pass= new ArrayList<>();
		List<Integer> fail= new ArrayList<>();
		number.stream().sorted().map(i -> {if (i<33) {return fail.add(i+10);}else{return pass.add(i);}}).collect(Collectors.toList());
		System.out.println("Passed Students Marks"+ pass);
		System.out.println("Failed Students Marks"+ fail);
		
		
		System.out.println("*********");
		List<Student> students= new ArrayList<Student>();
		students.add(new Student("Aman",1,25));
		students.add(new Student("Vikram",2,27));
		students.add(new Student("Sourav",3,20));
		students.add(new Student("Gaurav",4,21));
		students.add(new Student("Vinay",5,28));
		students.add(new Student("Praful",6,22));
		System.out.println(students);
		
		List<Student> collect = students.stream().filter(i->i.getAge()>=25).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}

}
