package generics;

import java.util.*;

public class Main {
	
	public static void main(String...args){
		MyMap<String,Integer> map = new MyMap<>();
		map.put("a", 45);
		map.put("b", 20);
		map.put("c", 18);
		map.put("d", 3);
		map.put("e", 100);
		
		System.out.println(map.showMyMap());
		
		
	}
}
