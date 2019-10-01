import java.util.HashMap;
import java.util.Map;

public class Walmart {
public static void main(String[] args) {
	String str="hello";
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
			System.out.print(entry.getValue());
		}
		else if (entry.getValue()<=1) {
			System.out.print(entry.getKey());
			
		}
}
}
}
