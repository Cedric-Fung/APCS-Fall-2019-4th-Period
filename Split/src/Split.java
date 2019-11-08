import java.util.Arrays;

public class Split {

	public static void main(String[] args) {

			// Your task Part 0
			//String.split();
			//It's a method that acts on a string, <StringName>.split(<sp>);
			//Where splits the string where the string splits
			//And it returns an array
			// Example: "I like apples!".split(" ");
			// it will split at spaces and return an array of ["I","like","apples!"]
			// Example 2: "I really like really red apples!".split("really")
			// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
			//play around with String.split!
			//What happens if you "I reallyreally likeapples".split("really") ?	
		
		System.out.println(part1("bread"));
		System.out.println(part1("breadham"));
		System.out.println(part1("mayobread"));
		System.out.println(part1("breadmayobread"));
		System.out.println(part1("breadbread"));
		System.out.println(part1("breadmayobreadham"));
		System.out.println(part1("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println(part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
	}
	
			//Your task Part 1:

			/*Write a method that take in a string like
			* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"
			* describing a sandwich
			* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
			* the sandwich and ignores what's on the outside
		    * What if it's a fancy sandwich with multiple pieces of bread?
		    */
	
public static String part1(String Sandwich) {
String[] outputArray1 = Sandwich.split("bread");
	if(outputArray1.length <= 1){
		return "Not a Sandwich";
			}
			int breadSpot = Sandwich.indexOf ("bread");
			if(breadSpot >= 0) {
				String remaining = Sandwich.substring(breadSpot+5);
				breadSpot = remaining.indexOf("bread");
				if(breadSpot >= 0) {
				return outputArray1[1];
			}else{ 
				return "Not a sandwich";
				}
	}else {
				return "Not a sandwich";
			}
	}

			//Your task Part 2:
		
			/*Write a method that takes in a string like
			* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
			* describing a sandwich
			* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of
			* the sandwich and ignores what's on the outside.
			* Again, what if it's a fancy sandwich with multiple pieces of bread?
			*/

public static String part2(String Sandwich) {
		String[] outputArray2 = Sandwich.split (" ");
		String SpaceGone = "";
		for(int i = 0; i < outputArray2.length; i++) {
			SpaceGone+=outputArray2[i];
		}
		return part1(SpaceGone);
		 }
}

