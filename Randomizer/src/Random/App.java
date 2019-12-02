package Random;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		
		ArrayList<String> people1 = new ArrayList<>();
		
		people1.add("Adam M"); 
		people1.add("Alex R"); 
		people1.add("Alwin T"); 
		people1.add("Anthony W"); 
		people1.add("Chloe A"); 
		people1.add("Chris J");
		people1.add("Euan R"); 
		people1.add("Ewan D"); 
		people1.add("Harris H"); 
		people1.add("James B"); 
		people1.add("James K"); 
		people1.add("Jess L");
		people1.add("John G"); 
		people1.add("Liam M"); 
		people1.add("Lizzie C"); 
		people1.add("Luke P"); 
		people1.add("Luke C");
		people1.add("Luke H"); 
		people1.add("Empty");
		people1.add("Matt F"); 
		people1.add("Neevan V"); 
		people1.add("Rebekah R"); 
		people1.add("Tigs K"); 
		people1.add("Zohaib Z");
		
		Seatingplan.Randomising(people1);
}
}
