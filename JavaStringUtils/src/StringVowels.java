
public class StringVowels {
public static int checckVowels(String str) {
	String s=str.toLowerCase();
	int count=0;
	int count2=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
			count
		++;
	}
		else
		{
			count2++;
		}
	}
	System.out.println(count);
	System.out.println(count2);
	return count;
}
public static void main(String[] args) {
	checckVowels("A");
}
}
