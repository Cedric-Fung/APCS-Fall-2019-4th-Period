/*Cedric Fung
 * September 26, 2019
 * period 4
 * Quadratic Describer gives you 
 * the outputs of the inputs
 */
public class Quadratic {
	
	public static double discriminant(double a, double b, double c) {
		double answer=0;
		answer = (b*b)-(4*a*c);
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
		if(num==0) {
			return 0;
		}
		int sign = (int) (num /absValue(num));
		int answer = (int) absValue((int)(num*100));
		if(answer%10 >= 5) {
			return sign * ((int)((answer + 10)/10))/100.0;
		}else {
			return sign * (answer/10)/100.0;
		}
		
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
	public static String quadform(double a, double b, double c) {
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
		
		String xintercepts = "";
		double symmetry = 0;
		String opens = "";
		double vertexX = 0;
		double vertexY = 0;
		double yIntercept = 0;
		double x_subtraction = 0;
		double x_addition = 0;
		
		//Determining yIntercept
				 yIntercept = c;
		
		//determines if it opens positive (up) 
		//or negative (down)
		if (a < 0){
			opens = "Down";
		}
		else{
			opens = "Up";
		}
		
		//Finding midline or axis of symmetry
		symmetry = (-(b)/(2*a));
		
		//Determining the vertex
		vertexX = symmetry;
		vertexY = ((a)*(vertexX*vertexX) + (b)*(vertexX) + c);
		
		//Determining X intercepts
		x_subtraction = ((-b - sqrt(discriminant(a, b, c))) / (2*a));
		x_addition = ((-b + sqrt(discriminant(a, b, c))) / (2*a)) ;
		if (x_subtraction == x_addition) {
			xintercepts =("" + x_subtraction);
		}
		else {
			xintercepts =(x_subtraction + "&" + x_addition);
		}
		
				String description = ("\n")
				 + "Description of the graph of : \n"
				 + "y = (" + a + ")x^2 + (" + b + ")x + (" + c +") \n\n"
				 + "Opens: " + opens + "\n"
				 + "Axis of Symmetry: " + symmetry + "\n"
				 + "Vertex: (" + vertexX + "," + vertexY + ")" + "\n"
				 + "x intercepts(s): " + x_subtraction+ " " + x_addition  + "\n"
				 + "y intercept: " + yIntercept + "\n";
		return (description);			      
	}
}



