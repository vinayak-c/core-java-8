package Lambdas;

@FunctionalInterface
interface Intern{
	public boolean isEven(int i);
	
}


interface Intern2 {
	default int add(int a,int b)
	{
		return a+b;
	}
}

@FunctionalInterface
interface Intern3{
	public int add(int a,int b);
}

public class BasicLambdas implements Intern2{

	public static void main(String[] args) {
		
		Intern j=i->i%2==0;
		Intern3 sum=(a,b)->a+b;
		System.out.println(j.isEven(8));
		System.out.println(j.isEven(1));
		System.out.println(sum.add(5,4));
	}

}
