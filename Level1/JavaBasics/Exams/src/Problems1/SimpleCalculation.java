package Problems1;

import java.util.Scanner;

public class SimpleCalculation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println(0);
		}
		 if (x == 0 && y !=0) {
			System.out.println(5);
		}
		 if (x != 0 && y == 0) {
			System.out.println(6);
		}
		 if (x > 0 && y > 0) {
			System.out.println(1);
		}
		 if (x < 0 && y > 0) {
			System.out.println(2);
		}
		 if (x < 0 && y < 0) {
			System.out.println(3);
		}
		 if (x > 0 && y < 0) {
			System.out.println(4);
		}
	}
}