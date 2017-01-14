package CoolTasks_1.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2 {

	public static void main(String[] args) throws IOException {

		int count1 = 0;
		int count2 = 0;
		int count5 = 0;
		int count10 = 0;
		int count20 = 0;
		int count50 = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("insert amount");
		String s = reader.readLine();
		int n = Integer.parseInt(s);
		while (n >= 50) {
			n -= 50;
			count50++;
		}
		while (n >= 20) {
			n -= 20;
			count20++;
		}
		while (n >= 10) {
			n -= 10;
			count10++;
		}
		while (n >= 5) {
			n -= 5;
			count5++;
		}
		while (n >= 2) {
			n -= 2;
			count2++;
		}
		while (n >= 1) {
			n -= 1;
			count1++;
		}
		System.out.println("Quantity of 50 " + count50);
		System.out.println("Quantity of 20 " + count20);
		System.out.println("Quantity of 10 " + count10);
		System.out.println("Quantity of 5 " + count5);
		System.out.println("Quantity of 2 " + count2);
		System.out.println("Quantity of 1 " + count1);
		}
		
	}

