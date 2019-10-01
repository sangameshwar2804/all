import java.util.HashMap;

public class ArrayContainsGivenNumber {
public static void chckGivenNumber(int[] arr) {
	int num=2;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
public static void main(String[] args) {
	int[] arr1={1,2,3,4,5};
	chckGivenNumber(arr1);
}
}
