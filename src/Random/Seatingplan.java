package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Seatingplan {

	public static int[] RandomSeating (int[] array){
	Random rgen = new Random();  // Random number generator	
	 
	for (int i=0; i<array.length; i++) {
	    int randomPosition = rgen.nextInt(array.length);
	    int temp = array[i];
	    array[i] = array[randomPosition];
	    array[randomPosition] = temp;
	}
/*
	return array;
	Seatingplan rand = new Seatingplan();
	// TODO Auto-generated method stub
	int [] people = { 0,1,2,3,4,5, 6,7,8,9,10,11,12,13,14,15,16,17, 22,18,19,20,21,23};
	
	for(int i=0; i< people.length ; i++) {
	//System.out.println(Seatingplan.RandomSeating(people)[i]);
	 * */
	 */
}
}
}

