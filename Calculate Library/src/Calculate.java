/*Cedric Fung
*August 29, 2019
*Period 4
*Group of methods that perform math calculations (a library)
*/
public class Calculate {
	//returns the square of an integer
	public static int square(int number) {
		return number * number;
	
	}
	//returns the number cubed
	public static int cube(int number) {
		return number * number * number;
	}
	//returns average of 2 given doubles
	public static double average(double number1, double number2) {
		return (number1 + number2)/2;
	}
	//returns average when given more than 2 doubles
	public static double average(double number1, double number2, double number3 ) {
		return (number1 + number2 + number3)/3;
	}
	//returns degrees when given radian
	public static double toDegrees(double number1) {
		return (number1 * 180)/ 3.14159;
	}
	//returns radian value after given degree
	public static double toRadians(double number1){
		return (number1 * 3.14159) / 180;
	}
	//returns output of discriminant after using given coefficients of a quadratic formula
	public static double discriminant(double number1, double number2, double number3) {
		return (number2*number2)- (4*number1*number3);
	}
	//returns improper fraction after given mixed number
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int x = whole*denominator +numerator;
		return (x+ "/"+denominator);
		
	}
	//returns mixed number after given an improper fraction
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator) + "_" + numerator%denominator+ "/" + denominator;
	}
	//returns "a*c*var^2 + (a*d + b*c)*var + b*d" form after given 3 integers a variable
	public static String foil(int a, int b, int c, int d, String n) {
		return (a*c)+ n + "^"+"2 + " + ((d*a) + (b*c)) + n + " + " + b*d;
	}
	
	//returns true/false statement
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0){
		throw new ArithmeticException("Invalid argument");
	}
	
	return num1 % num2 == 0;	
}
	
	//returns absolute value of double
	public static double absValue (double num1) {
		if (num1 < 0) {
			return num1 * (-1);
		}else {
			return num1;
		}
	}
	//returns larger when given 2 doubles
	public static double max (double num1, double num2) {
		if (num1 < num2) {
			return num2;
		}else {
			return num1;
		}
	}
	//returns larger from 3 given doubles
	public static double max (double num1, double num2, double num3) {
		return max(num1, max(num2, num3));
	}
	//returns smaller when given 2 integers
	public static int min(int num1, int num2) {
		if(num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double min(double num1, double num2) {
		if (num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//rounds number
public static double round2(double num) {
        
        if(num == 0) {
            return 0;
        }
        
        int sign = (int) (num / absValue(num));
        int answer = (int) absValue((int)(num*1000));
        if(answer%10>=5) {
            return sign*((int)((answer+10)/10))/100.0;
        }else{
            return sign*(answer/10)/100.0;
        }
        

	}
	//returns a double by raising a value to a positive integer power
	public static double exponent(double value, int expo) {
		double answer = value;
		if (expo < 0) {
			throw new ArithmeticException("Invalid argument");
			
		}
		for (int i = 0; i < expo - 1; i++) {
			answer *= value;
		} return answer;
		
		
	}
	//returns the factorial of the value passed
	public static int factorial (int num1) {
		if (num1 == 1) {
			return 1;
		} else if (num1 <0) {
			throw new ArithmeticException ("Invalid Argument");
			
		}
		int output = num1 * factorial(num1 - 1);
		return output;
	}
	//checks if input is a prime number
	public static boolean isPrime(int num1) {
		for(int i = 2; i <num1; i++) {
			if (isDivisibleBy(num1, i)) {
				return false;
			}

		}
	return true;
	}
	public static int gcf(int num1, int num2) {
		int output = 1;
		for(int i = 1; i <=num1; i+=1) {
			if(isDivisibleBy(num1, i) && isDivisibleBy (num2,i)) {
				output = i;
			}
		}
		return output;
	}

//Returns the square root of a double rounded to the hundredths
public static double sqrt(double num1){
	if(num1 < 0){
		throw new ArithmeticException ("Invalid argument");
	}
	
	double output = 1;
	
	while(!(absValue(num1 - output*output) < 0.005)){
		output = 0.5*(num1/output + output);
	}
	
	return round2(output);
}
//pulls the numbers from other methods needed to complete the quadratic formula
public static String quadForm( int a, int b, int c) {
	double discriminant = discriminant(a, b, c);
	if(discriminant < 0){
		return "no real roots";
	} else if(discriminant == 0){
		return round2(-b/2*a) + "";
	} else {
		double root1 = round2((-b+sqrt(discriminant))/(2.0*a));
		double root2 = round2((-b-sqrt(discriminant))/(2.0*a));
		
		return min(root1, root2) + " and " + max(root1, root2);
}}
}
