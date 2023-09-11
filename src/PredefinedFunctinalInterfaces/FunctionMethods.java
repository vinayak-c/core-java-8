package PredefinedFunctinalInterfaces;

import java.util.function.Function;

public class FunctionMethods {

	public static void main(String[] args) {
		
		Function<Integer,Integer> add=num->num+num;
		Function<Integer,Integer> mul=num->num*num;
		
		System.out.println(add.apply(5));
		System.out.println(mul.apply(5));
		System.out.println(mul.andThen(add).apply(2));
		System.out.println(mul.compose(add).apply(2));
		
	}

}
