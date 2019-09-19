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
	//A call toFoil converts a binomial multiplication of the form
	//(ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c
	//The method accepts a four integer and a string and then returns
	//a string
		public static String foil(int a, int b, int c, int d, String variable) {
			String polynomial = "";
			polynomial += (a * c) + variable + "^2 + " + ((b * c) + (d * a)) + variable + " + " + (b * d);
			return polynomial;
	}
	//A call to isDivisibleBy determines whether or not one integer is
	//evenly divisible by another. The method accepts two integers and
	//returns a boolean
		public static boolean isDivisibleBy(int a, int b) {
			if(a % b !=0)
				return false;
			else return true; 
	}
//A call to absValue return the absolute value of the number passed. 
//The method accepts a double and returns a double
public static double absValue(double num) {
	
	if(num < 0)
		num=num*(-1);

	return num;
	}
	//A call to max returns the larger of the values passes. The method
	//accepts two doubles and returns a double
	public static double max(double num1, double num2) {
		if(num1 > num2)
			return num1;
		if(num2 > num1)
		return num2;
		return 0;	
	}
	//Overload the max method. This one accepts three doubles and returns
	//a double
		public static double max(double num1, double num2, double num3) {
			if(num1 > num2) if(num1 > num3) 
				return num1;
			if(num2 > num1) if(num2 > num3)
				return num2;
			if(num3 > num1) if(num3 > num2)
				return num3;
			return 0;
	}
	//A call to min returns the smaller of the values passed. The method
	//accepts two integers and returns an int
		public static int min(int a, int b) {
			if(a > b)
				return b;
			else return a;
	}
	//A call to round2 rounds a double correctly to 2 decimal places and 
	//returns a double
		public static double round2(double num) {
			double factor = (int) ((num*100) + (0.5));
			double answer2 = (factor / 100); 
			return answer2;
			
	}
	//A call to exponent raises a value to a positive integer power. The
	//method accepts a double and an integer and returns a double. For the 
	//time being, you can assume that the exponent is positive
		public static double exponent(double value, int exponent) {
			double answer=value;
			for(int x = 0; x < exponent -1; x++) {
				answer*=value;
			}return answer;
	}
	//A call to factorial raises a value to a positive integer power. The
	//method accepts a double and an integer and returns a double. For the 
	//time being, you can assume that the exponent is positive
		public static int factorial(int num) {
			if(num ==1) {
				return 1;
			}
			int output = num * factorial(num-1);
			return output;
	}
	//A call to isPrime raises a value to a positive integer power. The		//method accepts a double and an integer and returns a double. For the 
	//time being, you can assume that the exponent is positive
		public static boolean isPrime(int num) {
			for(int i = 2; i<num; i++) {
				if (isDivisibleBy(num, i)) {
			return false;
				}
			}
		return true;
	}
	//A call to factorial raises a value to a positive integer power. The		//method accepts a double and an integer and returns a double. For the 
	//time being, you can assume that the exponent is positive
			public static int gcf(int num1, int num2) {
				int smallestNum = min(num1, num2);
				int greatestFactor = 0;
				for(int i=0; i <= smallestNum; i++) {
				}	
			}
	
}

