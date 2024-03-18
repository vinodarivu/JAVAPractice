package Ruff;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * ArrayList [1,2,3,4...]
 * ArrayList [1,3,5,13]
 * 
 * 
 * 
 * 
 * */

public class PS {

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(60);

		List<Integer> secondLs = new ArrayList<>();
		secondLs.add(1);
		secondLs.add(3);
		secondLs.add(5);

		List<Integer> deletedList = new ArrayList<>();

		for (int i = 0; i < secondLs.size() - 1; i++) {
			System.out.println("i===>" + i);
			System.out.println("i element from list===>" + secondLs.get(i));

			deletedList.add(ls.get(secondLs.get(i)));

		}
		System.out.println(deletedList);
		ls.removeAll(deletedList);
		System.out.println(ls);

	}

}
