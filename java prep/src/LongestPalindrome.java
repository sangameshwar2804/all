
public class LongestPalindrome {
	public void chkLongPai(String str)
	{
		String rev="";
		for(int i=0;i<=str.length()-1;i++)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not a pindrome");
	}
public static void main(String[] args) {
	LongestPalindrome l=new LongestPalindrome();
	l.chkLongPai("saa");
}
}
