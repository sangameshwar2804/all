
public class AvergeValueOfArray {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int avg=0;
	int total;
	for(int i=0;i<a.length;i++) {
		avg=avg+a[i];
	}
	total=avg/a.length;
	System.out.println(total);
}
}
