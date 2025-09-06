package javaClass.Programs_st2;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

public class PredicateExample {
	public static void main(String args[]) {
	Predicate<Integer> p = (n)-> n%2==0;   
	//	System.out.println(p.test(15));
		
		
		List<Integer>numbers =Arrays.asList(1,2,3,4,5);
		for(Integer i: numbers) {
			if(p.test(i))
			{
				System.out.println("Even Number="+i);
			}
	
		}
		
	}
}
