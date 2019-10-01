
public class Prrime {
	public void checkPrime(int a) {
		int count=0;
		if(a<2)
			System.out.println("enter the vales from 2");
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
	
		}
	
		if(count==2) {
			System.out.println("prime");
		}
		else
			System.out.println("Not a prime");
	}
public static void main(String[] args) {
	Prrime p=new Prrime();
	p.checkPrime(17);
}
}
