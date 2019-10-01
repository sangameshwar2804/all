package com.wbl.logic;

import java.util.HashSet;

public class RemoveDuplicateInArray {
	public int getArraySize(int[] ar) {
		if (ar.length <= 1 || ar==null) {
			return 0;
		} 
		else {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int i = 0; i < ar.length; i++) {
				hs.add(ar[i]);
			}
			int arLength = hs.size();
			return arLength;
		}
	}
}
