
public class PrimeArray {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	int count=0;
	for(int i=2;i<arr.length;i++) {
if(arr[i]%i==0) {
	count++;
}
	if(count==2) {
		System.out.println(arr[i]+"is prime");
	}
	else
		System.out.println(arr[i]+"is not aprime");

}
	
}
}