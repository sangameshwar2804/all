import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicatesHashMap {
public static void removeDuplicates(String str) {
	HashMap<Character,Integer>hm=new HashMap<>();
	for(int i=0;i<str.length();i++) {
		if(hm.containsKey(str.charAt(i))) {
			hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
		}
		else {
			hm.put(str.charAt(i), 1);
		}
	}
	
	String s="";
	for(Map.Entry<Character, Integer>entry:hm.entrySet())
	{
		if(entry.getValue()<=1) {
			s=s+entry.getKey();
		}

	}
	System.out.println(s);
}
public static void main(String[] args) {
removeDuplicates("bcaa");	
}
}
