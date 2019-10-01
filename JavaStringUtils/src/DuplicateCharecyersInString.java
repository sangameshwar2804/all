import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharecyersInString {
public static char duplicateCharsInStr(String str) {
	char[] ch=str.toCharArray();
	Map<Character, Integer> hm=new HashMap<>();
	for(char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else
			hm.put(c, 1);
	}
	
	for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
	
		}
	}
	return 0;
}
public static void main(String[] args) {
	duplicateCharsInStr("baa");
}
}
