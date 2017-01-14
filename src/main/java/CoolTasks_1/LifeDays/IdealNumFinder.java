package CoolTasks_1.LifeDays;

import java.util.Scanner;

public class IdealNumFinder {

	public static void main(String[] args) {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your start number");
		int start = sc.nextInt();
		System.out.println("Insert your end number");
		int end = sc.nextInt();
		
		for (number = start; number < end; number++) {
			int sum = 0;
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}
			
			if (number == sum) {
				System.out.println(number + " is ideal number");
			}
		
		}
	
	
	
	}

}
