
public class String1 {
public static void main(String[] args) {
	String str="sangameshwar Aryav";
	char[] ch=str.toCharArray();
	char[] temp=new char[ch.length];
	int count=0;
	String rev="";
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=' ') {
			temp[count]=ch[i];
			count++;
		}
	}
	for(int i=0;i<count;i++) {
		rev=rev+temp[i];
	}
	System.out.println(rev);
}
}
