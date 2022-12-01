package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample4 {

	public static void main(String[] args) {
		List<Product> products= new ArrayList<Product>();

		products.add(new Product(1,"Laptop",70000,123,"Aman"));
		products.add(new Product(2,"Mouse",700,124,"Aman"));
		products.add(new Product(3,"Fan",7000,125,"Ajay"));
		products.add(new Product(4,"Mobile",8000,126,"Aryan"));
		products.add(new Product(5,"Charger",500,127,"Aryan"));
		products.add(new Product(6,"Fridge",7500,128,"Amit"));
		products.add(new Product(7,"Cooler",6500,121,"Amit"));
		products.add(new Product(8,"Chairs",3500,122,"Sarthak"));
		products.add(new Product(9,"Table",2500,129,"Sarthak"));
		products.add(new Product(10,"Bike",95000,130,"Gaurav"));
		//System.out.println(products);
		
		Map<String, List<Product>> collect = products.stream().filter(p-> p.getProductCost()>6000).collect(Collectors.groupingBy(p->p.getCustomerName()));
		//long sum = newList.stream().mapToInt(p->p).summaryStatistics().getSum();
		System.out.println(collect);
		
		//Stream.iterate(1, i->i+1).map(i->i*5).limit(10).forEach(System.out::println);
	}

}
