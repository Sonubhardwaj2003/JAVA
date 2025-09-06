package javaClass.Programs_st2;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void print1(String s) {
		System.out.println(s);
	}

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Rahul", "Riya", "Pooja", "Ketan");

	//	names.forEach(x -> System.out.println(x)); // Lambda Expression

		names.forEach(MethodReference::print1); // for static method

	//	names.forEach(new MethodReference()::print1); // for instance method

	}
}
