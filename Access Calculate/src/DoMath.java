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
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
	}	
	
}
