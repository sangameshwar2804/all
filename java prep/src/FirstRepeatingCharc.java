import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharc {
public static void main(String[] args) {
String str="hello";
	Map<Character,Integer>hm=new HashMap<>();
for(int i=0;i<str.length();i++) {
	if(hm.containsKey(str.charAt(i))) {
		hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
	}
	else {
		hm.put(str.charAt(i), 1);
	}
}
char ch=str.charAt(0);
for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
	if(entry.getValue()==1) {
		ch=entry.getKey();
		break;
	}
}
System.out.println(ch);
}
}
