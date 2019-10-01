import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedNumberInArray {
public static void getMostRepetedNum(int[] arr) {
	LinkedHashMap<Integer, Integer>hm=new LinkedHashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i],hm.get(arr[i])+1);
		}
		else {
			hm.put(arr[i],1);
		}
	}
	for(Map.Entry<Integer,Integer>entry:hm.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
			break;
		}
	}
}
public static void main(String[] args) {
	int[] arr1= {2,2,8,4,4,5,1};
	getMostRepetedNum(arr1);
}
}
