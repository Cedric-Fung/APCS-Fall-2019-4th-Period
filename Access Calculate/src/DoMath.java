/*Cedric Fung
 * August 29, 2019
 * period 4
 * Call math methods from the Calculate library
 * Client code or runner code
 */
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculate.square(10));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2, 6.0));
		System.out.println(Calculate.average(2, 4, 6));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1, 2, 3));
		System.out.println(Calculate.toImproperFrac(3, 1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(8,2));
		System.out.println(Calculate.absValue(-985));
		System.out.println(Calculate.max(4, 8));
		System.out.println(Calculate.max(2, 9, 42));
		System.out.println(Calculate.min(25, 19));
		System.out.println(Calculate.round2(29.479));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(100,10));
		System.out.println(Calculate.sqrt(81));
		System.out.println(Calculate.quadForm(1, 6, 9));
	}	
	
}
