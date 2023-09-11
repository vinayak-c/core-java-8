package PredefinedFunctinalInterfaces;

@FunctionalInterface
interface Parent{
	public int add(int a,int b);
}

interface Child extends Parent{
	public int isEven(int a,int b);
}

public class FunctionalInheritance {

	public static void main(String[] args) {

		Thread t=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
	}

}
