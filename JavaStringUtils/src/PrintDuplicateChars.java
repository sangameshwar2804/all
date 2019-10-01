import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChars {
public static void getDplicateChars(String str) {
	char[] ch=str.toCharArray();
	HashMap<Character, Integer>hm=new HashMap<>();
	for(char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
	}
	for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}
public static void main(String[] args) {
	getDplicateChars("helllooh");
}
}
