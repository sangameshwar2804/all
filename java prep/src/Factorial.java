
public class Factorial {
	
public int findFact(int num) {
	int a=1;
	for(int i=1;i<=num;i++) {
		a=a*i;
	}
	System.out.println(a);
	return a;
}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.findFact(5);
}
}
