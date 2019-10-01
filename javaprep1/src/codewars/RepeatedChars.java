package codewars;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {
public static int getMulipleRep(String str ) {
String s=str.toLowerCase();
char[] ch=s.toCharArray();
HashMap<Character, Integer>hm=new HashMap<>();
for(int i=0;i<s.length();i++) {
	if(hm.containsKey(ch[i])) {
		hm.put(ch[i],hm.get(ch[i])+1);
	}
	else {
		hm.put(ch[i], 1);
	}
}
int count=0;
for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
	if(entry.getValue()>1) {
		count=count+1;
	}
	
}
System.out.println(count);
return count;
}
public static void main(String[] args) {
	getMulipleRep("AB");
}
}
//sample i/p:ABBA -o/p:2,i/p:Indivisibilities -o/p:2, i/p:indivisibility -o/p:1 ,i/p:aabbcde -o/p:2,i/p:abcde -o/p:0