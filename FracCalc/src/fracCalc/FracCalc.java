package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
    
    	Scanner input = new Scanner(System.in);
       	System.out.println("Enter first expression");
       	String expression = input.nextLine();
     	while (!expression.equals("quit")) {
    	  	System.out.println(produceAnswer(expression));
    	  	System.out.println("new expression");  
    	  	expression = input.nextLine(); 
    	}
         // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"

        // TODO: Implement this function to produce the solution to the input
public static String produceAnswer(String input){ 
   
	String[] splitInput = input.split(" ");
    String operand1 = splitInput[0];
   	String operator = splitInput[1];
   	String operand2 = splitInput[2];
   	int[] hold = parseOperands(operand1);
   	int[] hold2 = parseOperands(operand2);
   	
   	String mixedNum;
   	int[] answer = new int[2];
   	if(operator.equals("+")) {
   		answer = plusFrac((hold),(hold2));
   	}else if(operator.equals("_")) {
   		answer = minusFrac((hold), (hold2));
   	}else 
   		if(operator.equals("*")) {
   	}
   	int num = 0;
    int denominator = 1;
   	if(operand2.indexOf("_") != - 1 && operand2.indexOf("/") != - 1) {
   		String[] mixedNum = operand2.split("_");
   		wholeNum = Integer.parseInt(mixedNum[0]);
   		String[] fraction = mixedNum[1].split("/");
   		num = Integer.parseInt(fraction[0]);
   		denominator = Integer.parseInt(fraction[1]);
   	}else {
   		if(operand2.indexOf(" ") == -1 && operand2.indexOf("/") != -1) {
   		String[] fraction = operand2.split("/");
   		num = Integer.parseInt(fraction[0]);
   		denominator = Integer.parseInt(fraction[1]);
   	}else {
   		wholeNum = Integer.parseInt(operand2);
   	}
   	}
   	return "whole:" + wholeNum + " numerator:" + num + " denominator:" + denominator;
}
} 
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    

