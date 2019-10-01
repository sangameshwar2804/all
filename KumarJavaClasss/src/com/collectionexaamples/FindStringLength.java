package com.collectionexaamples;

import java.util.ArrayList;
import java.util.List;

public class FindStringLength {
	public String getLargestString(List<String> list) {
		String result = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			int length = list.get(i).length();
			System.out.println(length);
			if (length > result.length()) {
				result = list.get(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FindStringLength fs = new FindStringLength();
		List<String> ls = new ArrayList<>();
		ls.add("hello world1");
		ls.add("hello world");
		ls.add("hi");
		System.out.println(fs.getLargestString(ls));
	}
}
