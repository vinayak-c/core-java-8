package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> sl=new ArrayList<String>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(30);
		al.add(45);
		al.add(50);
		al.add(65);
		sl.add("a");
		sl.add("v");
		sl.add("c");
		sl.add("d");
		List<Integer> fl=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(fl);
		al.stream().filter(i->i%2!=0).forEach(s->System.out.println(s));
		long count=sl.stream().filter(s->s.length()==5).count();
		System.out.println(count);
		List<String> nsortedList=sl.stream().sorted().collect(Collectors.toList());
		List<String> csortedList=sl.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Natural Sorting Order: "+nsortedList);
		System.out.println("Custom Sorting Order: "+csortedList);
		al.stream().forEach(System.out::print);	
		
	}

}
