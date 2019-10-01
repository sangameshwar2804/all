import java.util.HashMap;

public class OccuranceOfChar {
public static void getCharOccurance(String str) {
	char[] ch=str.toCharArray();
	HashMap<Character,Integer>hm=new HashMap<>();
	for(char c:ch) {
		if(!hm.containsKey(c)) {
			hm.put(c,1);
		}
		else
		{
			hm.put(c,hm.get(c)+1);
		}
	}
	System.out.println(hm);
}
public static void main(String[] args) {
	getCharOccurance("hello");
}
}
