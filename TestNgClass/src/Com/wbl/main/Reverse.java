package Com.wbl.main;

public class Reverse {
	public String rev(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
}
