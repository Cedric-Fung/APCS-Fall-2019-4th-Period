/*Cedric Fung
 * September 26, 2019
 * period 4
 * Quadratic Describer gives you 
 * the outputs of the inputs
 */
public class Quadratic {
	public static double discriminant(double a, double b, double c) {
		double answer=0;
		answer = (b*b-4*a*c);
		return answer;
	}
	public static double sqrt(double num) {
		if (num < 0) {
			throw new IllegalArgumentException("invalid input");
		}
		if(num < 0);
		double output = 1;
		while(!(absValue(num - output*output) < 0.005)) {
			output = 0.5*(num/output + output);	
		}
		return round2(1)*(output);
}
	public static double round2(double num) {
		double factor = (int) ((num*100) + (0.5));
		double answer2 = (factor / 100); 
		return answer2;	
}
	public static double max(double num1, double num2) {
		if(num1 > num2)
			return num1;
		if(num2 > num1)
		return num2;
		return 0;	
}
	public static double min(double answer1, double answer2) {
		if(answer1 < answer2)
			return answer1;
	else 
		 return answer2;
}
	public static double absValue(double num) {
		
		if(num < 0)
			num=num*(-1);

		return num;
}
	public static String quadform(int a, int b, int c) {
		if (a == 0) {
			throw new IllegalArgumentException("invalid input");
		}
		double discriminant = discriminant (a,b,c);
		if(discriminant < 0) {
			return "no real roots";
		} else if (discriminant == 0) {
			return (-b/2*a) + "";
		} else {
		double answer1= round2(-b+(sqrt(discriminant))/(2.0*a));
		double answer2= round2(-b-(sqrt(discriminant))/(2.0*a));
		return min(answer1, answer2) + " and " + max(answer1, answer2);
		
	}}
	public static String quadrDescriber (double a, double b, double c) {
		return null; 
}
}



