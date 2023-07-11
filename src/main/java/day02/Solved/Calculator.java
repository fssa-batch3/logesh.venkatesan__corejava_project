 	package day02.Solved;

public class Calculator {

	public int add(int a, int b) {
		System.out.println("Integer addition");
		return a + b;
	}

	public double add(double a, double b) {
		System.out.println("Double addition");
		return a + b;
	}

	float add(float a, float b) {
		System.out.println("Float addition");
		return a + b;
	}
	
	double add(double a, float b) {
		System.out.println("Double Float Mixed addition");
		return a + b;
	}
	double add(double a, int b) {
		System.out.println("Double Integer Mixed addition");
		return a + b;
	}
	public String add(String a, String b) {
		System.out.println("String addition");
		return a + b;
	}

	public static void main(String[] args) {

// Usage
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3)); // Output: 5
		System.out.println(calc.add(2.5, 3.7)); // Output: 6.2
		System.out.println(calc.add(2.5f, 3.7f));
		System.out.println(calc.add(2.5, 3));
		System.out.println(calc.add(2.5, 3.234356));// Output: 6.2
		System.out.println(calc.add("Hello", "World")); // Output: HelloWorld
	}
}