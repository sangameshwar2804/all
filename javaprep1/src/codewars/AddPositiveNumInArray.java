package codewars;

public class AddPositiveNumInArray {
public static int getPosAdd(int[] ar) {
	int count=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>=1) {
			count=count+ar[i];
		}
	}
	return count;
}
public static void main(String[] args) {
	int[] ar= {1,-1,2,-2};
	System.out.println(getPosAdd(ar));
}
}
