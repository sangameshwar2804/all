import java.util.Arrays;

public class Anagram {
public static void isAnagram(String a,String b) {
	int len1=a.length();
	int len2=b.length();
	if(len1!=len1) {
		System.out.println("Not Anagram");
	}
	char[] c=a.toCharArray();
	char[] c1=b.toCharArray();
	Arrays.sort(c);
	Arrays.sort(c1);
	if(Arrays.equals(c, c1)) {
		System.out.println("Anagram");
	}
	else
		System.out.println("not anagram");
}
public static void main(String[] args) {
	isAnagram("abc","cacb");
}
}
