package generics.Test;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args) {

		int[] a = {-4, -3, 11, 3, 4, 4, -4, 6, -1, 9, -10, 11};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			min = min(min, a[i]);
			max = max(max, a[i]);
		}

		System.out.println(min);
		System.out.println(max);
	}
}
