/*Cedric Fung
*August 29, 2019
*Period 4
*Group of methods that perform math calculations (a library)
*/
public class Calculate { 
	//A call to square returns the square of the value passed
	//it accepts and returns an integer
	public static int square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
	}
	//A call to cube returns the cube of the value passed
	//it accepts and returns an integer
		public static int cube(int number) {
			int answer=0;
			answer = number*number*number;
			return answer;
		}
		//A call to average returns the average of the value passed
		//it accepts two doubles and returns a double
			public static double average(double number1, double number2) {
				double answer=0;
				answer =  (number1+number2)/2;
				return answer;
			}
			//The ability to define two or more different methods with the
			//same name but different method signatures called overloading
				public static double average(double number, double number1, double number2) {
					double answer=0;
					answer = (number+number1+number2)/3;
					return answer;
				}
				//A call toDegrees converts an angle measure given in radians into
				//degrees. The method accepts a double and returns a double. The 
				//method should use 3.14159 as an approximation of pi
				
					public static double toDegrees(double radians) {
						double degrees=0;
						degrees = (180/3.14159)*(radians);
						return degrees;
				
					}
					//A call toRadians converts an angle measure given in degrees into
					//radians. The method accepts a double and returns a double. The 
					//method should use 3.14159 as an approximation of pi
					
						public static double toRadians(double degrees) {
							double radians=0;
							radians = (3.14159/180)*(degrees);
							return radians;
						}
						//A call to discriminant provides the coefficients of a quadratic
						//equation in standard form (a,b, and c) and returns the value
						//of the discriminant. The method accepts three doubles and returns
						//a double
						
							public static double discriminant(double a, double b, double c) {
								double answer=0;
								answer = (b*b-4*a*c);
								return answer;
							}
							//A call toImproperFrac converts mixed number into an improper fraction
							//The method accepts a three integer and returns a string
							
								public static String toImproperFrac(int WholeNumber, int numerator, int denomenator) {
									String answer="";
									answer = (WholeNumber*denomenator+numerator)+"/"+denomenator;  
									return answer;
								}
								//A call toMixedNum converts an improper fraction into a mixed number
								//The method accepts a two integer and returns a string
								
								public static String toMixedNum(int numerator, int denomenator) {
									String mixedNum="";
									int whole=numerator/denomenator;
									numerator = numerator%denomenator;
									mixedNum = whole + "_" + numerator + "/" + denomenator;
									return mixedNum;
								}
}

