package javaClass.Programs_st2;

import java.util.Arrays;
import java.util.List;

//Iterating through List

public class ForEachExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// Using forEach with a lambda expression
		names.forEach(n -> System.out.println(n));

		// Using forEach with a method reference
	//	names.forEach(System.out::println);
	}
}

/*
//Iterating through Stream

import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        // Using forEach with a lambda expression to print each number
        numbers.forEach(number -> System.out.println(number));
    }
}
*/
/*
//Iterating through Map

import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Using forEach with a lambda expression to print key-value pairs
        ages.forEach((name, age) -> System.out.println(name + ": " + age));
    }
}

*/