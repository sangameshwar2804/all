package Com.wbl.main;

public class Finally {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		int c=a/b;
	} catch (NullPointerException e) {
		System.out.println("null pointer exception");
	}
	catch (ArithmeticException ae) {
		System.out.println("Aithmetic exception");
	}
	finally {
		System.out.println("finally");
	}
}

}
