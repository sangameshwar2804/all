package javaprep1;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 1, 5, 4 };
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else
				hm.put(arr[i], 1);
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() >= 0) {
				System.out.println(entry.getKey() + "-" + entry.getValue());
			}
		}
	}
}
