import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChaarecters {
	public static void checkFirstNonrepeating(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		char ch1 = str.charAt(0);
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				ch1 = entry.getKey();
				System.out.println(ch1);
				break;
			}
		}
	}

	public static void main(String[] args) {
		checkFirstNonrepeating("cabb");
	}
}
