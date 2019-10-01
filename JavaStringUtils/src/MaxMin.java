
public class MaxMin {
public static void max(int[] arr) {
	int temp=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(temp<arr[i]) {
			temp=arr[i];
		}
	}
	System.out.println(temp);
}public static void min(int[] arr) {
	int temp=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(temp>arr[i]) {
			temp=arr[i];
		}
	}
	System.out.println(temp);
}

public static void main(String[] args) {
	int[] arr1= {1,2,3,45};
	max(arr1);
	min(arr1);
}
}

