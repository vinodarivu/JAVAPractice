package Ruff;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * String s = "ABCDEABC";
 * 
 * 
 * A, B, C, D, E,
 * 
 * D
 * 
 * 
 * 
 * 
 * */

public class Manhattan {

	public static void main(String args[]) {

		String s = "ABCDEABC";

		char[] c = s.toCharArray();

		Map<String, Integer> mp = new LinkedHashMap();
		for (int i = 0; i < c.length; i++) {
			if (mp.containsKey(String.valueOf(c[i]))) {
				mp.put(String.valueOf(c[i]), mp.get(String.valueOf(c[i])) + 1);
			}else {
			mp.put(String.valueOf(c[i]), 1);}
		}

		Set<Map.Entry<String, Integer>> set = mp.entrySet();

		for (Map.Entry<String, Integer> map : set) {
			if (map.getValue() == 1) {
				System.out.println(map.getKey());
				break;
			}

		}

//
//		for (int i = 0; i < c.length; i++) {
//
//			if (s.lastIndexOf(c[i]) > 1) {
//
//			} else {
//				System.out.println(c[i]);
//			}
//
//		}

	}

}
