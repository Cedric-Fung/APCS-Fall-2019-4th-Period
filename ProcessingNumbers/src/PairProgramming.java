import java.util.*;
public class PairProgramming {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		userInput.nextInt();
		int sum = 0;
		int min = 1st;
		int max = 1st;
		int evenMax = 0;
		int numRun = userInput.nextInt();
		if(max % 2 == 0) {
			sum += max;
			evenMax = max;
		}
		for(int i = 0; i < numRun -1; i++) {
			int num = userInput.nextInt();
			if(num % 2 ==0) {
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
		}
		System.out.println("sum: " + sum + ", " + "max: " + max + ", " + "min: " + min + ", " + "evenMax: " + evenMax  );
	}
	
}
