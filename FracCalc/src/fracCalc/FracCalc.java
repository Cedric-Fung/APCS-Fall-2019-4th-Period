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
   	}else 
		if(operator.equals("_")) {
   		answer = minusFrac((hold), (hold2));
   	}else 
   		if(operator.equals("*")) {
		answer = timesFrac((hold), (hold2));
	}else{
		answer = divideFrac(hold, hold2);
   	}
	int[] reduceImproperFrac = reduceFrac(answer);
	if(reduceImproperFrac[0] == 0 && reduceImproperFrac[1] != 0){
		mixednum = reduceImproperFrac[1] + "/" + reduceImproperFrac[2];
	}else 
		if(reduceImproperFrac[1] == 0){
		mixedNum = "" + reduceImproperFrac[0];
	}else
		if(reduceImproperFrac[0] == 0 && reduceImproperFrac[1] == 0){
		mixednum = "0";
	}else{
		mixednum = reduceImproperFrac[0] + "_" + reduceImroperFrac[1] + "/" + reduceImproperFrac[2];
	}
		return mixednum;
}
public static int[] reduceFrac(int[] operand) {
	int[] fracReduce = new int [3];
	int wholeNum = operand[0] / operand [1];
	operand[0] = (operand[0] % operand [1]);
	if(wholeNum != 0) {
		operand[0] = Math.abs(operand[0]);
	}
	int factor = gcf(operand);
	int denominator = Math.abs(operand[1] / factor);
	int numerator = operand[0];
	fracReduce[0] = wholeNum;
	fracReduce[1] = numerator;
	fracReduce[2] = denominator;
		return fracReduce;
}
public static double absValue(double num) {
	if(num < 0) {
		num *= -1;
	}else {
		num*= 1;
	}
	return num;
}
public static int gcf(int[] operand) {
	int num = 1;
	int factor = 1;
	while(num <= min(absValue(operand[0]), operand[1])) {
		if(absValue(operand[0] % num) == 0 && absValue(operand[1] % num) == 0) {
			factor = num;
		}
		num++;
	}
	return (factor);
}
public static double min(double num, double num2) {
	if(num < num2) {
		return num;
	}else {
		return num2;
	}
}
public static int[] parseOperands(String operand){
	String[]checkWholeNum = operand.split("_");
	String[]fraction = checkWholeNum[checkWholeNum.length -1].split("/");
	String[] OperandThree = new String[3];
	int underscore = operand.indexOf("_");
	int slash = operand.indexOf("/");
	OperandThree[2] = "1";
	int[] operandint = new int [3];
	if(underscore < 0 && slash >= 0) {
	OperandThree[0] = "0";
}
	else {
	OperandThree[0] = checkWholeNum[0];
}
	if(slash < 0) {
	OperandThree[1] = "0";
	OperandThree[2] = "1";
}
	else {
	OperandThree[1] = fraction[0];
	OperandThree[2] = fraction[1];
}
	for(int i = 0; i < OperandThree.length; i++){
	operandInt [i] = Integer.parseInt(OperandThree[i]);
	}
	if(operandInt[0] < 0)
		operandInt[1] = operandInt[1] * -1;
	int[] improperFrac = toImproperFrac(operandInt[0], operandInt[1], opernadInt[2]);
	return imporperFrac;
}
public static int[] toImproperFrac(int wholeNum, int numerator, int denominator){
	int[] improperFrac = new int[2];
	imporperFrac[0] = wholeNum * denominator + numerator;
	imporperFrac[1] = denominator;
	return improperFrac;
}
public static int[] plusFrac(int[] operand, int[] operand2){
	int[] commonDenom = new int[1];
	int[] New = new int[1];
	if(operand[1] ==operand2[1]){
	commonDenom[0] = operand[1];
	New[0] = operand[0] + operand2[0];
}else{
	commonDenom[0] = operand[1] * operand2[1];
	New[0] = operand[0] * operand2[1] + operand2[0] * operand [1];
	}
	int[] answer = new int[2];
	answer[0] = New[0];
	answer[1] = commonDenom[0];
	return answer;
}
public static int[] minusFrac(int[] operand, int[] operand2){
	int[]answer = new int[2];
	int[] array = new int [2];
	array[0] = (operand[0] * operand2[1]) - (operand[1] * operand2[0]);
	answer[0] = array[0];
	answer[1] = operand[1] * operand2[1];
	return answer;
}
public static int[] timesFrac(int[] operand, int[] operand2){
	int[] answer = new int[2];
	answer[0] = (operand[0] * operand2[0]);
	answer[1] = (operand[1] * operand2[1];
		     return answer;
}
public static int[] divideFrac(int[] operand, int[] operand2){
	if(operand2[0] <= -1){
	operand2[1] *= -1;
	}
	int denominator = operand2[1];
	operans2[1] = Math.abs(operand2[0]);
	operand2[0] = denominatpr;
	int[] answer = timesFrac(operand, operand2);
	return answer;
	
}
	
}
{
	
	}
	
}


    // TODO: Fill in the space below with any helper methods that you think you will need
    

