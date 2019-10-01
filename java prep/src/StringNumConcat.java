
public class StringNumConcat {
	String s="hello";
	String str=s.toLowerCase();
	char[] ch=str.toCharArray();
	int count=0;
	int a=0,e=0,i=0,o=0,u=0;
	public int countVowels() {
		
	
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a') 
				a++;
			System.out.println(a);
			if(ch[i]=='e') 
				e++;
			System.out.println(e);
			if(ch[i]=='u') 
				u++;
			System.out.println(u);
			if(ch[i]=='i') 
				i++;
			System.out.println(i);
			if(ch[i]=='o') 
				o++;
			System.out.println(u);
		}
	return count;
	}
public static void main(String[] k) {
	StringNumConcat ssn=new  StringNumConcat();
	ssn.countVowels();
	
}
}