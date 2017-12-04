import Animals.*;
import utils.*;

public class Driver {
	public static void main(String[] args) {
		
		//Puppy 

		Puppy pup1 = new Puppy("Joey"); 
		Puppy pup2 = new Puppy("Chandler");
		Puppy pup3 = new Puppy("Ross");


		System.out.println(pup1.getname());
		System.out.println(pup2.getname());
		System.out.println(pup3.getname());

		//ArrayUtils

		int[] arg1 = new int[]{9, 20, 3, 44, 88, 300};
		int[] res1 = ArrayUtils.reverse(arg1); 
		String stringified = ArrayUtils.stringifyArray(result1);
		System.out.println(stringified);

		// Math

		double num1 = 15.4;
		System.out.println(Math.factorial((long) num1));
	}
}