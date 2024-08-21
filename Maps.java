package aug174;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Maps {
	public static void main (String []args) {
	List<Integer> obj = new ArrayList<Integer>();
	obj.add(55);
	obj.add(45);
	obj.add(35);
	obj.add(65);
System.out.println(obj);

List<Integer> sums =  obj.stream().map(i -> i+5).collect(Collectors.toList());
System.out.println(sums);
System.out.println(obj);


}}
