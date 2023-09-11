package PredefinedFunctinalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		Consumer<String> display=input->System.out.println(input);
		display.accept("Hello world");
	}

}
