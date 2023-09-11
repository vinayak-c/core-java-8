package PredefinedFunctinalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> t=()->LocalDateTime.now();
		System.out.println(t.get());
	}

}
