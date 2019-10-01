package codewars;

public class RevSentence {
public static void main(String[] args) {
String s="iaa";
String rev="";
for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
if(rev.equals(s)) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
}
}
