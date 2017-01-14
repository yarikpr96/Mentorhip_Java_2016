package CoolTasks_1.LifeDays;

import java.util.Random;

public class Text {

	public static void main(String[] args) {
		
		Random r = new Random();
		int sumsMom = 0;
		
		char m[] = new char[26];
		char randomText[] = new char[1000];
		
		for (int j = 0; j < m.length; j++) {
			m[j] = (char)(j + 65);
		}
		
		for (int i = 0; i < randomText.length; i++) {
			randomText[i] = (char) (r.nextInt(26)+65);
		}
		
		for (int y = 0; y < m.length; y++) {
			int sum = 0;
		for (int x = 0; x < randomText.length; x++) {
			if (randomText[x] == m[y]) {
				sum ++;
			}
		}
		System.out.println(m[y] + " " + sum);
		sumsMom += sum;
		}
		System.out.println("sum = " + sumsMom);
		
		
		
	}
}
