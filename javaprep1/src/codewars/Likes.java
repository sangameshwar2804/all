package codewars;

public class Likes {
public static String getLikesString(String... str) {
	if(str.length<1) {
		return "no one likes this";
	}
	else if(str.length==1) {
		return str[0]+" "+"likes this";
	}
	
	return"";
}
public static void main(String[] args) {
	String[] str= {""};
	System.out.println(getLikesString(str));
}
}
