//Cedric Fung
//4th Period 
//September 29 2019
//This code takes inputs and outputs and calls quadratic describer

import java.util.*;
public class QuadraticClient {
public static void main(String[] args) {
System.out.println("This is the Quadratic Describer");
System.out.println("This provides the values for variables a, b, and c");
boolean continues = true;
Scanner scanner = new Scanner(System.in);
while(continues) {
	
	System.out.print("a :" );
	double a = scanner.nextDouble();
	System.out.print("b :" );
	double b = scanner.nextDouble();
	System.out.print("c :" );
	double c = scanner.nextDouble();
	System.out.println(Quadratic.quadrDescriber(a,b,c));
	
	System.out.println("Do you want to do more? (Typer \"quit\" to end)");
String answer = scanner.next();
	answer = answer.toUpperCase();
if (answer.equals("quit")) {
	continues = false;
}
else{ 
	continues = true;
}
}
	scanner.close();
	}
}
