package TestNG;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
public  static String getDuplicateChars(String ip) {
	String tem="";
	String s=ip.toLowerCase();
	char[] ch=s.toCharArray();
	Map<Character, Integer>hm=new HashMap<Character, Integer>();
	for(char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
		
		for(Map.Entry<Character,Integer>entry:hm.entrySet()) {
			if(entry.getValue()<=1) {
				tem=tem+entry.getKey();
			}
		}
	}
	return tem;
}
public static void main(String[] args) {
	System.out.println(getDuplicateChars("hello"));
}
}
