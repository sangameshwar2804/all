import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElement {
public static void getDuplicateCount(String str) {
	HashMap<Character, Integer>hm=new HashMap<>();
	for(char ch:str.toCharArray()) {
		if(hm.containsKey(ch)) {
			hm.put(ch, hm.get(ch)+1);
		}
		else {
			hm.put(ch,1);
		}
	}
	for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
		if(entry.getKey()>1) {
			System.out.println(entry.getKey()+" -"+entry.getValue());
		}
	}
}
public static void main(String[] args) {
	getDuplicateCount("helloheo");
}
}
