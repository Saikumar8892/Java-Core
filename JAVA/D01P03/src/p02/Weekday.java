package p02;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the week number: ");
		int weekNumber = scanner.nextInt();
		
		if(weekNumber >= 1 && weekNumber <= 7) {
		switch(weekNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				break;
		}
		}else {
				System.out.println("Invalid Input");
		}
	}
}