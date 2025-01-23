import java.util.Arrays;

public class OddAndEvensRunner
{
	public static void main( String args[] )
	{
		//add test cases
		int[] one = {2, 4, 6, 8, 10, 12, 14};
		int[] two = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] three = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};

		// create 3 arrays with the values
		// 2 4 6 8 10 12 14
		// 1 2 3 4 5 6 7 8 9
		// 2 10 20 21 23 24 40 55 60 61

		// call all the methods in OddsAndEvens class
		System.out.println("");
		System.out.println("Count Em:");

		System.out.println(OddsAndEvens.countEm(one, false));
		System.out.println(OddsAndEvens.countEm(one, true));
		System.out.println(OddsAndEvens.countEm(two, false));
		System.out.println(OddsAndEvens.countEm(two, true));
		System.out.println(OddsAndEvens.countEm(three, false));
		System.out.println(OddsAndEvens.countEm(three, true));

		System.out.println("");
		System.out.println("Get all Evens:");

		int[] x = OddsAndEvens.getAllEvens(one);
		System.out.println(Arrays.toString(x));
		int[] y = OddsAndEvens.getAllEvens(two);
		System.out.println(Arrays.toString(y));
		int[] z = OddsAndEvens.getAllEvens(three);
		System.out.println(Arrays.toString(z));

		System.out.println("");
		System.out.println("Get all Odds:");

		int[] a = OddsAndEvens.getAllOdds(one);
		System.out.println(Arrays.toString(a));
		int[] b = OddsAndEvens.getAllOdds(two);
		System.out.println(Arrays.toString(b));
		int[] c = OddsAndEvens.getAllOdds(three);
		System.out.println(Arrays.toString(c));
		// be sure to print out the results

	}
}