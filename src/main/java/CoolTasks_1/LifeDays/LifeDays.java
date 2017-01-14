package CoolTasks_1.LifeDays;

import java.util.Scanner;

public class LifeDays {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your number");
		int n = sc.nextInt();
		
		while (n > 0) {
			builder.append(n % 2);
			n /= 2;
		}
		builder.reverse();
		
		System.out.println("Your binary number is");
		System.out.println(builder);
	}

}
