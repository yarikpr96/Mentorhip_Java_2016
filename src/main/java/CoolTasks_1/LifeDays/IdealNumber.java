package CoolTasks_1.LifeDays;

import java.util.Scanner;

public class IdealNumber {

	public static void main(String[] args) {

		int sum = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your number");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		if (n == sum) {
			System.out.println("Your number is ideal");
		} else {
			System.out.println("Your number is not ideal");
		}
	}

}
