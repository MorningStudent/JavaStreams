package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplicationStandard {

	public static void main(String[] args) {
		
		List<Integer> weeklyHumidity = new ArrayList<>();
		weeklyHumidity.add(20);
		weeklyHumidity.add(30);
		weeklyHumidity.add(40);
		weeklyHumidity.add(50);
		weeklyHumidity.add(60);
		weeklyHumidity.add(70);
		weeklyHumidity.add(20);
		
//		for (int i = 0; i < weeklyHumidity.size();) {  // |<------------HW 2 Refactor the code so it works well
//			if(weeklyHumidity.get(i) < 50) {
//				weeklyHumidity.remove(i);
//			} else {
//				i++;
//			}
//			
//		}
		
//		for (int i = 0; i < weeklyHumidity.size();) {  // |<------------HW 3 Refactor the code so it uses positive condition
//			if(weeklyHumidity.get(i) >= 50) {          // |<------------No need for an additional collection!
//				i++;
//			} else {
//				weeklyHumidity.remove(i);
//			}
//			
//		}
		
		// |<--------------------------------------------- HW 4 wasn't defined
		
//		for (Integer wh : weeklyHumidity) {  //|<--------- HW 1 What changes?!: It generates ConcurrentModificationException
//			if(wh < 50) {
//				weeklyHumidity.remove(wh);
//			}
//		}
		
		for (Integer wh : weeklyHumidity) {
			System.out.println(wh);
		}
		
		
	}

}
