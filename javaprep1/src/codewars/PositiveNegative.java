package codewars;

public class PositiveNegative {
public static int getPosNeg(int num) {
	if(num==0) {
		return 0;
	}
	else if(num>=1) {
		return -num;
	}
	int a=0;
	if(num<=-1) {
		a=-num;
	}
	return a;
}
public static void main(String[] args) {
	System.out.println(getPosNeg(2));
}
}
