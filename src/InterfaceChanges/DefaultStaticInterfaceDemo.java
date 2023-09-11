package InterfaceChanges;

import java.util.function.Predicate;

interface Inter
{ 	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
}
public class DefaultStaticInterfaceDemo implements Inter {
	
	public static void m1(Predicate<Integer> p,int[] arr) {
		for(int temp:arr){
			if(p.test(temp)) {
				System.out.println(temp);
			}
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println(Inter.add(10,10));
		Predicate<Integer> i=k->k%2==0;
		Predicate<Integer> j=a->a>2;
		System.out.println(i.test(5));
		System.out.println(j.test(20));
		int[] num= {2,3,4,5,6,7,8,9,10};
		m1(i.and(j),num);
		System.out.println();
		m1(i,num);
		System.out.println();
		m1(i.or(j),num);
	}
}
