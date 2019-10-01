import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharecters {
public static void checkNonRepeated(String str) {
	char[] c=str.toCharArray();
	HashMap<Character, Integer> hm=new HashMap();
	for(char ch:c) {
		if(hm.containsKey(ch)) {
			hm.put(ch, hm.get(ch)+1);
		}
	}
	for(Entry<Character, Integer> entry:hm.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
		}
	}
}
public static void main(String[] args) {
	checkNonRepeated("bbccef");
}
}
