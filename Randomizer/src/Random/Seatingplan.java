package Random;

import java.util.Collections;
import java.util.List;

public class Seatingplan {

	public static void Randomising(List<String> people1) { 
	
	Collections.shuffle(people1);
	List<String> row1 = people1.subList(0, 6);
	List<String> row2 = people1.subList(6, 12);
	List<String> row3 = people1.subList(12, 18);
	List<String> row4 = people1.subList(18, 23);
	
	//System.out.println(people1);
	System.out.println("                               Front");
	System.out.println("Row1 From the Left "+row1);
	System.out.println();
	System.out.println("Row2 From the Left "+row2);
	System.out.println();
	System.out.println("Row3 From the Left "+row3);
	System.out.println();
	System.out.println("Row4 From the Left "+row4);
	System.out.println("                                Back");
	
}
}
