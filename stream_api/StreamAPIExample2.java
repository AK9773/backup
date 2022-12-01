package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample2 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(12, 23, 35, 36, 27, 28);
		number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
