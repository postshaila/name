package aug174;
import java.util.concurrent.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;


public class Streams {
 public static void main (String [] args) {
	 List <Integer> numbers = new ArrayList<Integer>();
	 numbers.add(10);
	 numbers.add(11);
	 numbers.add(12);
	 numbers.add(110);
	 numbers.add(120);
	 System.out.println(numbers);
	 
	 List<Integer>man= numbers.stream().map(i-> i+5).collect(Collectors.toList());
	 System.out.println(man);
	 List<Integer>aaa = numbers.stream().filter(i -> i>12).collect(Collectors.toList());
	 System.out.println(aaa);
	// List<Integer>bbb = numbers.stream().count();
	 System.out.println(numbers);
	 System.out.println(numbers);
	 System.out.println(numbers);
	 
 }
}
