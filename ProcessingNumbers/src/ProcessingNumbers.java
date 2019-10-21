import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want?");
		int numRun = scan.nextInt();
		int sum = 0;
		int min = 0;
		int max = 0;
		int evenMax = 0;
		int num = 0;
		
		for(int i = 0; i < numRun; i++) {
			System.out.println("Input next number");
			num = scan.nextInt();
			if(i==0) {
				max = num;
				min = num;
			}
			if(num % 2 == 0) {
				sum += num;
			}
			if(num > max) {
				max = num;
			}
			
			
			if(num < min) {
				min = num;
			}
			if((num % 2 == 0) && num > evenMax) {
				evenMax = num;
			}	
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
