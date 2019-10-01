package codewars;

public class StrinNum {
	public static void main(String[] args) {
		String s = "1234as5";
		int len = s.length();
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == '0' | ch[i] == '1' | ch[i] == '2' | ch[i] == '3' | ch[i] == '4' | ch[i] == '5' | ch[i] == '6'
					| ch[i] == '7' | ch[i] == '8' | ch[i] == '9') {
				count = count + 1;
			}
		}
		System.out.println(len + " " + count);
		if (len == count) {
			System.out.println("true");
		} else
			System.out.println("false");
	}
}
