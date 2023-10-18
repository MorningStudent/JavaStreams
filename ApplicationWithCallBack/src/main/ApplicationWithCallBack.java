package main;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ApplicationWithCallBack {

	public static void main(String[] args) {
		
		Stream.generate(new Supplier<Integer>() {
			int i = 0;
			@Override
			public Integer get() {
				return i++;
			}})
		.limit(5)
		.filter(new Predicate<Integer>() {     // |<-----------HW 1 Refactor the code below with anonymous classes

			@Override
			public boolean test(Integer t) {
				if (t >= 0) {
					return true;
				}
				return false;
			}
			
		})                                     //                              ^
		.forEach(new Consumer<Integer>() {     // |<------------ HW 1 ---------|

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		});

	}

}
