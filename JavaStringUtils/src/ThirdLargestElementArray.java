import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdLargestElementArray {
public static int findLargest(int[] arr) {
	int indexOfArr=Arrays.asList(arr).indexOf(5);
	System.out.println(indexOfArr);
	return indexOfArr;
	
}
public static void main(String[] args) {
	int[] arr1= {1,2,3,4,5};
	findLargest(arr1);
}
}
