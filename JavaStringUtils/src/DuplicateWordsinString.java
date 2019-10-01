import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsinString {
public static void getDuplicate(String str) {
	String[] s=str.split(" ");
	HashMap<String, Integer>hm=new HashMap<>();
	for(String s1:s) {
		if(hm.containsKey(s1)) {
			hm.put(s1, hm.get(s1)+1);
		}
		else {
			hm.put(s1, 1);
		}
	}
	int count=1;
	String temp = "";
	for(Map.Entry<String, Integer>entry:hm.entrySet()) {
		if(entry.getValue()>count) {
			
			count = entry.getValue();
			temp=entry.getKey();
		}
	}
	System.out.println(temp);
}
public static void main(String[] args) {
	getDuplicate("seven eight eight seven eight six");
}
}
