//Cedric Fung
//4th Period 
//September 29 2019
//This code takes inputs and outputs and calls quadrtic describer

import java.util.*;
public class QuadraticClient {
public static void main(String[] args) {
System.out.println("This is the Quadratic Describer");
System.out.println("This provides the values for variables a, b, and c");
boolean continues = true;
Scanner scanner = new Scanner(System.in);
while(continues)
System.out.println(Quadratic.quadrDescriber(0,0,0));
System.out.println("Do you want to do more? (Typer \"quit\" to end)");
String answer = scanner.nextLine();
	answer = answer.toUppeCase();
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
