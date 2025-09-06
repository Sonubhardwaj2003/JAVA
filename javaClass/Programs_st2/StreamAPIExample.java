package javaClass.Programs_st2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class StreamAPIExample {
public static void main(String args[])
{
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//Stream<Integer> data = numbers.stream(); 
		
	//data.forEach(n->System.out.println(n));

	/*
	long count = data.count();
	System.out.println(count);*/
	
	/*
	Stream<Integer> sortedData = data.sorted();
	sortedData.forEach(n->System.out.println(n));
	*/
	
	/*
	Stream<Integer> mappedData = data.map(n-> n*2);
	mappedData.forEach(n->System.out.println(n));
	*/
	
	/*
	numbers.stream().sorted().map(n-> n*2).forEach(n->System.out.println(n));
	*/
	
	/*
	long c =numbers.stream().filter(n->n%2==1).sorted().count();
	System.out.println(c);
	*/
	
	/*
	int result = numbers.stream().filter(n->n%2==1).sorted().reduce(0,(a,b)->a+b);
	System.out.println(result); 
	*/
	
	/*
	List<Integer> result = numbers.stream().sorted().filter(n->n%2 ==0).map(n->n*2).distinct().collect(Collectors.toList());
	System.out.println(result);
	*/
	
	/*
	int result = numbers.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
	System.out.println(result);
	*/
}
}
