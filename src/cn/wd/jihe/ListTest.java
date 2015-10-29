package cn.wd.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(8);
		list.add(1);
		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
	}
}
