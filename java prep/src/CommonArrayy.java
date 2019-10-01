
public class CommonArrayy {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4};
	int[] a1= {4,3,2,1};
	if(a.length!=a1.length) {
		System.out.println("array size are not equal");
	}
	else
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<=i;j++) {
			if(a[i]==a1[j]) {
				System.out.println(a[j]);
			}
		}
	}
}
}
