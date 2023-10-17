package main;

import java.util.stream.Stream;

public class ApplicationStream {
	
	static int is = 0;
	static int ic = 0;
	
	public static void main(String[] args) {
		
		//HW 5 At which speed does the supplier work?
		// It was too easy to ask a number,
		// that can be found on internet.
		// Guess it correlates with the consumer...
		// So, I'll bet on the idea that the speed of the supplier
		// is actually the speed at which the consumer can work,
		// depending also on whether the stream is processed 
		// in parallel or not
		Stream.generate(()->{
			if (is == 6) {
				return 20;
			}
			return (is++ + 2) * 10;
		})
			.limit(7)
			.filter(wh -> wh >= 50 )
			.forEach(wh -> {
				System.out.println(ic + " " + wh);
                ic++;
			    });
			    ;
		
	}
	
}
