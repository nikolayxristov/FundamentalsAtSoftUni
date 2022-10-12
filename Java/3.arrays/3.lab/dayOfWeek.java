import java.util.Scanner;

public class dayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] days = {
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
			"Sunday"
		};

		int n = Integer.parseInt(scanner.nextLine());

		if (n >= 1 && n < 8) {
			System.out.println(days[n - 1]);
		
		} else {
			System.out.println("Invalid day!"); 
		}
	}
}	
