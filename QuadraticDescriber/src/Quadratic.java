/*Cedric Fung
 * September 26, 2019
 * period 4
 * Quadratic Describer gives you 
 * the outputs of the inputs
 */
import java.util.*;
public class Quadratic {
private static Scanner userinput;
	
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
		
		userinput = new Scanner(System.in);
		double symmetry = 0;
		double vertexX = 0;
		double vertexY = 0;
		String x intercepts = "";
		double yIntercets = 0;
		String oepns = "";
		
		System.out.print("a :" );
		a = userinput.nextint();
		System.out.print("b :" );
		b = userinput.nextint();
		System.out.print("c :" );
		c = userinput.nectint();
		
		//determines if it opens positive (up) 
		//or negative (down)
		if (a < 0){
			opens + "Down";
		}
		else{
			opens = "Up";
		}
		
		//Finding midline or axis of symmetry
		symmetry = (-(b)/(2*a));
		
		//Determining the vertex
		vertexX = symmetry;
		VertexY = ((a)*(VertexX*vertexX) + (b)*(vertexX) + c)
		
		//Determining X intercepts
		X intercepts = (quadform);
		
		//Determining yIntercept
		yIntercept = c;
		
		String description = ("===================================================================================================" + "\n"
				 + "Description of the graph of : \n"
				 + "y = (" + a + ")x^2 + (" + b + ")x + (" + c +") \n\n"
				 + "Opens: " + opens + "\n"
				 + "Axis of Symmetry: " + symmetry + "\n"
				 + "Vertex: (" + vertexX + "," + vertexY + ")" + "\n"
				 + "x intercepts(s): " = xintercepts + "\n"
				 + "y intercept: " + yIntercept + "\n"
				 + "=================================================================================================");
		return (desription);			      
	}
}



