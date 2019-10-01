import java.util.HashSet;

public class RemoveDuplicatesInArray {
public static void deleteDuplicates(int[] arr) {
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		hs.add(arr[i]);
	}
	System.out.println(hs.toString());
}
public static void main(String[] args) {
	int[] arr1= {1,1,2,3,2,4};
	deleteDuplicates(arr1);
}
}
