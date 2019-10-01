import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
public static void getDuplicates(int[] arr) {
	HashMap<Integer, Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i],hm.get(arr[i])+1);
		}
		else {
			hm.put(arr[i], 1);
		}
	}
	for(Map.Entry<Integer, Integer>entry:hm.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
}
public static void main(String[] args) {
	int[] arr= {1,1,2,2,5};
	getDuplicates(arr);
}
}
