import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want?");
		int numRun = scan.nextInt();
		while(numRun <= 0) {
			System.out.println("Please enter a number more than 0");
		}
		System.out.println("Please enter your list of numbers");
		int num = scan.nextInt();
		int sum = 0;
		int min = num;
		int max = num;
		int evenMax = num;
		
		for(int i = 0; i <= numRun -1; i++) {
			if(num % 2 == 0) {
				sum += num;
			}
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			if(num % 2 == 0 && num > evenMax) {
				evenMax = num;
			}	
			
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		if(sum == 0){
			System.out.println("There are no even numbers. ");
		}else{
			System.out.println("Sum of even numbers: " + sum);
			System.out.println("Max of even numbers: " + evenMax);
		}
		scan.close();
	}
}
