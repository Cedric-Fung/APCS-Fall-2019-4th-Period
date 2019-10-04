import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want?");
		int numRun = scan.nextInt();
		while(numRun <= 0) {
			System.out.println("Please enter a number more than 0");
		}System.out.println("Please enter your list of numbers");
		int input = scan.nextInt();
		int sum = 0;
		int min = input;
		int max = input;
		int evenMax = input;
		if(max % 2 == 0) {
			input += max;
			evenMax = max;
		}
		for(int i = 0; i <= numRun -1; i++) {
			int input2 = scan.nextInt();
			if(input % 2 == 0) {
				sum += input;
			}
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
			if(input % 2 == 0 && input > evenMax) {
				evenMax = input;
			}	
		}
		System.out.println("sum: " + sum);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("evenMax: " + evenMax);
		scan.close();
	}
}
