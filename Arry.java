package aug174;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;

public class Arry {

		
	public static void main  (String [] args) {
		List<Integer> man = new  ArrayList<Integer>();
		man.add(4);
		man.add(45);
		man.add(75);
		man.add(85);
System.out.println(man.equals(45));
System.out.println(man.isEmpty());
System.out.println(man.toString());
System.out.println(man.reversed());
System.out.println(man.getFirst());
//.out.println(man.stream(); 
		System.out.println(man.indexOf(45));
System.out.println("_  Till now with List to array___________________________________________________________________________________");
	List <String> woman = new ArrayList<String>();
	woman.add("a");
	woman.add("b");
	woman.add("c");
	woman.add("d");
	woman.add("e");
System.out.println(woman);
System.out.println(woman.isEmpty());
System.out.println(woman.toString());
System.out.println(woman.reversed());
System.out.println(woman.getFirst());

System.out.println("__________________________________________start set with HashSet________________________");
	Set <Integer> boy = new HashSet<Integer>();
	boy.add(45);
	boy.add(55);
	boy.add(55);
	boy.add(75);
System.out.println(boy);
System.out.println(boy.size());
System.out.println(boy.contains(55));
System.out.println(boy.contains(75));

	Set <String> girl = new HashSet<String>();
	girl.add("cat");
	girl.add("rat");
	girl.add("bat");
	girl.add("cat");
	girl.add("mat");
System.out.println(girl);
System.out.println(girl.toString());
System.out.println(girl.iterator());
try {
	int c= 10/0;
System.out.println(c);}
catch (Exception e) {
	System.out.println(" enter a string " +e);
}
System.out.println("____________________________---------------------- starts map _____ HashMap__________________");

Map<Integer,Integer> earth = new HashMap<Integer,Integer>();
	earth.put(45, 4);
	earth.put(55,5 );
	earth.put(4,450);
	earth.put(66,666);
	earth.put(66,55);
	earth.put(66,777);
	
System.out.println(earth.containsKey(45));
System.out.println(earth.containsValue(5));
System.out.println(earth.size());
System.out.println(earth.keySet());
System.out.println(earth.replace(55,5 , 101));
System.out.println(earth.replace(4,450));
System.out.println(earth);



	
	
}}
