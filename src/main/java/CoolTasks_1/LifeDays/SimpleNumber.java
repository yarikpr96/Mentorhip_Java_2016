package CoolTasks_1.LifeDays;

public class SimpleNumber {

	public static void main(String[] args) {

		
		for (int i = 2; i < 100000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					System.out.println(i + " is simpleNumber");
				}
			}
		}
	}

}
