package generics;

import java.util.*;

public class MyMap<K, V> {
	private Set<MyEntry<K, V>> set;

	public MyMap() {
		set = new HashSet<MyEntry<K, V>>();
	}

	public void put(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
	}

	public void removeByKey(K key) {
		for (MyEntry<K, V> myEntry : set) {
			if (myEntry.getK() == key) {
				set.remove(myEntry);
			}
		}
	}

	public void removeObjectByValue(V value) {
		for (MyEntry<K, V> myEntry : set) {
			if (myEntry.getV().equals(value)) {
				myEntry.setV(null);
			}
		}
	}

	public Set showSetOfKeys() {
		Set<K> setKeys = new HashSet<>();
		for (MyEntry<K, V> myEntry : set) {
			setKeys.add(myEntry.getK());
		}
		return setKeys;
	}

	public List showListOfValues() {
		List<V> list = new ArrayList<>();
		for (MyEntry<K, V> myEntry : set) {
			list.add(myEntry.getV());
		}
		return list;
	}

	public Set showMyMap() {
		//for (MyEntry<K, V> myEntry : set) {
			//System.out.println(myEntry);
		//}
		return set;
	}
}
