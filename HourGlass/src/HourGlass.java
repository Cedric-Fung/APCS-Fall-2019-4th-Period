import java.util.*;
public class HourGlass {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		boolean continuing = true;
		while (continuing) {
			System.out.print("How big is your hourglass?");
			int size = enter.nextInt();
			String hourglass = "";
			hourglass += ("|");
			for(int i = 0; i < size; i++) {
				hourglass += ("\"");
			}
		hourglass += ("|\n");
		for(int i = 1; i <= (size / 2) - 1; i++) {
			for(int j = 0; j < i; j++) {
				hourglass += " ";
			}
		hourglass += ("\\");
		for(int k = 0; k < -2 * i + size; k++) {
			hourglass += (":");
		}
		hourglass += ("/ \n");
			}
		for(int i = 0; i < size /2; i++) {
			hourglass += (" ");
		}
		if(size % 2 == 0) {
			hourglass += ("|| \n");
		}else {
			hourglass += ("||| \n");
		}
		for (int i = size/2 -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				hourglass += (" ");
			}
			hourglass += ("/");
			for(int k = 0; k < -2 * i + size; k++) {
				hourglass += (":");
			}
			hourglass += ("\\ \n");
		}
		hourglass += ("|");
		for (int i = 0; i < size; i++) {
			hourglass += ("\"");
		}
		hourglass += ("| \n");
		System.out.println(hourglass);
		System.out.println("Type \"quit\" to stop: ");
		String reply = enter.next();
		if(reply.equalsIgnoreCase("quit")) {
			continuing = false;
		}else {
			continuing = true;
		}
	}
	enter.close();
}
}
	
		
	
		
	


