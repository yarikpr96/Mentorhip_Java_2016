package generics;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;


public class MyMapTest {

	@Test
	public void putTest() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		int actual = 1;
		int expected = map.showSetOfKeys().size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void removeByKeyTest() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		map.removeByKey(45);
		boolean actual = map.showListOfValues().isEmpty();
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void removeObjectByValueTest() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		map.removeObjectByValue("asd");
		Object actual = map.showListOfValues().get(0);
		Object expected = null;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void showSetOfKeysTest() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		Set actual = map.showSetOfKeys();
		Set set = new HashSet();
		set.add(45);
		Set expected = set;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void showListOfValues() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		List actual = map.showListOfValues();
		List list = new ArrayList<>();
		list.add("asd");
		List expected = list;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void showMyMapTest() {
		MyMap<Integer, String> map = new MyMap<>();
		map.put(45, "asd");
		Set actual = map.showMyMap();
		Set set = new HashSet();
		set.add(new MyEntry(45, "asd"));
		Set expected = set;
		Assert.assertEquals(expected, actual);
	}
}
