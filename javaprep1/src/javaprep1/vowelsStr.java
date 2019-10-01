package javaprep1;

public class vowelsStr {
public static void main(String[] args) {
	String s="aeiouaeiou";
	int count=0;
	String s1=s.toLowerCase();
	for(int j=0;j<s1.length();j++)
	{
		char ch=s1.charAt(j);
		if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
			count++;
				}
	}
System.out.println(count);	
}
}
