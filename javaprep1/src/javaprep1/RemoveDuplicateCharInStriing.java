package javaprep1;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharInStriing {
public static void main(String[] args) {
	String str="Whiteboxlearning";
	char[] ch=str.toCharArray();
	Map<Character, Integer> hm=new HashMap<>();
	for(int c:ch) {
		if(hm.containsKey(ch[c])) {
			hm.put(ch[c], hm.get(ch[c])+1);
			
		}
		else {
			hm.put(ch[c],1);
		}
	}
	for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
		if(entry.getValue()<=1) {
			System.out.print(entry.getKey());
		}
	}
}
}
