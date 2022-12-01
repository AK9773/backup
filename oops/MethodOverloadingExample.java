package oops;

//in case of MethodOverloading method signature(method name + argument type) must be different
//in case of method overriding method signature must be same and access modifier must not be decreasing in child class
// in case of MethodOverloading method resolution is done by compiler which is based on reference type
//in case of method overriding method resolution is done by JVM which is based on runtime object

class MethodOverloading {
	public void m1() {
		System.out.println("No-arg Method");
	}

	public void m1(int i) {
		System.out.println("Square: " + i * i);
	}

	public void m1(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}

	public void m1(String str) {
		System.out.println("Name: " + str);
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.m1();
		methodOverloading.m1(5);
		methodOverloading.m1(5, 6);
		methodOverloading.m1("Aman Kumar");

	}

}
