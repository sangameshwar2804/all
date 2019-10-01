package Com.wbl.main;

public class Vowesl {
public int countVowels(String ipdata) {
	String s=ipdata.toLowerCase();
	char[] ch=s.toCharArray();
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u') {
			count++;
		}
	}
	return count;
}
}
