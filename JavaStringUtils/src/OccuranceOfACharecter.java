import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfACharecter {
public static void findOccurance(String str) {
	HashMap<Character, Integer> hm=new HashMap<>();
	for(int i=0;i<str.length();i++) {
		if(hm.containsKey(str.charAt(i))) {
			hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
		}
		else
		{
			hm.put(str.charAt(i), 1);
		}
	}
	int mostRepeatedTimes=0;
	char mostRepeatedChar=str.charAt(0);
for(Entry<Character, Integer> entry:hm.entrySet()) {
	if(entry.getValue()>mostRepeatedTimes) {
		mostRepeatedChar=entry.getKey();
		mostRepeatedTimes=entry.getValue();
	}
}
System.out.println(mostRepeatedChar);
}
public static void main(String[] args) {
	findOccurance("bbbccaaa");
}
}
