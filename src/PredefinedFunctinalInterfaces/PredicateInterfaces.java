package PredefinedFunctinalInterfaces;

import java.util.function.Predicate;

public class PredicateInterfaces {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i>15;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(14));
		System.out.println(p.test(10));
		System.out.println(p.and(p2).test(16));
		System.out.println(p.or(p2).test(6));
		
		
	}

}
