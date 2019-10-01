
public class String2 {
	

		public static void main(String[] args) {

			String str = "java is a programing language";
			String result = reverseWhiteSpace(str);
			System.out.println(result);
		}

		public static String reverseWhiteSpace(String str) {

			int count = 0;
			char[] ch = str.toCharArray();
			char[] temp = new char[ch.length];
			
			String rev = "";
			
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] != ' ') {
					temp[count] = ch[i];
					count++;
				}
			}
			
			for (int i = 0; i <count; i++) {
				rev = rev+temp[i];
			}
			return rev;
		}
	}

