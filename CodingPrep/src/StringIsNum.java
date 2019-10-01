
public class StringIsNum {
public static void checkNum(String str) {
	String s=str.toLowerCase();
	char[] ch=s.toCharArray();
	int count=0;
	int length=s.length();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' ||ch[i]=='6' ||ch[i]=='7' ||ch[i]=='8' || ch[i]=='9' ||ch[i]=='0') {
			count++;
		}
	}
	System.out.println(count+" "+length);
	if(count==length) {
		System.out.println("true");
	
	}
	else {
		System.out.println("false");
	}
}
public static void main(String[] args) {
	checkNum("g123");
}
}
