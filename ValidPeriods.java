import java.util.Scanner;

public class ValidPeriods {
public static void main(String args[]) {
     try (Scanner s = new Scanner(System.in)) {
		System.out.println("Enter the number valid time periods");
		System.out.println("Enter the Hour");
		int h = s.nextInt();
		System.out.println("Enter the Minutes");
		int m = s.nextInt();
		System.out.println("Enter the Seconds");
		int ss = s.nextInt();
		System.out.println("Time is " + h + ":" + m + ":" + ss);

		if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && ss >= 0 && ss <= 59) {
		    System.out.println("Valid periods " + h + ":" + m + ":" + ss);
		} else {
		    System.out.println("invalid peeriods is ");
		}
	}
  }
}